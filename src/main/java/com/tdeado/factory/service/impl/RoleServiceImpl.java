package com.tdeado.factory.service.impl;

import com.github.pagehelper.PageHelper;
import com.tdeado.factory.dao.RoleMapper;
import com.tdeado.factory.entity.Role;
import com.tdeado.factory.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;
    @Override
    public Role addRole(Role role) {
        if (roleMapper.insertRole(role)>0){
            return role;
        }
        throw new RuntimeException("数据库添加失败");
    }
    @Override
    public Role editRole(Role role) {
        if (roleMapper.updateRole(role)>0){
            return role;
        }
        throw new RuntimeException("数据库更新失败");
    }
    @Override
    public boolean delRole(int id) {
        if (roleMapper.deleteById(id)>0){
            return true;
        }
        return false;
    }
    @Override
    public List<Role> getRoleList(int page, int size, Role role) {
        PageHelper.startPage(page,size);
        return roleMapper.queryRole(role);
    }
    @Override
    public Role getRole(Role role) {
        Role role1=  roleMapper.queryRoleLimit1(role);
        if (null!=role1){
            return role1;
        }
        throw new RuntimeException("找不到角色");
    }
}
