<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html" pageEncoding="ISO-8859-1"%>

<!DOCTYPE>
<html>
<head> 
<meta > 
</head> 
<title> LOJA VIRTUAL</title>
<body> 

	<h1> Lista de Produtos</h1>
	<ul>
	<c:forEach items="${produtos}" var="produto">
		<li> <a href="detalhe/${produto.id}"> ${produto.nome}</a></li>
	</c:forEach>
	</ul>

</body>

</html>
