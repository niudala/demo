package com.ln.mapper;

import com.ln.pojo.Course;
import com.ln.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Map;

public class CourseMapperTest {

    @Test
    public void testSelect() {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession()) {
            CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
            Course res = mapper.findStudentin(1);
            System.out.println(res);
        }
    }
}
