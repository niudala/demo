package com.ln.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CheckServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        String username=req.getParameter("username");
        String message=null;
        if(username==null){
            message="Please input username";
        }else{
            message="Hello "+username;
        }

        req.setAttribute("msg", message);
        out.println("before redirecting");
        System.out.println("before redirecting");

        resp.sendRedirect("/helloapp/output1?msg="+message);
        out.println("after redirecting");
        System.out.println("after redirecting");
    }
}
