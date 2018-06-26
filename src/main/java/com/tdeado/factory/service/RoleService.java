package com.tdeado.factory.service;

import com.tdeado.factory.entity.Role;

import java.util.List;

/**
 * 角色操作
 */
public interface RoleService {
    Role addRole(Role role);
    Role editRole(Role role);
    boolean delRole(int id);
    List<Role> getRoleList(int page,int size,Role role);
    Role getRole(Role role);
}
