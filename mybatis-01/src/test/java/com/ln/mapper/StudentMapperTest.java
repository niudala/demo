package com.ln.mapper;

import com.ln.pojo.Student;
import com.ln.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Map;

public class StudentMapperTest {

    @Test
    public void testSelect() {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession()) {
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            Student res = mapper.findStudentinfo(1);
            System.out.println(res);
        }
    }
}
