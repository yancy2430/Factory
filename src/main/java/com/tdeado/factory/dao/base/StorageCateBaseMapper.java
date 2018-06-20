package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.StorageCate;
/**
*  @author 
*/
public interface StorageCateBaseMapper {

    int insertStorageCate(StorageCate object);

    int updateStorageCate(StorageCate object);

    List<StorageCate> queryStorageCate(StorageCate object);

    StorageCate queryStorageCateLimit1(StorageCate object);

}