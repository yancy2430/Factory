package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.Privilege;
/**
*  @author 
*/
public interface PrivilegeBaseMapper {

    int insertPrivilege(Privilege object);

    int updatePrivilege(Privilege object);

    List<Privilege> queryPrivilege(Privilege object);

    Privilege queryPrivilegeLimit1(Privilege object);

}