<%@ taglib prefix="form"
			uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html"; pageEncoding="ISO-8859-1" %>

<!DOCTYPE>
<html>

<form:form modelAttribute="clientemv">
	<form:label path="cliente.nome">Nome:</form:label>
	<form:input path="cliente.nome"/>
	
	<form:label path="cliente.cpf"> CPF: </form:label>
	<form:input path="cliente.cpf"/>
	
	<form:label path="cliente.dataNascimento">Data de Nascimento: </form:label>
	<form:input path="cliente.dataNascimento"/>
	
	<form:label path="cliente.sexo">Sexo:</form:label>
	<form:select path="cliente.sexo">
		<form:option value="M">Masculino</form:option>
		<form:option value="F">Feminino</form:option>
	</form:select>

	<form:label path="cliente.senha">Senha:</form:label>
	<form:password path="cliente.senha"/>
	
	<form:label path="confirmacaoSenha">Confirme a senha:</form:label>
	<form:password path="confirmacaoSenha"/>
	
	<form:label path="cliente.receberOfertaPorEmail">Deseja receber ofertas por email?</form:label>
	
	<form:checkbox path="cliente.receberOfertaPorEmail" 
					value="cliente.receberOfertaPorEmail"/>
					
	<input type="submit" value="salvar" />
</form:form>
</html>