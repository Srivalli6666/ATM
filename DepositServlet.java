package com.atm;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class DepositServlet extends HttpServlet {
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
            res.sendRedirect("deposit.jsp?error=1");
            return;
        }

        if (amount > 0) {
            user.deposit(amount);
        }

        res.sendRedirect("dashboard.jsp");
    }
}
