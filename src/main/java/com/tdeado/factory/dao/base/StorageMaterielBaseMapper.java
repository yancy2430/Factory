package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.StorageMateriel;
/**
*  @author 
*/
public interface StorageMaterielBaseMapper {

    int insertStorageMateriel(StorageMateriel object);

    int updateStorageMateriel(StorageMateriel object);

    List<StorageMateriel> queryStorageMateriel(StorageMateriel object);

    StorageMateriel queryStorageMaterielLimit1(StorageMateriel object);

}