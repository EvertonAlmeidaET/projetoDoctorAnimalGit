<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="br.com.doctoranimal.projeto.servlet.IniProjeto" %>
 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cadastro PET</title>
	</head>
	<body>
		<h1>Cadastro</h1>
		<form action="/doctoranimal/iniProjeto" method="post" id="cadastroPet">
			<span>Nome Animal:</span> <input type="text" name="nomeAnimal" />
			<br/>
			<span>Idade:</span> <input type="text" name="idadeAnimal" />
			<br/>
			<span>Sexo:</span> <input type="text" name="sexoAnimal" />
			<br/>
			<span>Especie:</span> <input type="text" name="especie" />
			<br />
			<textarea rows="3" cols="2" name="descricao"></textarea>
			<input type="submit">
			<br/>
		</form>
		
	</body>
</html>