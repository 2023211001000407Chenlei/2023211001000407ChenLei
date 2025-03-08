<%--
  Created by IntelliJ IDEA.
  User: 32527
  Date: 2025/3/5
  Time: 00:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post">
        <h2>Registration</h2>
        <label for="username">Username:</label><br>
        <input type="text" id="username" name="username" required><br>
        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" required><br>
        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email" required><br>
        <label>Gender:</label><br>
        <input type="radio" id="male" name="gender" value="male">
        <label for="male">Male</label>
        <input type="radio" id="female" name="gender" value="female">
        <label for="female">Female</label><br>
        <label for="date-of-birth">Date of Birth</label>
        <input type="date" id="date-of-birth" name="date-of-birth"><br>
        <input type="submit" value="Register">
    </form>
</body>
</html>
