package com.atm;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class LogoutServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {

        req.getSession().invalidate();
        res.sendRedirect("index.jsp");
    }
}
