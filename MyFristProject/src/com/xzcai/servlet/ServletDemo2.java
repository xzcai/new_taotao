package com.xzcai.servlet;

import org.junit.Test;

import java.io.IOException;

public class ServletDemo2 extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException{
        response.getWriter().write("hello world");
    }
    @Test
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().write("hello world get");
    }
}
