package com.tdeado.factory.service;

import com.tdeado.factory.dao.ModuleMapper;
import com.tdeado.factory.entity.Module;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ModuleServiceTest {

    @Autowired
    private ModuleMapper moduleMapper;
    @Test
    public void getModuleAll() {

        List<Module> modules = moduleMapper.queryModule(null);

        System.out.println(modules.toString());

    }
}