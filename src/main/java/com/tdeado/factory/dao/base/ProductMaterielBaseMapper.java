package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.ProductMateriel;
/**
*  @author 
*/
public interface ProductMaterielBaseMapper {

    int insertProductMateriel(ProductMateriel object);

    int updateProductMateriel(ProductMateriel object);

    List<ProductMateriel> queryProductMateriel(ProductMateriel object);

    ProductMateriel queryProductMaterielLimit1(ProductMateriel object);

}