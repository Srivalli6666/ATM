<%@ page import="com.atm.User" %>
<%
User user = (User) session.getAttribute("user");
if (user == null) response.sendRedirect("index.jsp");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Deposit</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<div class="box">
    <h2>Deposit Money</h2>

    <form action="DepositServlet" method="post">
        <input type="number" name="amount" placeholder="Enter Amount" required step="0.01">
        <button>Deposit</button>
    </form>
</div>
</body>
</html>
