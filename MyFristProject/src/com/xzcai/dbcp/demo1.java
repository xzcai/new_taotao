package com.xzcai.dbcp;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;

import java.sql.Connection;

public class demo1 {
    @Test
    public void testDbcp() throws Exception{
        BasicDataSource dataSource= new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setInitialSize(3);
        dataSource.setMaxActive(6);
        dataSource.setMaxIdle(30000);

        Connection con = dataSource.getConnection();

    }

    @Test
    public void testc3p0() throws Exception{

    }

    @Test
    public void name() throws Exception {
    }
}
