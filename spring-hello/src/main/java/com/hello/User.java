package com.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author huangquan
 * @Description
 * @Date 2022/1/17
 **/
@Component
public class User {

	private String userName;

	private int age;

	private Address address;

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void sayHello(){
		System.out.println("User-Hello");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
