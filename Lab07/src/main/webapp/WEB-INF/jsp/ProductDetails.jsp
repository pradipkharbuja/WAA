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
		<h4>The product has been saved.</h4>

		<h5>Details:</h5>
		<spring:message code="product.name" />
		: ${product.name}<br />
		<spring:message code="category" />
		: ${product.category.name}<br />
		<spring:message code="description" />
		: ${product.description}<br />
		<spring:message code="price" />
		: $${product.price}


		<form:form commandName="product" action="listproducts" method="get">
			<input id="submit" type="submit" value="List products">
		</form:form>

	</div>
</body>
</html>