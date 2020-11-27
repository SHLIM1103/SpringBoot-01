package com.example.demo.impls;

import java.util.List;

import com.example.demo.domains.MemberDTO;
import com.example.demo.services.MemberService;

import org.springframework.stereotype.Service;

@Service
public class MemeberServiceImpl implements MemberService {

    @Override
    public void registerStudent(MemberDTO student) {
        // TODO Auto-generated method stub

    }

    @Override
    public void registerTeacher(MemberDTO teacher) {
        // TODO Auto-generated method stub

    }

    @Override
    public void updateStudent(MemberDTO student) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteMember(MemberDTO member) {
        // TODO Auto-generated method stub

    }

    @Override
    public MemberDTO login(MemberDTO student) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MemberDTO access(MemberDTO teacher) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<MemberDTO> fetchStudentList() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MemberDTO fetchStudentDetail(int userId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int sum(MemberDTO student) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float avg(int sum) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean existId(int userId) {
        // TODO Auto-generated method stub
        return false;
    }

}
