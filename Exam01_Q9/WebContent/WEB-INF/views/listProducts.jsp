<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Exam</title>
</head>
<body>
	<h2>List of Products</h2>
	<c:if test="${category ne null}">
		<h2>Category: ${category.name}</h2>
	</c:if>
	<table>
		<tr>
			<th>Name</th>
			<th>Category</th>
			<th>Description</th>
		</tr>
		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.name}</td>
				<td>${product.category.name}</td>
				<td>${product.description}</td>
			</tr>
		</c:forEach>
	</table>
	<p>
		<button type="button"
			onclick='window.location.href="<c:url value ="/product"/>"'>
			Add Product</button>
	</p>
</body>
</html>