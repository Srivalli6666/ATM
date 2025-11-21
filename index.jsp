<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ATM Login</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<div class="box">
    <h2>ATM Login</h2>

    <form action="LoginServlet" method="post">
        <input type="text" name="username" placeholder="Enter Username" required><br>
        <input type="password" name="password" placeholder="Enter Password" required><br>
        <button>Login</button>
    </form>

    <% if (request.getParameter("error") != null) { %>
        <p style="color:red;">Invalid Username or Password!</p>
    <% } %>
</div>
</body>
</html>
