package org.demo.dao;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.demo.dao.service.UserMapper;

/**
 * 测试Mybatis集成的效果
 * 
 */
public class MybatisTest{
	
	public static void main(String args[]) {
		String resource = "/mybatis-config.xml";
		InputStream resourceStream = Object.class.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceStream);
		SqlSession session = factory.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		System.out.println(userMapper.queryUsers());
	}
}
