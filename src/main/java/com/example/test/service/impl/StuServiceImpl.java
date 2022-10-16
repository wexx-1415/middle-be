package com.example.test.service.impl;

import com.example.test.dao.StuMapper;
import com.example.test.pojo.Stu;
import com.example.test.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;

public class StuServiceImpl implements StuService {
    @Autowired
    private StuMapper stuMapper;
    @Override
    public Stu getStu(String stuName, String stuPwd) {
       return stuMapper.getStu(stuName,stuPwd);

    }

    public void setStuMapper(StuMapper stuMapper) {
        this.stuMapper = stuMapper;
    }
}
