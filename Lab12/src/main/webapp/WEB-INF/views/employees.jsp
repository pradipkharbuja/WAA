<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Employees</title>
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

			<security:authorize access="isAnonymous()">
				<a href="<c:url value="/spring_security_login" />"
					class="btn btn-danger btn-mini pull-right"
					style="margin-right: 20px;">Login</a>
			</security:authorize>

			<security:authorize access="isAuthenticated()">
				<a href="<c:url value="/doLogout" />"
					class="btn btn-danger btn-mini pull-right"
					style="margin-right: 20px;"> Welcome <security:authentication
						property="principal.username" /> Logout
				</a>

			</security:authorize>
			${userMessage}
		</div>
	</section>

	<section class="container">
		<div class="row">
			<c:forEach items="${employees}" var="employee">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<div class="caption">
							<h3>First Name - ${employee.firstName}</h3>
							<h3>Last Name - ${employee.lastName}</h3>
							<p>Age - ${employee.age}</p>
							<p>Title - ${employee.title}</p>
							<p>NUMBER - ${employee.employeeNumber}</p>
							<p>
								<a
									href="<spring:url value="/employees/employee?id=${employee.employeeNumber}" />"
									class="btn btn-primary"> <span
									class="glyphicon-info-sign glyphicon" /></span> Details
								</a>
							</p>

						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>
