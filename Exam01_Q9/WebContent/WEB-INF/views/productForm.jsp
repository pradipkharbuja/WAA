<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Exam</title>
</head>
<body>
	<form action="product" method="post">
		<legend> Add a product </legend>
		<p>
			<label for="category.name"> Category: </label> <input type="text"
				id="category.name" name="category.name" value="${category.name}"
				style="" readonly>
		</p>
		<p>
			<label for="name"> Product Name: </label> <input type="text"
				id="name" name="name">
		</p>
		<p>
			<label for="description"> Description: </label> <input type="text"
				id="description" name="description">
		</p>
		<p>
			<label for="price"> Price: </label> <input type="text" id="price"
				name="price">
		</p>
		<p id="buttons">
			<input id="reset" type="reset"> <input id="submit"
				type="submit" value="Add Product">
		</p>

	</form>
</body>
</html>