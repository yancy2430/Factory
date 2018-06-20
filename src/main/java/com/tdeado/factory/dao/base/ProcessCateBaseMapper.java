package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.ProcessCate;
/**
*  @author 
*/
public interface ProcessCateBaseMapper {

    int insertProcessCate(ProcessCate object);

    int updateProcessCate(ProcessCate object);

    List<ProcessCate> queryProcessCate(ProcessCate object);

    ProcessCate queryProcessCateLimit1(ProcessCate object);

}