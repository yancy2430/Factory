package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.ProductCate;
/**
*  @author 
*/
public interface ProductCateBaseMapper {

    int insertProductCate(ProductCate object);

    int updateProductCate(ProductCate object);

    List<ProductCate> queryProductCate(ProductCate object);

    ProductCate queryProductCateLimit1(ProductCate object);

}