package com.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huangquan
 * @Description
 * @Date 2022/1/17
 **/
@ComponentScan(value = "com.hello")
public class TestXmlApi {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		User user = (User) context.getBean("user");
		user.sayHello();
	}

}
