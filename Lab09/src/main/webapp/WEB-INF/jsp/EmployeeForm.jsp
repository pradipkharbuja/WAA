<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8" />
<title>Add Employee Form</title>
<link rel="stylesheet" href="<c:url value="/css/main.css"/>">
</head>
<body>

	<div id="global">
		<div>
			Language : <a href="?language=en_US">English</a> | <a
				href="?language=ne_NP">नेपाली</a>
		</div>

		<form:form commandName="employee" action="employee_save" method="post"
			enctype="multipart/form-data">
			<fieldset>
				<legend>Add an employee</legend>
				<p>
					<form:errors path="*" cssStyle="color : red;" />
				</p>
				<p>
					<label for="firstName"><spring:message code="firstName"
							text="View My Pets" /></label>
					<form:input path="firstName" />
				</p>
				<div style="text-align: center;">
					<form:errors path="firstName" cssStyle="color : red;" />
				</div>

				<p>
					<label for="lastName">Last Name: </label>
					<form:input path="lastName" />
				</p>
				<div style="text-align: center;">
					<form:errors path="lastName" cssStyle="color : red;" />
				</div>


				<p>
					<label for="birthDate">Date Of Birth: </label>
					<form:input path="birthDate" id="birthDate" />
					<form:errors path="birthDate" cssStyle="color : red;" />
				</p>
				<p>
					<label for="id">ID: </label>
					<form:input path="id" id="id" />
				<div style="text-align: center;">
					<form:errors path="id" cssStyle="color : red;" />
				</div>
				</p>
				<h4>Address:</h4>
				<p>
					<label for="street">Street: </label>
					<form:input path="address.street" id="street" />
				<div style="text-align: center;">
					<form:errors path="address.street" cssStyle="color : red;" />
				</div>
				</p>
				<p>
					<label for="state">State: </label>
					<form:input path="address.state" id="state" />
				<div style="text-align: center;">
					<form:errors path="address.state" cssStyle="color : red; " />
				</div>
				</p>
				<p>
					<label for="zipCode">Zip: </label>
					<form:input path="address.zipCode" id="zipCode" />
				<div style="text-align: center;">
					<form:errors path="address.zipCode" cssStyle="color : red; " />
				</div>
				</p>
				<div>
					<label for="image">Image: </label>
					<form:input type="file" path="image" />
				</div>
				<p id="buttons">
					<input id="reset" type="reset" tabindex="4"> <input
						id="submit" type="submit" tabindex="5" value="Add Employee">
				</p>
			</fieldset>
		</form:form>
	</div>
</body>
</html>
