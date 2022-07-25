package com.ln.servlet;

import javax.servlet.*;
import java.io.IOException;

public class DispatcherServlet extends GenericServlet {
    private String target = "/hello.jsp";
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String username = servletRequest.getParameter("username");
        String password = servletRequest.getParameter("password");

        servletRequest.setAttribute("USER", username);
        servletRequest.setAttribute("PASSWORD", password);

        ServletContext context = getServletContext();
        RequestDispatcher dispatcher = context.getRequestDispatcher(target);
        dispatcher.forward(servletRequest, servletResponse);
    }
}
