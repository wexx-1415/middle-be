package com.example.test.dao;

import com.example.test.pojo.Course;
import com.example.test.pojo.StuCourse;

import java.util.List;

public interface CourseMapper {
    List<Course> getCourse(String courseTime);
    List<Course> getAllCourse();
    List<Course> courseByTea(String teaName);
    List<Course> courseByStu(int id);
    boolean addCourse(Course course);
    boolean updateCourse(Course course);
    boolean selectCourse(int courseId,int stuId);
    boolean deleteCourse(String teaName);
    boolean deleteStuCourse(int courseId,int stuId);
    boolean deleteCourseById(int id);
    boolean deleteStuCourses(int id);
    boolean updateStuCourse(int stuId,int courseId,int m_stuId,int m_courseId);
    List<StuCourse> getStuCourse();
    int getLastId();
}
