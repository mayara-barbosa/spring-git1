<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE>
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO=8859-1">
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-2.2.2.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<title>Novo Cliente</title>

</head>

<body>

<div class='container'>
	<div class="page-header">
	  <h1>Lojinha - Cadastro</h1>
	</div>

<form:form modelAttribute="clientemv" role="form">
	<div>
		<form:label path="cliente.nome">Nome:</form:label>
		<form:input path="cliente.nome"  />
		<form:errors path="cliente.nome"></form:errors>
	</div>

	<div>
		<form:label path="cliente.cpf"> CPF: </form:label>
		<form:input path="cliente.cpf"  />
		<form:errors path="cliente.cpf"></form:errors>
	</div>

	<div>
		<form:label path="cliente.dataNascimento">Data de Nascimento: </form:label>
		<form:input path="cliente.dataNascimento" type="date" />
		<form:errors path="cliente.dataNascimento"></form:errors>
	</div>

	<div>
		<form:label path="cliente.sexo">Sexo:</form:label>
		<form:select path="cliente.sexo" >
			<form:option value="M">Masculino</form:option>
			<form:option value="F">Feminino</form:option>
		</form:select>
	</div>
	

	<div >
		<form:label path="cliente.senha">Senha:</form:label>
		<form:password path="cliente.senha" />
		<form:errors path="cliente.senha"></form:errors>
	</div>

	<div >
		<form:label path="confirmacaoSenha">Confirme a senha:</form:label>
		<form:password path="confirmacaoSenha" />
		<form:errors path="confirmacaoSenha"></form:errors>
	</div>

	<div >
		<form:label path="cliente.receberOfertaPorEmail">Deseja receber ofertas por email?</form:label>

		<form:checkbox path="cliente.receberOfertaPorEmail"
			value="cliente.receberOfertaPorEmail" class="checkbox" />
		<form:errors path="cliente.receberOfertaPorEmail"></form:errors>
	</div>

	<input type="submit" value="salvar" />
</form:form>
</div>
</body>
</html>