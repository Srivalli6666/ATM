<%@ page import="com.atm.User" %>
<%
User user = (User) session.getAttribute("user");
if (user == null) response.sendRedirect("index.jsp");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Withdraw</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<div class="box">
    <h2>Withdraw Money</h2>

    <form action="WithdrawServlet" method="post">
        <input type="number" name="amount" placeholder="Enter Amount" required step="0.01">
        <button>Withdraw</button>
    </form>

    <% if (request.getParameter("error") != null) { %>
        <p style="color:red;">Insufficient Balance or invalid amount!</p>
    <% } %>
</div>
</body>
</html>
