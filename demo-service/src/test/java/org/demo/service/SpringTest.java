package org.demo.service;

import java.util.List;

import org.demo.dao.domain.User;
import org.demo.dao.service.UserMapper;
import org.demo.service.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试spring+mybatis集成的效果
 * @author caojin
 *
 */
public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring-service.xml");

		UserService bean = context.getBean("userService",UserService.class);
//		UserMapper bean1 = context.getBean("userMapper",UserMapper.class);

		List<User> userByUser = bean.queryUsers();
		System.out.println(userByUser);
	}
}
