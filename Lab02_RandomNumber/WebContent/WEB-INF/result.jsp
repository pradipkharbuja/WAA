<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!Doctype html>
<html>
<head>
<title>Result Page</title>
<style>
h1 {
	color: purple
}

.blue, .green, .red {
	font-weight: bold;
}

.blue {
	color: blue;
}

.green {
	color: green;
}

.red {
	color: red;
}
</style>
</head>
<body>

	<c:choose>
		<c:when test="${first == second }">
			<h1>And the results are:</h1>
			<p class="blue">The number ${first} is equal to ${second}</p>
		</c:when>

		<c:when test="${first > third }">
			<h1>And the results are:</h1>
			<p class="green">The number ${first} is greater to ${third }</p>
		</c:when>

		<c:when test="${first < fourth }">
			<h1>And the results are:</h1>
			<p class="red">The number ${first} is less to ${fourth}</p>
		</c:when>

		<c:otherwise>
			<h1>And the results are:</h1>
			<p>The number is ${first }</p>
			<p class="green">is NOT greater than ${second }</p>
			<p class="red">is NOT less than ${third }</p>
			<p class="blue">is NOT equal to ${fourth }</p>
		</c:otherwise>
	</c:choose>
</body>
</html>