package com.ijoyz.moka.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ijoyz.moka.model.Gang;

public interface GangMapper extends MocaMapper{
	@Select("select * from TB_GANG gang inner join TB_USER_GANG ug on gang.id = ug.GANG_ID where ug.USER_ID = #{userId}")
	List<Gang> getGangsByUserId(@Param("userId")long userId);

}
