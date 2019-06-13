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
<form:form action="/FASubmitted" method="post" modelAttribute="feedbackAssesment">
    <table  style=" margin-top: 100px !important;">
        <thead>
        <th colspan="2">Feedback and assessment</th>
        <th>Strongly agree</th>
        <th>Agree</th>
        <th>Neutral</th>
        <th>Disagree</th>
        <th>Strongly Disagree</th>
        </thead>
        <tbody>
        <tr>
            <td colspan="2">Information about the assessment was communicated clearly.</td>
            <c:forEach items="${radioList}" var="it" varStatus="loop">
                <td>
                    <form:radiobutton path="q12" value="${it}"></form:radiobutton>
                </td>
            </c:forEach>
        </tr>

        <tr>
            <td colspan="2">Feedback was provided within the stated timeframe.</td>
            <c:forEach items="${radioList}" var="it" varStatus="loop">
                <td>
                    <form:radiobutton path="q13" value="${it}"></form:radiobutton>
                </td>
            </c:forEach>
        </tr>
        <tr>
            <td colspan="2" style="width: 488px; word-break: break-all;">Feedback showed how to improve my work (e .g. corrections including comments).</td>
            <c:forEach items="${radioList}" var="it" varStatus="loop">
                <td>
                    <form:radiobutton path="q14" value="${it}"></form:radiobutton>
                </td>
            </c:forEach>
        </tr>

        <tr>
            <td colspan="2">Comments (Feedback and Assessment)</td>
            <td colspan="5">
                <form:textarea path="q15"></form:textarea>
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
