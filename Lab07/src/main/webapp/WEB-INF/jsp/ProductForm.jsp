<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Add Product Form</title>
<style type="text/css">
@import url(css/main.css);
</style>
</head>
<body>

	<div id="global">
		<spring:url value="product" var="action"></spring:url>
		<form:form commandName="product" action="${action}">
			<fieldset>
				<legend>Add a product</legend>
				<p>
					<form:label path="category">
						<spring:message code="category" text="Select Category" /> : 
					</form:label>
					<form:select id="category" path="category.id">
						<form:option value="0">--Select Category--</form:option>
						<form:options items="${categories }" itemLabel="name"
							itemValue="id" />
					</form:select>
				</p>

				<p>
					<form:label path="name">
						<spring:message code="product.name" /> :
					</form:label>
					<form:input path="name" tabindex="1" />
				</p>
				<p>
					<form:label path="description">
						<spring:message code="description" /> : </form:label>
					<form:input path="description" tabindex="2" />
				</p>
				<p>
					<form:label path="price">
						<spring:message code="price" /> : </form:label>
					<form:input path="price" tabindex="3" />
				</p>
				<p id="buttons">
					<input id="reset" type="reset" tabindex="4"> <input
						id="submit" type="submit" tabindex="5" value="Add Product">
				</p>
			</fieldset>
		</form:form>
	</div>
</body>
</html>
