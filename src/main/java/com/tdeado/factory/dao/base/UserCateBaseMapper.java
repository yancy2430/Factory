package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.UserCate;
/**
*  @author 
*/
public interface UserCateBaseMapper {

    int insertUserCate(UserCate object);

    int updateUserCate(UserCate object);

    List<UserCate> queryUserCate(UserCate object);

    UserCate queryUserCateLimit1(UserCate object);

}