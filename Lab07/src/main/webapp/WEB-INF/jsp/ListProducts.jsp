<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE HTML>
<html>
<head>
<title>Save Product</title>
<style type="text/css">
@import url(css/main.css);
</style>
</head>
<body>
	<div id="global">
		<h2>List of Products</h2>

		<table>
			<tr>
				<th><spring:message code="product.name" /></th>
				<th><spring:message code="price" /></th>
				<th><spring:message code="description" /></th>
			</tr>

			<c:forEach var="product" items="${products}">
				<tr>
					<td>${product.name}</td>
					<td>${product.category.name}</td>
					<td>${product.description}</td>
				</tr>
			</c:forEach>
		</table>

		<form:form commandName="product" method="get" action="product">
			<input id="submit" type="submit" value="Add product">
		</form:form>

	</div>
</body>
</html>