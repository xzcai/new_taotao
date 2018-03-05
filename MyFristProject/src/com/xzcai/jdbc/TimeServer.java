package com.xzcai.jdbc;

import org.junit.Test;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class TimeServer {
    //连接数据库url
    static String url=null;
    static String user = null;
    static String driverClass=null;

    static{
        try{
            Properties properties= new Properties();


            //FileInputStream inputStream = new FileInputStream("./src/db.properties");
            InputStream inputStream =  TimeServer.class.getResourceAsStream("/db.properties");
            properties.load(inputStream);
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            driverClass = properties.getProperty("driverClass");
            Class.forName(driverClass);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test
    public void test1() throws Exception{
        //创建驱动类对象
        Driver driver = new com.mysql.jdbc.Driver();
        System.out.println("sdfsdf");
        //设置用户名和密码
        Properties props = new Properties();
        props.setProperty("user",user);
        //连接数据库 返回连接对象
        Connection conn = driver.connect(url,props);
    }

    @Test
    public void test2() throws Exception{
        Connection conn=null;
        Statement statement=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,null);
            statement = conn.createStatement();
            String sql = "create table student(id int primary key auto_increment,name varchar(20))";
            int count = statement.executeUpdate(sql);
            System.out.println(count);
        }catch (Exception e){

        }finally {

        }

    }

    @Test
    public void test3() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,user,null);
        Statement statement = conn.createStatement();
        String sql = "select * from student";
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        System.out.println(resultSet.getString(1));
    }

    @Test
    public void test4() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,user,null);
        String sql = "call pro_findById(?)";
        CallableStatement callableStatement = conn.prepareCall(sql);
        callableStatement.setInt(1,2);
        ResultSet resultSet = callableStatement.executeQuery();
        resultSet.next();
        System.out.println(resultSet.getString(2));
    }

    @Test
    public void test5() throws Exception{
        Class.forName(driverClass);
        Connection conn = DriverManager.getConnection(url,user,null);
        String sql = "call pro_findById2(?,?)";
        CallableStatement callableStatement = conn.prepareCall(sql);
        callableStatement.setInt(1,2);
        callableStatement.registerOutParameter(2, Types.VARCHAR);
        callableStatement.executeQuery();
        System.out.println(callableStatement.getString(2));
    }

    @Test
    public void test6() throws Exception{

    }
}
