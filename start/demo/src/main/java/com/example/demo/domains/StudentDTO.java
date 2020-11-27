package com.example.demo.domains;

public class StudentDTO extends MemberDTO{
    private String nickName;
	public StudentDTO(){}
	public StudentDTO(int userId, String userName, String password, String nickName){
		super.userId = userId;
		super.userName = userName;
		super.password = password;
	}
}
