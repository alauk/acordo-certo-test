<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário</title>
</head>
<body>
	<h1>INSIRA SEUS DADOS CADASTRAIS</h1>
	<form id="formDadosCadastrais" action="/acordocerto/form">
		<span>Nome: 
			<input type="text" id="nome" name="nome" />
		</span><br>
		<span>Sexo: 
			<input type="radio" name="sexo" value="M" checked /> M 
			<input	type="radio" name="sexo" value="F" /> F
		</span><br> 
		<span>
			Estado de Nascimento: 
		<select id="estado" name="estado">
			<option value=""></option>
			<option value="AC">Acre</option>
			<option value="AL">Alagoas</option>
			<option value="AP">Amapá</option>
			<option value="AM">Amazonas</option>
			<option value="BA">Bahia</option>
			<option value="CE">Ceará</option>
			<option value="DF">Distrito Federal</option>
			<option value="ES">Espírito Santo</option>
			<option value="GO">Goiás</option>
			<option value="MA">Maranhão</option>
			<option value="MT">Mato Grosso</option>
			<option value="MS">Mato Grosso do Sul</option>
			<option value="MG">Minas Gerais</option>
			<option value="PA">Pará</option>
			<option value="PB">Paraíba</option>
			<option value="PR">Paraná</option>
			<option value="PE">Pernambuco</option>
			<option value="PI">Piauí</option>
			<option value="RJ">Rio de Janeiro</option>
			<option value="RN">Rio Grande do Norte</option>
			<option value="RS">Rio Grande do Sul</option>
			<option value="RO">Rondônia</option>
			<option value="RR">Roraima</option>
			<option value="SC">Santa Catarina</option>
			<option value="SP">São Paulo</option>
			<option value="SE">Sergipe</option>
			<option value="TO">Tocantins</option>
		</select>
		</span><br>
		<span>
			<input type="submit" value="Enviar">
		</span>
	</form>
	<script src="/js/jquery.min.js"></script>
	<script src="/js/jquery.validate.min.js"></script>
	<script src="/js/form-validate.js"></script>
</body>
</html>