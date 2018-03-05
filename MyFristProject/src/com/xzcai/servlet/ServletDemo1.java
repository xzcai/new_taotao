package com.xzcai.servlet;

import com.xzcai.jdbc.TimeServer;
import org.junit.Test;

import java.io.IOException;

public class ServletDemo1 extends javax.servlet.http.HttpServlet {

    @Test
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        TimeServer demo1 =new TimeServer();
        try {
            //response.getWriter().write( demo1.test5());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
