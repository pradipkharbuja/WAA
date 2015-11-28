<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Exam</title>
</head>
<body>
	<h2>List of Categories</h2>
	<table>
		<tr>
			<th>Name</th>
			<th>Category</th>
		</tr>
		<c:forEach var="category" items="${categories}">
			<tr>
				<td>${category.name}</td>
				<c:url value="categories/selectCategory" var="productList">
					<c:param name="categoryId" value="${category.id}" />
				</c:url>
				<td><a href="${productList}"> See Products </a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>