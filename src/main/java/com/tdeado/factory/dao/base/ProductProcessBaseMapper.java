package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.ProductProcess;
/**
*  @author 
*/
public interface ProductProcessBaseMapper {

    int insertProductProcess(ProductProcess object);

    int updateProductProcess(ProductProcess object);

    List<ProductProcess> queryProductProcess(ProductProcess object);

    ProductProcess queryProductProcessLimit1(ProductProcess object);

}