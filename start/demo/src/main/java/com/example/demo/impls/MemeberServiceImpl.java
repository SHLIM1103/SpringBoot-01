package com.example.demo.impls;

import com.example.demo.domains.MemberDTO;
import com.example.demo.domains.StudentDTO;
import com.example.demo.domains.TeacherDTO;
import com.example.demo.services.MemberService;

import org.springframework.stereotype.Service;

@Service
public class MemeberServiceImpl implements MemberService {
    private int count;
    private MemberDTO[] members;
    public MemeberServiceImpl(){
        count = 0;
        members = new MemberDTO[3];
    }
    @Override
    public void registerStudent(StudentDTO student) {
        // TODO Auto-generated method stub

    }

    @Override
    public void registerTeacher(TeacherDTO teacher) {
        // TODO Auto-generated method stub

    }

    @Override
    public void updateStudent(StudentDTO student) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteMember(MemberDTO member) {
        // TODO Auto-generated method stub

    }

    @Override
    public StudentDTO login(StudentDTO student) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TeacherDTO access(TeacherDTO teacher) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StudentDTO[] fetchStudentList() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StudentDTO fetchStudentDetail(int userId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int sum(StudentDTO student) {
        return 0;
    }

    @Override
    public float avg(int sum) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean existId(int userId) {
        
        return false;
    }
}
