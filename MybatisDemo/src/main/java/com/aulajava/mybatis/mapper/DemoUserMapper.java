package com.aulajava.mybatis.mapper;

import java.util.List;

import com.aulajava.mybatis.bean.DemoUser;

public interface DemoUserMapper {
	
	public abstract List<DemoUser> getUserByCode(int userCode);
	public abstract List<DemoUser> getAllUserSP();
	

}
