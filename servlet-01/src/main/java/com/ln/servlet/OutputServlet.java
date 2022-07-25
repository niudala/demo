package com.ln.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class OutputServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String message = (String)servletRequest.getAttribute("msg");
        PrintWriter out=servletResponse.getWriter();

        out.println(message);
        out.close();
    }
}
