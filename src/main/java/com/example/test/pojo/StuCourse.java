package com.example.test.pojo;

public class StuCourse {
    private int stuId;
    private int courseId;

    public int getStuId() {
        return stuId;
    }

    @Override
    public String toString() {
        return "StuCourse{" +
                "stuId=" + stuId +
                ", courseId=" + courseId +
                '}';
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
