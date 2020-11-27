package com.example.demo.services;

import com.example.demo.domains.MemberDTO;
import com.example.demo.domains.StudentDTO;
import com.example.demo.domains.TeacherDTO;

import org.springframework.stereotype.Component;

@Component
public interface MemberService {
    public void registerStudent(StudentDTO student);
    public void registerTeacher(TeacherDTO teacher);
    public void updateStudent(StudentDTO student);
    public void deleteMember(MemberDTO member);
    public StudentDTO login(StudentDTO student);
    public TeacherDTO access(TeacherDTO teacher);
    public StudentDTO[] fetchStudentList();    
    public StudentDTO fetchStudentDetail(int userId);
    public int sum(StudentDTO student);
    public float avg(int sum);
    public boolean existId(int userId);
}
