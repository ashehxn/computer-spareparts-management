<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
</head>
<body>

	<c:if test="${not empty requestScope.errorMessage}">
        <div class="alert alert-danger" role="alert">
			${requestScope.errorMessage}
		</div>
	</c:if>

	<form action="AdminLoginServlet" method="post">
		Username: <input type="text" name="uid"> <br>
		Password: <input type="password" name="pass"> <br>
		
		<input type="submit" name="submit" value="Login">
	</form>

</body>
</html>