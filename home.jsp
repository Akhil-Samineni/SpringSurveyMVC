<%--
  Created by IntelliJ IDEA.
  User: akhil
  Date: 4/23/2019
  Time: 1:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to Spring</title>

</head>
<body >

    <form:form action="/login" method="post" modelAttribute="login">
        <table style="margin-left: auto; margin-right: auto;text-align: center">
            <tr>
                <td> Username </td>
                <td> <form:input path="username"></form:input></td>
            </tr>

            <tr>
                <td> Password </td>
                <td> <form:password path="password"></form:password></td>
            </tr>

            <tr>
                <td> Group </td>
                <td> <form:select path="group">
                    <form:option value="Student" label="Student"></form:option>
                    <form:option value="Faculty" label="Faculty"></form:option>
                </form:select></td>
            </tr>

            <tr>
                <td colspan="2">
                    <input type="submit" value="Submit">
                </td>
            </tr>
        </table>
    </form:form>


</body>
</html>
