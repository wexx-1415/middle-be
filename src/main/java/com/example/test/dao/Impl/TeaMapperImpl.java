package com.example.test.dao.Impl;

import com.example.test.dao.CourseMapper;
import com.example.test.dao.TeaMapper;
import com.example.test.pojo.Stu;
import com.example.test.pojo.Tea;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class TeaMapperImpl implements TeaMapper {

    private SqlSessionTemplate sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }
    @Override
    public Tea getTea(String userName, String userPwd) {
        TeaMapper teaMapper=sqlSession.getMapper(TeaMapper.class);
        return teaMapper.getTea(userName,userPwd);
    }

    @Override
    public boolean deleteTea(String teaName) {
        TeaMapper teaMapper=sqlSession.getMapper(TeaMapper.class);
        CourseMapper courseMapper=sqlSession.getMapper(CourseMapper.class);
        courseMapper.deleteCourse(teaName);
        return teaMapper.deleteTea(teaName);
    }

    @Override
    public List<Tea> getTeas() {
        TeaMapper teaMapper=sqlSession.getMapper(TeaMapper.class);
        return teaMapper.getTeas();

    }

    @Override
    public boolean updateTea(Tea tea) {
        TeaMapper teaMapper=sqlSession.getMapper(TeaMapper.class);

        return teaMapper.updateTea(tea);
    }

    @Override
    public boolean addTea(Tea tea) {
        TeaMapper teaMapper=sqlSession.getMapper(TeaMapper.class);

        return teaMapper.addTea(tea);
    }

    @Override
    public int getLastTeaId() {
        TeaMapper teaMapper=sqlSession.getMapper(TeaMapper.class);

        return teaMapper.getLastTeaId();
    }
}
