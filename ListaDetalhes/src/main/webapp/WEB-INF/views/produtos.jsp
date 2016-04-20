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
	
	<c:choose>
		<c:when test="${empty cookie['nome']}">
			<p><a href="usuario">Informe seu nome</a></p>
		</c:when>
		<c:otherwise>
			<p>Seja bem vindo(a) ${cookie['nome'].value}</p>
		</c:otherwise>
	</c:choose>
	<ul>
	<div class="row">
	<c:forEach items="${produtos}" var="produto">	
	<c:url value="/imagens/${produto.id }.jpg" var="imagens"></c:url>
		  <div class="col-sm-6 col-md-4">
		    <div class="thumbnail">
		      <div class="caption">
		        <h3>${produto.nome}</h3>
		        <p><a href="detalhe/${produto.id}" class="btn btn-primary" role="button">Saiba mais</a></p>
		      </div>
		    </div>
		  </div>
		
	</c:forEach>
   </div>
	
	</ul>

</body>

</html>
