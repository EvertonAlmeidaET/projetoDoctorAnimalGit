<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="br.com.doctoranimal.projeto.servlet.CadastroCliente" %>
 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cadastro Pessoa</title>
	</head>
	<body>
		<h1>Cadastro</h1>
		<form action="/doctoranimal/CadastroCliente" method="post" id="cadastroCliente">
			<span>Nome Cliente:</span> <input type="text" name="nomeCliente" />
			<br/>
			<span>Idade:</span> <input type="text" name="idadeCliente" />
			<br/>
			<span>Sexo:</span> <input type="text" name="sexoCliente" />
			<br/>
			<span>CPF:</span> <input type="text" name="cpfCliente" />
			<br />
			<input type="submit">
			<br/>
		</form>
		
	</body>
</html>