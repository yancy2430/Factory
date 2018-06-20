package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.StorageLocation;
/**
*  @author 
*/
public interface StorageLocationBaseMapper {

    int insertStorageLocation(StorageLocation object);

    int updateStorageLocation(StorageLocation object);

    List<StorageLocation> queryStorageLocation(StorageLocation object);

    StorageLocation queryStorageLocationLimit1(StorageLocation object);

}