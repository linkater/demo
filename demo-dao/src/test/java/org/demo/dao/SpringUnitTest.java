package org.demo.dao;

import org.demo.dao.service.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-mybatis.xml")
public class SpringUnitTest {
	@Autowired
	private UserMapper userMapper;

	@Test
	public void queryUsers() {
		System.out.println(userMapper.queryUsers());
	}
}
