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
<form:form method="post">
    <div>
        <img style="width: 30%" src="<c:url value="/resources/images/uhcl.png" > </c:url>" alt="uhcl logo"></img>

    </div>
<table class="table table-bordered table-hover table-striped">
    <thead></thead>
    <tbody>
    <tr>

    </tr>

    <tr>

        <td>Please select a Course</td>
        <td>
            <select name="courseId">
                <c:forEach items="${courseList}" var="role">
                    <option value="${role.course_id}">${role.courseTitle}</option>
                </c:forEach>
            </select>
        </td>

    </tr>

    </tbody>
</table>
</form:form>
</body>
</html>
