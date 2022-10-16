package com.example.test.controller;

import com.example.test.dao.CourseMapper;
import com.example.test.pojo.Course;
import com.example.test.pojo.StuCourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    CourseMapper mapper = (CourseMapper) context.getBean("CourseDao");
    @GetMapping("/course")
    public List<Course> getCourse(@RequestParam(value = "date",defaultValue = "-1") String date){
        System.out.println(mapper.getCourse("1-1"));
        return mapper.getCourse(date);
    }
    @GetMapping("/allCourse")
    public List<Course> getCourse(){
        System.out.println(mapper.getCourse("1-1"));
        return mapper.getAllCourse();
    }
    @PostMapping("addCourse")
    public int addCourse(Course course){
        System.out.println(course);
        mapper.addCourse(course);
        return mapper.getLastId();
    }
    @PostMapping("selectCourse")
    public boolean selectCourse(int courseId,int stuId){
        mapper.selectCourse(courseId,stuId);
        return true;
    }
    @PostMapping("deleteCourse")
    public boolean deleteCourse(String teaName){
        mapper.deleteCourse(teaName);
        return true;
    }
    @PostMapping("updateCourse")
    public boolean updateCourse(Course course){
        mapper.updateCourse(course);
        return true;
    }
    @PostMapping("courseByTea")
    public List<Course> CourseByTea(String teaName){
       return mapper.courseByTea(teaName);

    }
    @PostMapping("CourseByStu")
    public List<Course> CourseByStu(int id){
        return mapper.courseByStu(id);

    }
    @PostMapping("deleteCourseById")
    public boolean deleteCourseById(Integer id){
        return mapper.deleteCourseById(id);
    }
    @PostMapping("deleteStuCourse")
    public boolean deleteStuCourse(int courseId,int stuId){
        return mapper.deleteStuCourse(courseId,stuId);
    }
    @PostMapping("deleteStuCourses")
    public boolean deleteStuCourses(int stuId){
        return mapper.deleteStuCourses(stuId);
    }
    @GetMapping("getStuCourse")
    public List<StuCourse> getStuCourse(){
        return mapper.getStuCourse();
    }
    @PostMapping("updateStuCourse")
    public boolean updateStuCourse(int stuId,int courseId,int m_stuId,int m_courseId){
        return mapper.updateStuCourse(stuId,courseId,m_stuId,m_courseId);
    }
}
