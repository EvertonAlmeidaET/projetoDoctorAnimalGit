<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List, br.com.doctoranimal.projeto.servlet.CadastroClientePetServlet" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>LISTA DE CADASTRO</title>
	</head>
	<body>
		<p>Lista de Cadastro Cliente:</p>
		
		<ul>
			<c:forEach items="${dadosCadastrados}"  var="cadastro">
				<li>
					${cadastro.nomeCliente} - ${cadastro.animal.nomeAnimal} 
					<a href="/doctoranimal/removeClientePet?id=${cadastro.idCliente}&id2=${cadastro.animal.idPet}">remove</a>
					<a href="/doctoranimal/editarClientePet?id=${cadastro.idCliente}&id2=${cadastro.animal.idPet}">editar</a>
				</li>
			</c:forEach>
		
		</ul>	
	</body>
</html>