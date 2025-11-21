<%@ page import="com.atm.User" %>
<%
User user = (User) session.getAttribute("user");
if (user == null) response.sendRedirect("index.jsp");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<div class="box">
    <h2>Welcome!</h2>
    <h3>Balance: ₹ <%= user.getBalance() %></h3>

    <a href="deposit.jsp" class="btn">Deposit</a>
    <a href="withdraw.jsp" class="btn">Withdraw</a>
    <a href="LogoutServlet" class="btn">Logout</a>
</div>
</body>
</html>
