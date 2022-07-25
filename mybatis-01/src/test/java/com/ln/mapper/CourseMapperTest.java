package com.ln.mapper;

import com.ln.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class CourseMapperTest {

    @Test
    public void testSelect() {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession()) {
            CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
            String CourseName = mapper.selectCousreName("0001");
            System.out.println(CourseName);
        }
    }
}
