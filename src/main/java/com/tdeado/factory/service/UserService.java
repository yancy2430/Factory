package com.tdeado.factory.service;

import com.tdeado.factory.entity.User;

import java.util.List;

/**
 * 员工管理
 */
public interface UserService {

    /**
     * 添加员工
     * @param user
     * @return
     */
    boolean addUser(User user);

    boolean editUser(User user);

    boolean deleteUser(int userId);
    boolean deleteUsers(User user);

    /**
     *
     * @param page
     * @return
     */
    List<User> getUserList(int page,int pagesize,User user);

    /**
     * 设为离职
     */
    boolean setDimission(int userId);

    /**
     * 设为在职
     */
    boolean setOnJob(int userId);
}
