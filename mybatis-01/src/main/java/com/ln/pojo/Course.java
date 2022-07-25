package com.ln.pojo;

public class Course {
    private String CourseNum;
    private String CourseName;
    private String TeacherNum;

    public Course(String courseNum, String courseName, String teacherNum) {
        this.CourseNum = courseNum;
        this.CourseName = courseName;
        this.TeacherNum = teacherNum;
    }

    public Course() {};

    public String getCourseNum() {
        return CourseNum;
    }

    public void setCourseNum(String courseNum) {
        CourseNum = courseNum;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getTeacherNum() {
        return TeacherNum;
    }

    public void setTeacherNum(String teacherNum) {
        TeacherNum = teacherNum;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CourseNum='" + CourseNum + '\'' +
                ", CourseName='" + CourseName + '\'' +
                ", TeacherNum='" + TeacherNum + '\'' +
                '}';
    }
}
