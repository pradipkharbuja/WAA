function makeAjaxCall() {
	var data = JSON.stringify(serializeObject($('#employeeForm')));

	$
			.ajax({
				type : "POST",
				data : data,
				contentType : "application/json",
				url : "",
				success : function(result) {
					$('#formInput').html("");
					$("#formInput")
							.append(
									'<H3 align="center"> New Employee Information <H3>');
					$('#formInput').append(
							"<H4 align='center'>First Name:  "
									+ result.firstName + "</h4>");
					$('#formInput').append(
							"<H4 align='center'>Last Name: " + result.lastName
									+ "</h4>");
					$('#formInput').append(
							"<H4 align='center'>Email: " + result.email
									+ "</h4>");
					$("#formInput")
							.append(
									'<h4 align="center"> <a href="#" onclick="toggle_visibility(\'formInput\');resetForm(\'employeeForm\');"><b>EXIT</b> </a> </h4>');
					make_visible('formInput');
					make_hidden('errors');
				},

				error : function(errorObject) {
					if (errorObject.responseJSON.errorType == "ValidationError") {
						var errorHTML = '<h1 align="center">Errors !!!</h1>';

						var errorMessages = errorObject.responseJSON.errors;
						for (var i = 0; i < errorMessages.length; i++) {
							errorHTML += errorMessages[i].message + '<br>';
						}

						$('#errors').html(errorHTML);
						make_visible('errors');
					} else {
						alert(errorObject.responseJSON.errors[0].message);
					}
				}

			});
}

toggle_visibility = function(id) {
	var element = document.getElementById(id);
	if (element.style.display == 'block')
		element.style.display = 'none';
	else
		element.style.display = 'block';
}

make_hidden = function(id) {
	var element = document.getElementById(id);
	element.style.display = 'none';
}

make_visible = function(id) {
	var element = document.getElementById(id);
	element.style.display = 'block';
}

resetForm = function(id) {
	var element = document.getElementById(id);
	$(element)[0].reset();

}

// Translate form to array
// Then put in JSON format
function serializeObject(form) {
	var jsonObject = {};
	var array = form.serializeArray();
	$.each(array, function() {
		jsonObject[this.name] = this.value;
	});
	return jsonObject;

};

