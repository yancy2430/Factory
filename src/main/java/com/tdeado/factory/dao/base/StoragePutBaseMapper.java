package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.StoragePut;
/**
*  @author 
*/
public interface StoragePutBaseMapper {

    int insertStoragePut(StoragePut object);

    int updateStoragePut(StoragePut object);

    List<StoragePut> queryStoragePut(StoragePut object);

    StoragePut queryStoragePutLimit1(StoragePut object);

}