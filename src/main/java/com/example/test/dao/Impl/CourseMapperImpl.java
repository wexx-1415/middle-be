package com.example.test.dao.Impl;

import com.example.test.dao.CourseMapper;
import com.example.test.dao.StuMapper;
import com.example.test.pojo.Course;
import com.example.test.pojo.StuCourse;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class CourseMapperImpl implements CourseMapper {
    private SqlSessionTemplate sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }
    @Override
    public List<Course> getCourse(String courseTime) {
        CourseMapper courseMapper=sqlSession.getMapper(CourseMapper.class);
        return courseMapper.getCourse(courseTime);
    }

    @Override
    public List<Course> getAllCourse() {
        CourseMapper courseMapper=sqlSession.getMapper(CourseMapper.class);
        return courseMapper.getAllCourse();
    }

    @Override
    public List<Course> courseByTea(String teaName) {
        CourseMapper courseMapper=sqlSession.getMapper(CourseMapper.class);
        return courseMapper.courseByTea(teaName);
    }

    @Override
    public List<Course> courseByStu(int id) {
        CourseMapper courseMapper=sqlSession.getMapper(CourseMapper.class);
            return courseMapper.courseByStu(id);
    }



    @Override
    public boolean addCourse(Course course) {
        CourseMapper courseMapper=sqlSession.getMapper(CourseMapper.class);
        return courseMapper.addCourse(course);
    }

    @Override
    public boolean updateCourse(Course course) {
        CourseMapper courseMapper=sqlSession.getMapper(CourseMapper.class);
return courseMapper.updateCourse(course);
    }

    @Override
    public boolean selectCourse(int courseId, int stuId) {
        CourseMapper courseMapper=sqlSession.getMapper(CourseMapper.class);
        courseMapper.selectCourse(courseId,stuId);
        return true;
    }

    @Override
    public boolean deleteCourse(String teaName) {
        CourseMapper courseMapper=sqlSession.getMapper(CourseMapper.class);
return courseMapper.deleteCourse(teaName);
    }

    @Override
    public boolean deleteCourseById(int id) {
        CourseMapper courseMapper=sqlSession.getMapper((CourseMapper.class));
return  courseMapper.deleteCourseById(id);
    }

    @Override
    public boolean deleteStuCourses(int id) {
        CourseMapper courseMapper=sqlSession.getMapper((CourseMapper.class));

        return courseMapper.deleteStuCourses(id);
    }

    @Override
    public boolean updateStuCourse(int stuId, int courseId, int m_stuId, int m_courseId) {
        CourseMapper courseMapper=sqlSession.getMapper((CourseMapper.class));

        return courseMapper.updateStuCourse(stuId,courseId,m_stuId,m_courseId);
    }

    @Override
    public List<StuCourse> getStuCourse() {
        CourseMapper courseMapper=sqlSession.getMapper((CourseMapper.class));

        return courseMapper.getStuCourse();
    }

    @Override
    public int getLastId() {
        CourseMapper courseMapper=sqlSession.getMapper((CourseMapper.class));

        return courseMapper.getLastId();
    }

    @Override
    public boolean deleteStuCourse(int courseId, int stuId) {
        CourseMapper courseMapper=sqlSession.getMapper((CourseMapper.class));
        return courseMapper.deleteStuCourse(courseId,stuId);
    }


}
