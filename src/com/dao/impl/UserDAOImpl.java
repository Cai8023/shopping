package com.dao.impl;

import com.dao.UserDAO;
import com.pojo.User;

/**
 * @author CaiKe
 * @create 2020/10/17
 */
public class UserDAOImpl extends BaseDAO implements UserDAO {

    @Override
    public User queryUserByUserAccount(String userAccount) {
        String sql = "select userId, account, password, authorityId from t_user where account = ?";
        return queryForOne(User.class, sql, userAccount);
    }

    @Override
    public User queryUserByAccountAndPassword(String userAccount, String password) {
        String sql = "select userId, account, password, authorityId from t_user where account = ? and password = ?";
        return queryForOne(User.class, sql, userAccount, password);
    }

    @Override
    public Integer saveUser(User user) {
        String sql = "insert into t_user(account, name, phone, password, email, qq, gender, image) values(?,?,?,?,?,?,?,?)";
        return update(sql, user.getAccount(), user.getName(), user.getPhone(), user.getPassword(), user.getEmail(), user.getQq(), user.getGender(), user.getPhoto());
    }
}