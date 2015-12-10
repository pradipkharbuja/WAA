<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Employee Details</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<img src="<spring:url value='/resource/images/kemosabes.jpg' />" />
				<h1>Our People</h1>
				<p>All of the contributors to our Community!!!</p>
			</div>
			<a href="<c:url value="/employees/add" />"
				class="btn btn-danger btn-mini pull-right">Add a new one</a>

		</div>
	</section>

	<section class="container">
		<div class="row">
			<h3>${employee.firstName} ${employee.lastName}</h3>
			<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
				<div class="thumbnail">
					<div class="caption">
						<p>Age - ${employee.age}</p>
						<p>Title - ${employee.title}</p>
						<p>NUMBER - ${employee.employeeNumber}</p>
						<p>City - ${employee.address.city}</p>
					</div>
				</div>
			</div>

		</div>
	</section>
</body>
</html>
