package com.example.demo.domains;

public class GradeDTO extends MemberDTO{
    private String korean, english, math;
    public GradeDTO(){}
    public GradeDTO(int userId, String korean, String english, String math){
        super.userId = userId ;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}