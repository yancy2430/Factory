package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.OrderProductList;
/**
*  @author 
*/
public interface OrderProductListBaseMapper {

    int insertOrderProductList(OrderProductList object);

    int updateOrderProductList(OrderProductList object);

    List<OrderProductList> queryOrderProductList(OrderProductList object);

    OrderProductList queryOrderProductListLimit1(OrderProductList object);

}