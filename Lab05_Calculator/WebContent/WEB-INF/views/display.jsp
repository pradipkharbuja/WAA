<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/style.css">
<title>Calculator</title>
</head>
<body>
	<h1>Calculator</h1>

	<c:if test="${errors !=null }">
		<p id="errors">Error(s)!</p>
		<ul>
			<c:forEach var="error" items="${errors}">
				<li>${error}</li>
			</c:forEach>
		</ul>
	</c:if>
	<form method="post" action="">
		<input type="text" name="add1" size="2" value="${calculator.add1}" />
		+ <input type="text" name="add2" value="${calculator.add2}" size="2" />
		= <input type="text" name="sum" value="" size="2" readonly /><br />
		<input type="text" name="prod1" value="${calculator.prod1}" size="2" />
		* <input type="text" name="prod2" value="${calculator.prod2}" size="2" />
		= <input type="text" name="product" value="" size="2" readonly /><br />
		<input type="submit" value="Submit" />
	</form>
</body>
</html>