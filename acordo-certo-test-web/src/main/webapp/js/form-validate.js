$("#formDadosCadastrais").validate({
	rules : {
		nome : {
			required : true,
			minlength : 3
		},
		sexo : {
			required : true
		},
		estado : {
			required : true
		}
	},
	messages : {
		nome : {
			required : "Por favor, informe seu nome",
			minlength : "O nome deve ter pelo menos 3 caracteres"
		},
		sexo : {
			required : "É necessário informar um sexo"
		},
		estado : {
			required : "É necessário informar um estado"
		}
	},
	errorPlacement : function(error, element) {
		error.insertAfter($(element).parent());
	},
	submitHandler : function(form) {
		console.log($('#nome').val());
		console.log($('input[name="sexo"]:checked').val());
		console.log($('#estado').val());
		
		submitForm();
	}
});

var submitForm = function() {
	$.ajax({
		url: '/acordocerto/form',
		method: 'POST',
		dataType: 'json',
		data: JSON.Serialize($('#formDadosCadastrais')),
		success: function(json) {
			console.log(json);
		},
		error: function(jqXHR, textStatus, errorThrown ) {
			console.error(jqXHR);
			console.error(textStatus);
			console.error(errorThrown);
		}
	});
}