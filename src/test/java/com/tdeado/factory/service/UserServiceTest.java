package com.tdeado.factory.service;

import com.tdeado.factory.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void addUser() {
    }

    @Test
    public void editUser() {
    }

    @Test
    public void deleteUser() {
    }

    @Test
    public void getUserList() {

        List<User> users = userService.getUserList(1,10,null);
        System.out.printf(users.toString());

    }

    @Test
    public void setDimission() {
    }

    @Test
    public void setOnJob() {
    }
}