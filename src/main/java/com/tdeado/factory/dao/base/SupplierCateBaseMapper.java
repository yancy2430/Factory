package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.SupplierCate;
/**
*  @author 
*/
public interface SupplierCateBaseMapper {

    int insertSupplierCate(SupplierCate object);

    int updateSupplierCate(SupplierCate object);

    List<SupplierCate> querySupplierCate(SupplierCate object);

    SupplierCate querySupplierCateLimit1(SupplierCate object);

}