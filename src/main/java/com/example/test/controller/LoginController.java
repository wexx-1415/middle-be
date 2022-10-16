package com.example.test.controller;

import com.example.test.UserMapper;
import com.example.test.dao.StuMapper;
import com.example.test.dao.TeaMapper;
import com.example.test.pojo.Stu;
import com.example.test.pojo.Tea;
import com.example.test.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.TabExpander;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

@RestController


public class LoginController {
    private Stu stu;
    private Tea tea;
    ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    StuMapper mapper = (StuMapper) context.getBean("StuDao");
    TeaMapper teaMapper=(TeaMapper) context.getBean("TeaDao");

    @PostMapping("login")
    public ResponseEntity<Login> Login( @RequestParam(value = "userType") String userType, @RequestParam(value = "userName") String userName, @RequestParam(value = "userPwd") String userPwd){
        HttpHeaders headers = new HttpHeaders();
        try {
            headers.add("Content-Disposition", "attachment;filename*=utf-8'zh_cn'" + URLEncoder.encode( "UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(userPwd+userName+"jhjkjkljlk");
        switch (userType){
            case "stu":
                stu=mapper.getStu(userName,userPwd);
                if(stu==null)return ResponseEntity.ok().body(new Login("none","1",1));
                System.out.println(stu.toString());
                System.out.println(ResponseEntity.ok().headers(headers).body(new Login(userType, stu.getStuName(), stu.getStuId())).getStatusCodeValue());
                return ResponseEntity.ok().headers(headers).body(new Login(userType,stu.getStuName(),stu.getStuId()));
            case "tea":
                tea=teaMapper.getTea(userName,userPwd);
                if(tea==null)return ResponseEntity.ok().body(new Login("none","1",1));

                return ResponseEntity.ok().headers(headers).body(new Login(userType,tea.getTeaName(),tea.getTeaId()));
            default:
                return ResponseEntity.ok().body(new Login("none","1",1));

        }
    }
    @PostMapping("deleteStu")
    public boolean delete(int id){
        return mapper.deleteStu(id);
    }
    @PostMapping("deleteTea")
    public boolean deleteTea(String teaName){
        return teaMapper.deleteTea(teaName);
    }
    @GetMapping("getStus")
    public List<Stu> getStus(){
        return mapper.getStus();
    }
    @PostMapping ("updateStu")
    public boolean updateStu(Stu stu){
        return mapper.updateStu(stu);
    }
    @GetMapping("getTeas")
    public List<Tea> getTeas(){
        return teaMapper.getTeas();
    }
    @PostMapping ("updateTea")
    public boolean updateTea(Tea stu){
        return teaMapper.updateTea(stu);
    }
    @PostMapping("addStu")
    public int addStu(Stu stu){
        mapper.addStu(stu);
        return mapper.getLastStuId();
    }
    @PostMapping("addTea")
    public int addTea(Tea tea){

        teaMapper.addTea(tea);
    return teaMapper.getLastTeaId();
    }
}
