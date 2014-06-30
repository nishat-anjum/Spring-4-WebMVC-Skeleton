<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel="stylesheet" type="text/css" href="/css/javaFest.css">
    <title>First Page of skeleton project</title>
</head>

<body>
<h2 class="align">
    This is Spring 4 MVC Skeleton project!
</h2>

<p class="align">New Contestant ?? Sign Up <a href="<c:url value='/new'/>">Here</a></p>

<p class="align">Already have account ?? Log In <a href="<c:url value='/login'/>">Here</a></p>

<p class="align"><a href="<c:url value='/list'/>">All Contestant List</a></p>

<p class="align">${success}</p>

<c:if test="${!empty studentList}">
    <table align="center" border="1">
        <th>Name</th>
        <th>University</th>
        <c:forEach items="${studentList}" var="item">
            <tr>
                <td>
                    <c:out value="${item.firstName}"/>
                </td>
                <td>
                    <c:out value="${item.university}"/>
                </td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>
