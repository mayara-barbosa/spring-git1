<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset= ISO-8859-1">
<title>Detalhe</title>
</head>
<body>
<h1>${produto.nome}</h1>
<c:url value="/imagens/${produto.id}.jpg" var="imagens"></c:url>
<img src="${imagens}"/>
<p>
<fmt:formatNumber value="${produto.preco}"
						type="currency"/> </p>
</body>
</html>