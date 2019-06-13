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
<form:form action="/RASubmitted" method="post" modelAttribute="resourceAndAdmin">
    <table  style=" margin-top: 100px !important;">
        <thead>
        <th colspan="2">RESOURCES AND ADMINISTRATION</th>
        <th>Strongly agree</th>
        <th>Agree</th>
        <th>Neutral</th>
        <th>Disagree</th>
        <th>Strongly Disagree</th>
        </thead>
        <tbody>
        <tr>
            <td colspan="2">The course was supported by adequate library resources.</td>
            <c:forEach items="${radioList}" var="it" varStatus="loop">
                <td>
                    <form:radiobutton path="q16" value="${it}"></form:radiobutton>
                </td>
            </c:forEach>
        </tr>

        <tr>
            <td colspan="2">Blackboard resources for the course were useful.</td>
            <c:forEach items="${radioList}" var="it" varStatus="loop">
                <td>
                    <form:radiobutton path="q17" value="${it}"></form:radiobutton>
                </td>
            </c:forEach>
        </tr>
        <tr>
            <td colspan="2" style="width: 488px; word-break: break-all;">Instructor gave guidance on where to find resources.</td>
            <c:forEach items="${radioList}" var="it" varStatus="loop">
                <td>
                    <form:radiobutton path="q18" value="${it}"></form:radiobutton>
                </td>
            </c:forEach>
        </tr>

        <tr>
            <td colspan="2">Comments (Resources and Administration)</td>
            <td colspan="5">
                <form:textarea path="q19"></form:textarea>
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
