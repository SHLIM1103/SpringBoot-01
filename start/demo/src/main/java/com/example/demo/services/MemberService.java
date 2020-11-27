package com.example.demo.services;

import java.util.List;

import com.example.demo.domains.MemberDTO;

import org.springframework.stereotype.Component;

@Component
public interface MemberService {
    public void registerStudent(MemberDTO student);
    public void registerTeacher(MemberDTO teacher);
    public void updateStudent(MemberDTO student);
    public void deleteMember(MemberDTO member);
    public MemberDTO login(MemberDTO student);
    public MemberDTO access(MemberDTO teacher);
    public List<MemberDTO> fetchStudentList();    
    public MemberDTO fetchStudentDetail(int memId);
    public int sum(MemberDTO student);
    public float avg(int sum);
    public boolean existId(int memId);
}
