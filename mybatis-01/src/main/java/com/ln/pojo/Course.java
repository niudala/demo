package com.ln.pojo;

import java.util.List;

public class Course {
    private Integer courseNum;
    private String courseName;
    private Integer teacher;
    private List<Student> studentList;

    public Course() {}

    @Override
    public String toString() {
        return "Course{" +
                "courseNum=" + courseNum +
                ", courseName='" + courseName + '\'' +
                ", teacher=" + teacher +
                ", studentList=" + studentList +
                '}';
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Integer getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(Integer courseNum) {
        this.courseNum = courseNum;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getTeacher() {
        return teacher;
    }

    public void setTeacher(Integer teacher) {
        this.teacher = teacher;
    }
}
