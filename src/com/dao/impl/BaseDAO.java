package com.dao.impl;

import com.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author CaiKe
 * @create 2020/6/7
 */
public abstract class BaseDAO {

    // 使用 DbUtils 操作数据库

    private QueryRunner queryRunner = new QueryRunner();

    /**
     * 用来执行，Insert/Update/Delete语句
     *
     * @return 如果返回-1，则表示执行失败
     */
    public int update(String sql, Object... args) {
        Connection conn = JDBCUtils.getConnection();
        try {
            return queryRunner.update(conn, sql, args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(conn);
        }
        return -1;
    }

    /**
     * 查询返回一个 javaBean的sql语句
     *
     * @param type 返回的对象类型
     * @param sql  执行的sql语句
     * @param args sql对应的参数
     * @param <T>  返回的类型的泛型
     * @return 对象
     */
    public <T> T queryForOne(Class<T> type, String sql, Object... args) {
        Connection conn = JDBCUtils.getConnection();
        try {
            return queryRunner.query(conn, sql, new BeanHandler<>(type), args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(conn);
        }
        return null;
    }

    /**
     * 查询返回多个javaBean的sql语句
     *
     * @param type 返回的对象类型
     * @param sql  执行的sql语句
     * @param args sql对应的参数
     * @param <T>  返回的类型的泛型
     * @return 对象
     */
    public <T> List<T> queryForList(Class<T> type, String sql, Object... args) {
        Connection conn = JDBCUtils.getConnection();
        try {
            return queryRunner.query(conn, sql, new BeanListHandler<>(type), args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(conn);
        }
        return null;
    }

    /**
     * 执行返回一行一列的sql语句
     *
     * @param sql  执行的sql语句
     * @param args sql对应的参数值
     * @return 数据
     */
    public Object queryForSingleValue(String sql, Object... args) {
        Connection conn = JDBCUtils.getConnection();
        try {
            return queryRunner.query(conn, sql, new ScalarHandler<>(), args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(conn);
        }
        return null;
    }

}