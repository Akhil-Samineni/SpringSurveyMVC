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
<form:form action="/OESubmitted" method="post" modelAttribute="OverallExp">
    <table  style=" margin-top: 100px !important;">
        <thead>
        <th style="width:660px">Overall Experience</th>
        <th>Yes</th>
        <th>No</th>
        </thead>
        <tbody>
        <tr>
            <td>This was a worthwhile class.</td>
            <c:forEach items="${yesNoList}" var="it" varStatus="loop">
                <td>
                    <form:radiobutton path="q26" value="${it}"></form:radiobutton>
                </td>
            </c:forEach>
        </tr>
        <tr>
            <td>Would you recommend this course to a fellow student?.</td>
            <c:forEach items="${yesNoList}" var="it" varStatus="loop">
                <td>
                    <form:radiobutton path="q27" value="${it}"></form:radiobutton>
                </td>
            </c:forEach>
        </tr>


        </tbody>
    </table>

    <table>
        <thead>
        <th colspan="2">Overall Experience</th>
        <th>Excellent</th>
        <th>Very good</th>
        <th>Good</th>
        <th>Fair</th>
        <th>Poor</th>
        </thead>
        <tbody>
        <tr>
            <td colspan="2">Overall, how do you rate your experience in this course?</td>
            <c:forEach items="${radioList}" var="it" varStatus="loop">
                <td>
                    <form:radiobutton path="q28" value="${it}"></form:radiobutton>
                </td>
            </c:forEach>
        </tr>
    </table>
    <table>
        <thead>
        <th colspan="2" style="width: 334px; word-break: all">Overall Experience</th>
        <th>A:0 – 4h</th>
        <th>B:5 – 8h</th>
        <th>C:9 - 12h</th>
        <th colspan="2">D:12 - 16h</th>

        </thead>
        <tbody>

        <tr>
            <td colspan="2" style="width: 328px; word-break: all">How many hours did you spend per week on preparation/homework for this course?</td>
            <td>
                <form:radiobutton path="q29" value="A"></form:radiobutton>
            </td>
            <td>
                <form:radiobutton path="q29" value="B"></form:radiobutton>
            </td>
            <td>
                <form:radiobutton path="q29" value="C"></form:radiobutton>
            </td>
            <td>
                <form:radiobutton path="q29" value="D"></form:radiobutton>
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
