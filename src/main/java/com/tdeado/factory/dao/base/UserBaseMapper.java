package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.User;
/**
*  @author 
*/
public interface UserBaseMapper {

    int insertUser(User object);

    int updateUser(User object);

    List<User> queryUser(User object);

    User queryUserLimit1(User object);

}