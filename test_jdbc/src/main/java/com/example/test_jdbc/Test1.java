package com.example.test_jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.SQLException;

public class Test1
{
    @Test
    public void test() throws SQLException
    {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean.xml");
        DriverManagerDataSource bean = ioc.getBean(DriverManagerDataSource.class);
        System.out.println(bean.getConnection());
        JdbcTemplate jt = (JdbcTemplate)ioc.getBean("jdbcTemplate");
        jt.update("delete from user where username = ?","chuliuxiang");
    }
}
