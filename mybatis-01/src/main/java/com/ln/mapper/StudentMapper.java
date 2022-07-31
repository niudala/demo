package com.ln.mapper;

import com.ln.pojo.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    Student findStudentinfo(@Param("StudentNum") Integer studentNum);

}
