package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.Customer;
/**
*  @author 
*/
public interface CustomerBaseMapper {

    int insertCustomer(Customer object);

    int updateCustomer(Customer object);

    List<Customer> queryCustomer(Customer object);

    Customer queryCustomerLimit1(Customer object);

}