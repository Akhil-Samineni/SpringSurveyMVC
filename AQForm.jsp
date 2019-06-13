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
<form:form action="/AQSubmitted" method="post" modelAttribute="Additional">
    <table style=" margin-top: 100px !important;">
        <thead>
        <th colspan="2">Additional question</th>
        <th>Yes</th>
        <th>No</th>
        </thead>
        <tbody>
        <tr>
            <td colspan="2">The syllabus was explained at the beginning of the course.</td>
            <c:forEach items="${yesNoList}" var="it" varStatus="loop">
                <td>
                    <form:radiobutton path="q20" value="${it}"></form:radiobutton>
                </td>
            </c:forEach>
        </tr>

        <tr>
            <td colspan="2">The course was delivered as outlined in the syllabus.</td>
            <c:forEach items="${yesNoList}" var="it" varStatus="loop">
                <td>
                    <form:radiobutton path="q21" value="${it}"></form:radiobutton>
                </td>
            </c:forEach>
        </tr>

        <tr>
            <td colspan="2">Instructor explained the grading criteria of the course.</td>
            <c:forEach items="${yesNoList}" var="it" varStatus="loop">
                <td>
                    <form:radiobutton path="q22" value="${it}"></form:radiobutton>
                </td>
            </c:forEach>
        </tr>

        <tr>
            <td colspan="2" style="width: 488px; word-break: break-all;">Exams related to the course learning outcomes.</td>
            <c:forEach items="${yesNoList}" var="it" varStatus="loop">
                <td>
                    <form:radiobutton path="q23" value="${it}"></form:radiobutton>
                </td>
            </c:forEach>
        </tr>

        <tr>
            <td colspan="2" style="width: 488px; word-break: break-all;">Projects/ assignments related to the course learning outcomes.</td>
            <c:forEach items="${yesNoList}" var="it" varStatus="loop">
                <td>
                    <form:radiobutton path="q24"  value="${it}"></form:radiobutton>
                </td>
            </c:forEach>
        </tr>

        <tr>
            <td colspan="2">Comments (Additional Questions)</td>
            <td colspan="2">
                <form:textarea path="q25"></form:textarea>
            </td>
        </tr>


        <tr>
            <td colspan="2" style="text-align: center"><input type="reset" value="Reset"></td>
            <td colspan="2" style="text-align: center">
                <input type="submit" value="Next">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
