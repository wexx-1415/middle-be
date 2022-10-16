package com.example.test.pojo;

public class Tea {
    private int  teaId;
    private String teaName;
    private String teaPwd;

    public int getTeaId() {
        return teaId;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "teaId=" + teaId +
                ", teaName='" + teaName + '\'' +
                ", teaPwd='" + teaPwd + '\'' +
                '}';
    }

    public void setTeaId(int teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public String getTeaPwd() {
        return teaPwd;
    }

    public void setTeaPwd(String teaPwd) {
        this.teaPwd = teaPwd;
    }
}
