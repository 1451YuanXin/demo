package com.YuanXin.week3.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String Email=request.getParameter("Email");
        String sex=request.getParameter("sex");
        String birthdate=request.getParameter("birthdate");

        PrintWriter printWriter=response.getWriter();
        printWriter.println("<br>username :"+username);
        printWriter.println("<br> password :"+password);
        printWriter.println("<br>Email :"+Email);
        printWriter.println("<br>sex :"+sex);
        printWriter.println("<br>birthdate :"+birthdate);
        printWriter.close();
    }
}