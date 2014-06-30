<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel="stylesheet" type="text/css" href="/css/javaFest.css">
    <title>First Page of skeleton project</title>
</head>

<body>
<h2 class="align">
    Welcome to Java Fest!
</h2>
<form:form commandName="student" action="submit" method="POST">
    <table align="center">
        <tr>
            <td>First Name :</td>
            <td><form:input path="firstName"/></td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><form:input path="lastName"/></td>
        </tr>
        <tr>
            <td>Address:</td>
            <td><form:input path="address"/></td>
        </tr>
        <tr>
            <td>University:</td>
            <td><form:input path="university"/></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td>Cell No:</td>
            <td><form:input path="cellNo"/></td>
        </tr>
        <tr>
            <td><input align type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>