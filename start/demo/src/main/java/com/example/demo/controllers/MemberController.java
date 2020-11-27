package com.example.demo.controllers;

import com.example.demo.domains.MemberDTO;
import com.example.demo.domains.StudentDTO;
import com.example.demo.domains.TeacherDTO;
import com.example.demo.impls.MemeberServiceImpl;
import com.example.demo.services.MemberService;

public class MemberController {
    private MemberService memberService;
    public MemberController() {
        memberService = new MemeberServiceImpl();
    }

    public void postStudent(StudentDTO student) {
        memberService.registerStudent(student);
    }
    public void postTeacher(TeacherDTO teacher) {
        memberService.registerTeacher(teacher);
    }
    public void putStudent(StudentDTO student) {
        memberService.updateStudent(student);
    }
    public void deleteMember(MemberDTO member) {
        memberService.deleteMember(member);
    }
    public StudentDTO postlogin(StudentDTO student) {
        return memberService.login(student);
    }
    public TeacherDTO getAccess(TeacherDTO teacher) {
        return memberService.access(teacher);
    }
    public StudentDTO[] getStudentList() {
        return memberService.fetchStudentList();
    }
    public StudentDTO getStudentDetail(int userId) {
        return memberService.fetchStudentDetail(userId);
    }
    public int getSum(StudentDTO student) {
        return memberService.sum(student);
    }
    public float getAvg(int sum) {
        return memberService.avg(sum);
    }
    public boolean getExistId(int userId) {
        return memberService.existId(userId);
    }
}
