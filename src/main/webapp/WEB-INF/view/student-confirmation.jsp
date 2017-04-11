<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: din
  Date: 10.04.17
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
b
<!DOCTYPE html>
<html>
<head>
    <title>Student Conformation</title>
</head>
<body>


The student is confirmed: ${student.firstName} ${student.lastname}

<br><br/>

Country: ${student.country}

<br><br/>

Favorite Language: ${student.favoriteLanguage}

<br><br/>

Operating Systems:

<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">

        <li> ${temp} </li>

    </c:forEach>
</ul>

</body>
</html>
