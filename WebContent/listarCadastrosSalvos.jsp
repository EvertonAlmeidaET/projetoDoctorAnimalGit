<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List, br.com.doctoranimal.projeto.servlet.CadastroPetServlet, 
	br.com.doctoranimal.projeto.servlet.CadastroClienteServlet" %>

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
				<li>${cadastro}</li>
				<li>${cadastro.animal}</li>
				
			</c:forEach>
		
		</ul>	
	</body>
</html>