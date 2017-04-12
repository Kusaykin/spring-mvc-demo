<%--
  Created by IntelliJ IDEA.
  User: din
  Date: 12.04.17
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <style>
        .error{color:red}
    </style>
    <title>Customer Registration Form</title>
</head>
<body>

<i>Fill out the form. Asterisk (*) means required.</i>
<br><br>
    <form:form action="processForm" modelAttribute="customer">

        First name: <form:input path="firstName"/>

        <br><br>

        Last name (*): <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>

        <br><br>

        <input type="submit" value="Submit">

    </form:form>


</body>
</html>
