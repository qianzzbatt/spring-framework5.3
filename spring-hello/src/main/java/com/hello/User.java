package com.hello;

/**
 * @author huangquan
 * @Description
 * @Date 2022/1/17
 **/
public class User {

	private String userName;

	private int age;

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
