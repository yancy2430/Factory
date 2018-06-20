package com.tdeado.factory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.factory.entity.Piecework;
/**
*  @author 
*/
public interface PieceworkBaseMapper {

    int insertPiecework(Piecework object);

    int updatePiecework(Piecework object);

    List<Piecework> queryPiecework(Piecework object);

    Piecework queryPieceworkLimit1(Piecework object);

}