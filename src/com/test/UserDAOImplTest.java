package com.test;

import com.dao.UserDAO;
import com.dao.impl.UserDAOImpl;
import com.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDAOImplTest {

    UserDAO userdao = new UserDAOImpl();

    @Test
    public void queryUserByUserAccount() {
        if (userdao.queryUserByUserAccount("1765116032") != null) {
            System.out.println("用户存在");
            return;
        }
        System.out.println("不存在");

    }

    @Test
    public void queryUserByAccountAndPassword() {
        if (userdao.queryUserByAccountAndPassword("1765116032", "200102277") != null) {
            System.out.println("正确");
        } else {
            System.out.println("不对");
        }
    }

    @Test
    public void saveUser() {
        System.out.println(userdao.saveUser(new User("123456","123456")));
    }
}