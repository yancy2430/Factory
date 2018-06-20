package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.Module;
/**
*  @author 
*/
public interface ModuleBaseMapper {

    int insertModule(Module object);

    int updateModule(Module object);

    List<Module> queryModule(Module object);

    Module queryModuleLimit1(Module object);

}