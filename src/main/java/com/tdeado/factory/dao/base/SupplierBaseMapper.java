package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.Supplier;
/**
*  @author 
*/
public interface SupplierBaseMapper {

    int insertSupplier(Supplier object);

    int updateSupplier(Supplier object);

    List<Supplier> querySupplier(Supplier object);

    Supplier querySupplierLimit1(Supplier object);

}