package com.example.test.dao;

import com.example.test.pojo.Stu;
import com.example.test.pojo.Tea;

import java.util.List;

public interface TeaMapper {
    Tea getTea(String userName,String userPwd);
    boolean deleteTea(String teaName);
    List<Tea> getTeas();
    boolean updateTea(Tea stu);
    boolean addTea(Tea tea);
    int getLastTeaId();

}
