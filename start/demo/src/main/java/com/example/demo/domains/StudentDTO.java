package com.example.demo.domains;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Component
public class StudentDTO extends MemberDTO {
    protected String nickName;
}