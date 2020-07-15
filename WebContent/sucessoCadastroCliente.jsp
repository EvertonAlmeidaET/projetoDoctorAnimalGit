<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cadastro Sucesso</title>
	</head>
	<body>
		<span>Cliente ${ cadastroCliente } Cadastrado com sucesso!</span>
		<br/>
		<span>Cliente <c:out value="${cadastroCliente.nomeCliente}"/> Cadastrado com sucesso!</span>
		<p><a href="formCadastro.jsp">Cadastrar novo Cliente</a></p>
	</body>
</html>