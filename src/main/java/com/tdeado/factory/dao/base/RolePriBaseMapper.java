package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.RolePri;
/**
*  @author 
*/
public interface RolePriBaseMapper {

    int insertRolePri(RolePri object);

    int updateRolePri(RolePri object);

    List<RolePri> queryRolePri(RolePri object);

    RolePri queryRolePriLimit1(RolePri object);

}