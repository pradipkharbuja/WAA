<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Exam</title>
</head>
<body>
	<h4>The product has been saved.</h4>

	<h5>Details:</h5>
	Product Name: ${product.name}
	<br /> Category: ${product.category.name}
	<br /> Description: ${product.description}
	<br /> Price: $${product.price}

	<form action="categories" method="get">
		<input id="submit" type="submit" value="List categories">
	</form>
</body>
</html>