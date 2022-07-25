package com.ln.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class OutputServlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = (String)req.getAttribute("msg");
        System.out.println("请求范围的消息: "+message);
        message=req.getParameter("msg");
        System.out.println("请求参数的消息: "+message);
        PrintWriter out=resp.getWriter();

        out.println(message);
        out.close();
    }
}
