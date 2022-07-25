package com.ln.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CounterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context=getServletContext();

        Counter counter=(Counter)context.getAttribute("counter");

        if(counter==null){
            counter = new Counter(1);
            context.setAttribute("counter", counter);
        }

        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        String imageLink="<img src='image?count="+counter.getCount()+"'/>";
        out.println("Welcome, you are "+imageLink+" people");

        counter.add(1);
        out.close();
    }
}
