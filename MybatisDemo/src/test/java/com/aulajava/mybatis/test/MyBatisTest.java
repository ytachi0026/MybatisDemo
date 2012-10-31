package com.aulajava.mybatis.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.aulajava.mybatis.bean.DemoUser;
import com.aulajava.mybatis.dao.DemoUserDAO;
import com.aulajava.mybatis.dao.impl.DemoUserDAOImpl;

public class MyBatisTest {

	private static DemoUserDAO demoUserDAO;
	
	@BeforeClass
	public static  void initializeDemoUserDAO(){
		demoUserDAO = new DemoUserDAOImpl();
	}
	@AfterClass
	public static void terminateDemoUserDAO(){
		demoUserDAO = null;
	}
	@Test
	public void testGetUserByCode() {
		List<DemoUser> lstDemoUser= demoUserDAO.getUserByCode();
		for(DemoUser du : lstDemoUser){
			System.out.println(du);
		}
		assertNotNull(lstDemoUser);
	}
	@Test
	public void testGetAllUsers(){
		List<DemoUser> lstDemoUser= demoUserDAO.getAllUsers();
		for(DemoUser du : lstDemoUser){
			System.out.println(du);
		}
		assertNotNull(lstDemoUser);
	}

}
