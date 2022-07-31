package com.ln.mapper;

import com.ln.pojo.Course;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface CourseMapper {

    Map<String, Integer> selectCousreName(@Param("CourseNum") Integer courseNum);

    Course findStudentin(@Param("CourseNum") Integer courseNum);
}
