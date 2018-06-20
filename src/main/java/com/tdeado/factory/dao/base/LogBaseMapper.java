package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.Log;
/**
*  @author 
*/
public interface LogBaseMapper {

    int insertLog(Log object);

    int updateLog(Log object);

    List<Log> queryLog(Log object);

    Log queryLogLimit1(Log object);

}