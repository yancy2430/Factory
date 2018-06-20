package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.Model;
/**
*  @author 
*/
public interface ModelBaseMapper {

    int insertModel(Model object);

    int updateModel(Model object);

    List<Model> queryModel(Model object);

    Model queryModelLimit1(Model object);

}