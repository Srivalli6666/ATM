package com.atm;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class WithdrawServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {

        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null) {
            res.sendRedirect("index.jsp");
            return;
        }

        double amount = 0;
        try {
            amount = Double.parseDouble(req.getParameter("amount"));
        } catch (Exception e) {
            res.sendRedirect("withdraw.jsp?error=1");
            return;
        }

        if (user.withdraw(amount)) {
            res.sendRedirect("dashboard.jsp");
        } else {
            res.sendRedirect("withdraw.jsp?error=1");
        }
    }
}
