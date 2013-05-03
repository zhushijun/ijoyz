package com.ijoyz.moka.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ijoyz.moka.model.League;

/**
 * 联赛Mapper
 * @author user
 *
 */
public interface LeagueMapper extends MocaMapper {
	@Select("select * from TB_LEAGUE where GANG_ID = #{gangId}")
	List<League> getLeaguesByGangId(@Param("gangId")long gangId);
	
	
}
