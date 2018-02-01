package org.demo.dao;

import java.util.List;

import org.demo.dao.domain.User;
import org.demo.dao.service.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试spring+mybatis集成的效果
 * @author caojin
 *
 */
public class SpringTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring-mybatis.xml");

		UserMapper bean = context.getBean("userMapper",UserMapper.class);

		List<User> userByUser = bean.queryUsers();
		System.out.println(userByUser);
	}
}
