package com.tdeado.factory.service.impl;

import com.github.pagehelper.PageHelper;
import com.tdeado.factory.dao.UserMapper;
import com.tdeado.factory.entity.User;
import com.tdeado.factory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private int pagesize = 10;

    @Autowired
    private UserMapper userMapper;


    @Transactional //事务控制 需要抛出runtime异常
    @Override
    public boolean addUser(User user) {
        if (null!=user && user.getUserName().equals("")){
            int id = userMapper.insertUser(user);
            if (id>0){
                return true;
            }else {
                throw new RuntimeException("添加员工失败");
            }
        }else {
            throw new RuntimeException("参数不能为空");
        }
    }

    @Transactional //事务控制
    @Override
    public boolean editUser(User user) {
        if (null!=user && user.getUserName().equals("")){
            int id = userMapper.updateUser(user);
            if (id>0){
                return true;
            }else {
                throw new RuntimeException("编辑员工失败");
            }
        }else {
            throw new RuntimeException("参数错误");
        }
    }

    /**
     * 删除用户
     * @param userId
     * @return
     */
    @Transactional //事务控制
    @Override
    public boolean deleteUser(int userId) {

        if (userId>0){
            User user = new User();
            user.setStatus(2);
            int i = userMapper.updateUser(user);
            if (i>0){
                return true;
            }else {
                throw new RuntimeException("删除失败！请重试");
            }
        }else {
            throw new RuntimeException("删除失败！请重试");
        }
    }

    @Override
    public boolean deleteUsers(User user) {
        return false;
    }

    @Override
    public List<User> getUserList(int page,int pagesize,User user) {

        PageHelper.startPage(page, pagesize);
        List<User> users = userMapper.queryUser(user);
        return users;
    }

    @Transactional //事务控制
    @Override
    public boolean setDimission(int userId) {
        if (userId>0){
            User user = new User();
            user.setStatus(0);
            int i = userMapper.updateUser(user);
            if (i>0){
                return true;
            }else {
                throw new RuntimeException("操作成功！");
            }
        }else {
            throw new RuntimeException("设置失败！请重试");
        }
    }

    @Transactional //事务控制
    @Override
    public boolean setOnJob(int userId) {
        if (userId>0){
            User user = new User();
            user.setStatus(1);
            int i = userMapper.updateUser(user);
            if (i>0){
                return true;
            }else {
                throw new RuntimeException("操作成功！");
            }
        }else {
            throw new RuntimeException("设置失败！请重试");
        }
    }
}
