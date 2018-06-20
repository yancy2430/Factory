package com.tdeado.factory.dao.base;

import com.tdeado.factory.entity.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminBaseMapperTest {

    @Autowired
    private AdminBaseMapper adminBaseMapper;
    @Test
    public void insertAdmin() {
    }

    @Test
    public void updateAdmin() {
    }

    @Test
    public void queryAdmin() {
        Admin admin = new Admin();
        admin.setId(1);
        List<Admin> a = adminBaseMapper.queryAdmin(admin);
        System.out.println(a);

    }

    @Test
    public void queryAdminLimit1() {
    }
}