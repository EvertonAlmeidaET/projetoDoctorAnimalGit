<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.com.doctoranimal.projeto.servlet.CadastroClienteServlet" %>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cadastro PET</title>
	</head>
	<body>
		
	<p>
		<c:if test="${not empty cadastroCliente}">
			Cliente ${cadastroCliente.nomeCliente} cadastrado com sucesso!
		</c:if>
	</p>
	
		<h1>CadastroPET</h1>
		<form action="/doctoranimal/cadastroPet" method="post" id="cadastroPet">
			<span>Nome Animal:</span> <input type="text" name="nomeAnimal" />
			<br/>
			<span>Idade:</span> <input type="text" name="idadeAnimal" />
			<br/>
			<span>Sexo:</span> <input type="text" name="sexoAnimal" maxlength="1"/>
			<br/>
			<span>Especie:</span> <input type="text" name="especie" />
			<br />
			<textarea rows="5" cols="20" name="descricao"></textarea>
			<input type="submit">
			<br/>
		</form>
		
	</body>
</html>