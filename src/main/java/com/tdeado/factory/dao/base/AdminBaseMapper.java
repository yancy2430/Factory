package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.Admin;
/**
*  @author 
*/
public interface AdminBaseMapper {

    int insertAdmin(Admin object);

    int updateAdmin(Admin object);

    List<Admin> queryAdmin(Admin object);

    Admin queryAdminLimit1(Admin object);

}