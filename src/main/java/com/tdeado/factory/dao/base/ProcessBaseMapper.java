package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.Process;
/**
*  @author 
*/
public interface ProcessBaseMapper {

    int insertProcess(Process object);

    int updateProcess(Process object);

    List<Process> queryProcess(Process object);

    Process queryProcessLimit1(Process object);

}