<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sucess Page</title>
    <link href="<c:url value="/resources/css/StyleSheet.css"></c:url> " rel="stylesheet">
</head>
<body>
<form:form action="/SSEFSubmitted" method="post" modelAttribute="SseForm">
    <table  style=" margin-top: 100px !important;">
        <thead>
        <th colspan="2">Student Self evaluation</th>
        <th>Strongly agree</th>
        <th>Agree</th>
        <th>Neutral</th>
        <th>Disagree</th>
        <th>Strongly disagree</th>
        </thead>

        <tbody>
        <tr>
            <td colspan="2" style="width: 492px; word-break: all">I contributed constructively during in-class.</td>
            <c:forEach items="${radioList}" var="it" varStatus="loop">
                <td>
                    <form:radiobutton path="q30" value="${it}"></form:radiobutton>
                </td>
            </c:forEach>
        </tr>

        <tr>
            <td colspan="2">I feel I am achieving the learning outcomes.</td>
            <c:forEach items="${radioList}" var="it" varStatus="loop">
                <td>
                    <form:radiobutton path="q31" value="${it}"></form:radiobutton>
                </td>
            </c:forEach>
        </tr>

        <tr>
            <td colspan="2">Comments (Student Self Evaluation)</td>
            <td colspan="5">
                <form:textarea path="q32"></form:textarea>
            </td>
        </tr>
        <tr>
            <td colspan="4" style="text-align: center"><input type="reset" value="Reset"></td>
            <td colspan="3" style="text-align: center">
                <input type="submit" value="Next">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
