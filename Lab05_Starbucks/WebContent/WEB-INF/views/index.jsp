<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Starbuck's</title>
</head>
<body>
	<c:if test="${user != null }">Welcome ${user } | <a
			href="logout">Logout</a>
	</c:if>

	<h2>Ask for advice about your favorite roast:</h2>
	<p />
	<form action="roast" method="get">
		<select name="roast"
			<c:if test="${user == null }">disabled="disabled"</c:if>>
			<option value="-">--Choose Roast--</option>
			<option value="dark">Dark</option>
			<option value="medium">Medium</option>
			<option value="light">Light</option>
		</select> <br /> <br /> <input type="submit" value="Submit"
			<c:if test="${user == null }">disabled="disabled"</c:if> />
	</form>
	<div id='advice'></div>
	<p />
	<c:if test="${user == null }">
	Login:
	<form action="login" method="post">
			Name: <input type="text" name="username" size="9" value="" /><br />
			Password: <input type="password" name="password" size="9" value="" /><br />
			<br /> <input type="submit" value="Log In" />
		</form>
	</c:if>
</body>
</html>