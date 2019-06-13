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
<form:form action="/CSTFormSubmitted" method="post" modelAttribute="CStimp">
    <table  style=" margin-top: 100px !important;">
        <thead>
        <th colspan="7">COMMENTS ON STRENGTHS AND WAYS OF IMPROVEMENT</th>
        </thead>

        <tbody>

        <tr>
            <td colspan="1" style="width: 660px; word-break: all">What changes would you recommend to improve this course?</td>
            <td colspan="6">
                <form:textarea path="q33" cssStyle="width: 100%" ></form:textarea>
            </td>
        </tr>
        <tr>
            <td colspan="1">What did you like best about your instructors teaching?</td>
            <td colspan="6">
                <form:textarea path="q34" cssStyle="width: 100%" ></form:textarea>
            </td>
        </tr>

        <tr>
            <td colspan="1">What did you like least about your instructor’s teaching?</td>
            <td colspan="6">
                <form:textarea path="q35" cssStyle="width: 100%"></form:textarea>
            </td>
        </tr>

        <tr>
            <td colspan="1">Any further, constructive comment:?</td>
            <td colspan="6">
               <form:textarea path="q36" cssStyle="width: 100%"></form:textarea>
            </td>
        </tr>

        <tr>
            <td colspan="4" style="text-align: center"><input type="reset" value="Reset"></td>
            <td colspan="3" style="text-align: center">
                <input type="submit" value="Submit">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
