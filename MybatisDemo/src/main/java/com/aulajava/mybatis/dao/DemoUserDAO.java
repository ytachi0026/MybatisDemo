package com.aulajava.mybatis.dao;

import java.util.List;

import com.aulajava.mybatis.bean.DemoUser;

public interface DemoUserDAO {
	public abstract List<DemoUser> getUserByCode();
	public abstract List<DemoUser> getAllUsers();
}
