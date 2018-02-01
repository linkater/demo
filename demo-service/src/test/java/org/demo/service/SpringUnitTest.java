package org.demo.service;

import org.demo.dao.domain.User;
import org.demo.dao.service.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.qos.logback.classic.Logger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-service.xml")
public class SpringUnitTest {
	private final Logger LOG = (Logger) LoggerFactory.getLogger(this.getClass());  
	@Autowired
	private UserMapper userMapper;

	@Test
	public void queryUsers() {
		User user = userMapper.queryUsers().get(0);
		System.out.println(user.getAccount());
		LOG.info("user", user.getUsername());
		LOG.info(user.getUsername());
	}
}
