package com.tdeado.factory.service.impl;

import com.tdeado.factory.dao.ModuleMapper;
import com.tdeado.factory.entity.Module;
import com.tdeado.factory.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ModuleServiceImpl implements ModuleService {
    @Autowired
    ModuleMapper moduleMapper;
    @Override
    public List<Module> getModuleAll() {
        List<Module> modules;
        modules = moduleMapper.queryModule(null);
        return modules;
    }
}
