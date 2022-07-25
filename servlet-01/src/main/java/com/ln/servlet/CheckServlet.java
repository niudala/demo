package com.ln.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class CheckServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String username = servletRequest.getParameter("username");
        String message = null;
        if(username==null){
            message="Please input username";
        }else{
            message="Hello,"+username;
        }

        servletRequest.setAttribute("msg", message);
        ServletContext context = getServletContext();
        RequestDispatcher dispatcher = context.getRequestDispatcher("/output");

        PrintWriter out=servletResponse.getWriter();

        out.println("Output from check before forwarding");
        System.out.println("Output from check before forwarding");

        dispatcher.forward(servletRequest,servletResponse);
        out.println("After");
        System.out.println("After");
    }
}
