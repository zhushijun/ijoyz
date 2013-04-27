package com.ijoyz.moka.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.ijoyz.moka.model.meta.UserMeta;

public interface UserMapper extends MocaMapper {

	@Select("select * from tb_user where USER_NAME=#{userName} and PASS=#{pass}")
	@Results(value={@Result(property="id",column="ID",id=true),@Result(property="userName",column="USER_NAME"),@Result(property="gameUserId",column="GAME_USER_ID"),@Result(property="role",column="ROLE")})
	UserMeta getUserMeta(@Param("userName") String userName,
			@Param("pass") String pass);

	@Insert("insert into tb_user(ID,USER_NAME,PASS,GAME_USER_ID,ROLE) values(#{meta.id},#{meta.userName},#{meta.pass},#{meta.gameUserId},#{meta.role})")
	void addMeta(@Param("meta") UserMeta meta);

}
