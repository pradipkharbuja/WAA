<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Starbuck's Advice</title>
</head>
<body>
	<c:if test="${advice ==  false }">
		<h2>Ask for advice about your favorite roast:</h2>
		<p />
		<form action="roast" method="get">
			<select name="roast">
				<option value="-">--Choose Roast--</option>
				<option value="dark">Dark</option>
				<option value="medium">Medium</option>
				<option value="light">Light</option>
			</select> <br /> <br /> <input type="submit" value="Submit" />
		</form>
	</c:if>

	<c:if test="${advice eq true  }">
		<form method="get" action="index">
			<div id='advice'>Starbuck's ${roast} Coffees:</div>
			<table>
				<c:forEach items="${advices}" var="advice" varStatus="i">
					<tr style="background-color: ${i.count % 2 == 0 ? 'yellow':'cyan'}">
						<td>${advice}</td>
					</tr>
				</c:forEach>
			</table>
			<input type="submit" value="Back">
		</form>
	</c:if>

</body>
</html>