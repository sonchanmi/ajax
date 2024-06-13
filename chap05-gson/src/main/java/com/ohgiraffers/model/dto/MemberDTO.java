package com.ohgiraffers.model.dto;

import java.sql.Date;

import com.google.gson.annotations.SerializedName;

public class MemberDTO implements java.io.Serializable {
    
	//JSON의 key와 객체의 필드가 다른경우
	// 클래스의 필드에 @SerializedName('JSON key') 어노테이션을 달아주면
	//직렬화 및 역직렬화 시 JSON key 와 필드를 매핑해 준다. 
	
	@SerializedName("memberCode")
	private String code;
	private String name;
    private	char gender;
    private	int  age;
    private	Date enrollDatel;
    
	public MemberDTO(String code) {
		super();
		
	}

	
	
	public MemberDTO(String code, String name, char gender, int age) {
		super();
		this.code = code;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}



	

	public MemberDTO(String code, String name, char gender, int age, Date enrollDatel) {
		super();
		this.code = code;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.enrollDatel = enrollDatel;
	}



	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getEnrollDatel() {
		return enrollDatel;
	}

	public void setEnrollDatel(Date enrollDatel) {
		this.enrollDatel = enrollDatel;
	}

	@Override
	public String toString() {
		return "MemberDTO [code=" + code + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
    
    
}
