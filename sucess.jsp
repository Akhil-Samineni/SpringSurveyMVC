<%--
  Created by IntelliJ IDEA.
  User: akhil
  Date: 4/23/2019
  Time: 6:48 PM
  To change this template use File | Settings | File Templates.
--%>

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
<h1>Sucess page</h1>
<form:form action="/courseSubmit" method="post" modelAttribute="courseInstructor">
    <div style="text-align: center">
        <h2 style="float: right"><a href="/">Logout</a></h2>
        <h2>This Mock Survey is for a Course Project. Not the one we use at UHCL.</h2>

        <div>
            <img style="width: 30%" src="<c:url value="/resources/images/uhcl.png" > </c:url>" alt="uhcl logo"></img>

        </div>

        <h3>
            Project-5: Java Server Faces Project - Implement the Survey<br>
        </h3>

        <table class="table table-bordered table-hover table-striped">
            <thead></thead>
            <tbody>
            <tr>

            </tr>

            <tr>

                <td>Course</td>
                <td>
                    <form:select path="course_id">
                        <c:forEach items="${courseList}" var="role">
                            <option value="${role.course_id}">${role.courseTitle}</option>
                        </c:forEach>
                    </form:select>
                </td>

            </tr>
            <tr>

                <td>Instructor</td>
                <td>
                    <form:select path="instructor_id">
                        <c:forEach items="${instructorList}" var="role">
                            <option value="${role.instructor_id}">${role.instFullName}</option>
                        </c:forEach>
                    </form:select>
                </td>

            </tr>


            </tbody>
        </table>
        <br></br>

        <form:form modelAttribute="taApproaches" method="post">
            <h3 style="text-decoration: underline">PLEASE CROSS THE RESPONSE THAT REPRESENTS YOUR OPINION.</h3>
            <table style="border: 1px solid #ddd">
                <thead>
                <th colspan="2">Teaching approaches</th>
                <th>Strongly agree</th>
                <th>Agree</th>
                <th>Neutral</th>
                <th>Disagree</th>
                <th>Strongly Disagree</th>
                </thead>

                <tr>
                    <td colspan="2">The instructor stimulated my interest in the subject.</td>

                    <c:forEach items="${radioList}" var="it" varStatus="loop">
                        <td>
                            <form:radiobutton path="q1" value="${it}"></form:radiobutton>
                        </td>
                    </c:forEach>

                </tr>

                <tr>
                    <td colspan="2">The instructor managed classroom time and pace well.</td>

                    <c:forEach items="${radioList}" var="it" varStatus="loop">
                        <td>
                            <form:radiobutton path="q2" value="${it}"></form:radiobutton>
                        </td>
                    </c:forEach>
                </tr>

                <tr>
                    <td colspan="2">The instructor was organized and prepared for every class.</td>

                    <c:forEach items="${radioList}" var="it" varStatus="loop">
                        <td>
                            <form:radiobutton path="q3" value="${it}"></form:radiobutton>
                        </td>
                    </c:forEach>
                </tr>

                <tr>
                    <td colspan="2">The instructor encouraged discussions and responded to questions.</td>

                    <c:forEach items="${radioList}" var="it" varStatus="loop">
                        <td>
                            <form:radiobutton path="q4" value="${it}"></form:radiobutton>
                        </td>
                    </c:forEach>
                </tr>
                <tr>
                    <td colspan="2">The instructor demonstrated in-depth knowledge of the subject.</td>

                    <c:forEach items="${radioList}" var="it" varStatus="loop">
                        <td>
                            <form:radiobutton path="q5" value="${it}"></form:radiobutton>
                        </td>
                    </c:forEach>
                </tr>

                <tr>
                    <td colspan="2">The instructor appeared enthusiastic and interested.</td>

                    <c:forEach items="${radioList}" var="it" varStatus="loop">
                        <td>
                            <form:radiobutton path="q6" value="${it}"></form:radiobutton>
                        </td>
                    </c:forEach>
                </tr>

                <tr>
                    <td colspan="2" style="width: 400px; word-break: break-all;">The instructor used a variety of instructional methods to reach the course
                        objectives (e.g. group discussions, student presentations, etc.)</td>
                    <c:forEach items="${radioList}" var="it" varStatus="loop">
                        <td>
                            <form:radiobutton path="q7" value="${it}"></form:radiobutton>
                        </td>
                    </c:forEach>
                </tr>

                <tr>
                    <td colspan="2">The instructor challenged students to do their best work.</td>

                    <c:forEach items="${radioList}" var="it" varStatus="loop">
                        <td>
                            <form:radiobutton path="q8" value="${it}"></form:radiobutton>
                        </td>
                    </c:forEach>
                </tr>
            </table>

            <table>
                <thead>
                <th style="width:660px"></th>
                <th>Yes</th>
                <th>No</th>
                </thead>
                <tbody>
                <tr>
                    <td>The instructor was accessible outside of class.</td>

                    <c:forEach items="${yesNoList}" var="it" varStatus="loop">
                        <td>
                            <form:radiobutton path="q9" value="${it}"></form:radiobutton>
                        </td>
                    </c:forEach>
                </tr>

                <tr>
                    <td>Did the instructor actively attempt to prevent cheating in this course?</td>

                    <c:forEach items="${yesNoList}" var="it" varStatus="loop">
                        <td>
                            <form:radiobutton path="q10" value="${it}"></form:radiobutton>
                        </td>
                    </c:forEach>
                </tr>

                <tr>
                    <td>Comments (Teaching approaches)</td>
                    <td colspan="2">
                        <form:textarea path="q11" style="width:100%"></form:textarea>
                    </td>
                </tr>

                </tbody>
            </table>
        </form:form>

        <table>

            <tr>
                <td colspan="2" style="text-align: center"><input type="reset" value="Reset"></td>
                <td colspan="1" style="text-align: center"><input type="submit" value="Next"></td>

            </tr>
        </table>
    </div>
</form:form>

</body>
</html>
