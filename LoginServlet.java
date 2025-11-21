package com.atm;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    User user = new User();

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (user.login(username, password)) {
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            res.sendRedirect("dashboard.jsp");
        } else {
            res.sendRedirect("index.jsp?error=1");
        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
        res.sendRedirect("index.jsp");
    }
}
