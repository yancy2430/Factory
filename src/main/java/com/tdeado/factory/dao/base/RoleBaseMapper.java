package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.Role;
/**
*  @author 
*/
public interface RoleBaseMapper {

    int insertRole(Role object);

    int updateRole(Role object);

    List<Role> queryRole(Role object);

    Role queryRoleLimit1(Role object);

}