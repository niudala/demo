package com.ln.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//File name: MybatisUtils.java
public class MybatisUtils {
    //Create a new static sqlsessionfactory object, which only needs to be generated once during project initialization;
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = null;
            //Analyze the database and project information in XML through inputsteam stream;
            inputStream = Resources.getResourceAsStream(resource);
            //The sqlsessionfactory object is instantiated by the build method of the sqlsessionfactory builder object;
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Define a getsqlsession method to build an instance of sqlsession, which is implemented by the opensession () method of sqlsessionfactory.
    //Sqlsession completely contains all the methods needed to execute SQL commands for database!
    //The parameter true means that the automatic commit of sqlsession is turned on, that is, there is no need to manually commit after changing the database.
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession(true);
    }
}
