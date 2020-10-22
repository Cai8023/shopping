package com.dao;

import com.pojo.User;

public interface UserDAO {

    /**
     * 根据用户名检测用户是否存在
     * @param userAccount 用户名
     * @return 用户对象
     */
    User queryUserByUserAccount(String userAccount);

    /**
     * 根据用户的账号和密码验证此用户的信息
     * @param userAccount 账号
     * @param password 密码
     * @return 用户对象
     */
    User queryUserByAccountAndPassword(String userAccount, String password);

    /**
     * 保存用户信息
     * @param user 用户对象
     * @return 返回-1则表示失败
     */
    Integer saveUser(User user);

}
