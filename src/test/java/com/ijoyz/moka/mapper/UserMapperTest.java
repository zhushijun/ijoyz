package com.ijoyz.moka.mapper;

import javax.annotation.Resource;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.ijoyz.moka.model.meta.UserMeta;
@ContextConfiguration(locations="file:src/test/resources/applicationContext-db.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "txManager")  
@Transactional
public class UserMapperTest extends TestCase{
	@Resource
	UserMapper userMapper;
	
	@Test
	public void test() {
		assertNotNull(userMapper);
	}
	@Test
	public void testInsert() throws Exception {
		UserMeta meta = new UserMeta();
		meta.setId(123);
		meta.setPass("pass");
		meta.setRole(0);
		meta.setUserName("userName");
		userMapper.addMeta(meta);
		UserMeta userMeta = userMapper.getUserMeta("userName", "pass");
		
		assertNotNull(userMeta);
	}

}
