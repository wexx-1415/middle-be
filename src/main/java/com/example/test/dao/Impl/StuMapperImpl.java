package com.example.test.dao.Impl;

import com.example.test.dao.CourseMapper;
import com.example.test.dao.StuMapper;
import com.example.test.pojo.Stu;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class StuMapperImpl implements StuMapper {
    private SqlSessionTemplate sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public Stu getStu(String stuName, String stuPwd) {
        StuMapper stuMapper=sqlSession.getMapper(StuMapper.class);
        return stuMapper.getStu(stuName,stuPwd);
    }

    @Override
    public boolean deleteStu(int stuId) {
        StuMapper stuMapper=sqlSession.getMapper(StuMapper.class);
        CourseMapper courseMapper=sqlSession.getMapper((CourseMapper.class));
        courseMapper.deleteStuCourses(stuId);
    return stuMapper.deleteStu(stuId);
    }

    @Override
    public List<Stu> getStus() {
        StuMapper stuMapper=sqlSession.getMapper(StuMapper.class);
        return stuMapper.getStus();
    }

    @Override
    public boolean updateStu(Stu stu) {
        StuMapper stuMapper=sqlSession.getMapper(StuMapper.class);

        return stuMapper.updateStu(stu);
    }

    @Override
    public boolean addStu(Stu stu) {
        StuMapper stuMapper=sqlSession.getMapper(StuMapper.class);

        return stuMapper.addStu(stu);
    }

    @Override
    public int getLastStuId() {
        StuMapper stuMapper=sqlSession.getMapper(StuMapper.class);

        return stuMapper.getLastStuId();
    }
}
