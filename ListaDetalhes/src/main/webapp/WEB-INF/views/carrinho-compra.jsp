<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;  charset=ISO-8859-1">
<title>Carrinho</title>
</head>
<body>

	<h1>Seu carrinho de compras</h1>

	<table>
		<thead>
			<tr>
				<th>Produto</th>
				<th>Quantidade</th>
				<th>Valor Unitário</th>
				<th>Valor Total</th>
			</tr>
		</thead>
		<tbody>
			<c:set var="total" value="0" />
			<c:forEach var="item" items="${sessionScope.CarrinhoCompra.itens}">

				<tr>
					<td>${item.produto.nome}</td>
					<td>${item.quantidade}</td>
					<td><fmt:formatNumber value="${item.produto.preco}"
							type="currency" /></td>
					<td><c:set value="${item.produto.preco * item.quantidade}"
							var="precoUnitario" /> <fmt:formatNumber value="${precoUnitario}"
							type="currency" /></td>
				</tr>

				<c:set var="total" value="${total + precoUnitario}" />

			</c:forEach>

			<tr>
				<td colspan="4">Total: <fmt:formatNumber value="${total}"
						type="currency" />
				</td>
			</tr>

		</tbody>

	</table>

</body>
</html>