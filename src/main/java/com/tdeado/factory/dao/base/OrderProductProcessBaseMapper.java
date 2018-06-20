package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.OrderProductProcess;
/**
*  @author 
*/
public interface OrderProductProcessBaseMapper {

    int insertOrderProductProcess(OrderProductProcess object);

    int updateOrderProductProcess(OrderProductProcess object);

    List<OrderProductProcess> queryOrderProductProcess(OrderProductProcess object);

    OrderProductProcess queryOrderProductProcessLimit1(OrderProductProcess object);

}