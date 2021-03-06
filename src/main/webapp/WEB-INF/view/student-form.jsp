<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: din
  Date: 10.04.17
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName"/>

    <br><br>

    Last name: <form:input path="lastname"/>

    <br><br>

    Country:

   <%-- <form:select path="country">

        <form:options items="${student.countryOptions}"/>

    </form:select>--%>
    <br><br>

    <form:select path="country">
        <form:options items="${theCountryOptions}" />
    </form:select>

    <br><br>

    Favorite Language:

    Java <form:radiobutton path="favoriteLanguage" value="Java"/>
    C# <form:radiobutton path="favoriteLanguage" value="C#"/>
    PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
    Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>

    <br><br>

    Operating Systems:
    
    Linux <form:checkbox path="operatingSystems" value="Linux"/>
    Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
    Windows <form:checkbox path="operatingSystems" value="Windows"/>

    <br><br>

    <input type="submit" value="Submit"/>

</form:form>


</body>
</html>
