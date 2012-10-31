package com.aulajava.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.aulajava.mybatis.bean.DemoUser;
import com.aulajava.mybatis.dao.DemoUserDAO;
import com.aulajava.mybatis.dao.MyBatisSQLSessionFactory;
import com.aulajava.mybatis.mapper.DemoUserMapper;

public class DemoUserDAOImpl implements DemoUserDAO{

	@Override
	public List<DemoUser> getUserByCode() {
		List<DemoUser> lstDemoUser = null;
		
		SqlSessionFactory sqlSessionFactory = MyBatisSQLSessionFactory.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		DemoUserMapper demoUserDAO = sqlSession.getMapper(DemoUserMapper.class);
		try {
			lstDemoUser  = demoUserDAO.getUserByCode(1);
		} catch (Exception e) {
			
		}finally{
			sqlSession.close();
		}
		return lstDemoUser;
	}

	@Override
	public List<DemoUser> getAllUsers() {
		List<DemoUser> lstDemoUser = null;
		SqlSessionFactory sqlSessionFactory = MyBatisSQLSessionFactory.getSqlSessionFactory(); 
		SqlSession sqlSession = sqlSessionFactory.openSession();
		DemoUserMapper demoUserDAO = sqlSession.getMapper(DemoUserMapper.class); 
		try {
			lstDemoUser =demoUserDAO.getAllUserSP();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			sqlSession.close();
		}
		
		return lstDemoUser;
	}
	
	

}
