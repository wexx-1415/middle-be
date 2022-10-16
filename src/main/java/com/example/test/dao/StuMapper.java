package com.example.test.dao;

import com.example.test.pojo.Stu;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StuMapper {
    Stu getStu(String stuName,String stuPwd);
    boolean deleteStu(int stuId);
    List<Stu> getStus();
    boolean updateStu(Stu stu);
    boolean addStu(Stu stu);
    int getLastStuId();
}
