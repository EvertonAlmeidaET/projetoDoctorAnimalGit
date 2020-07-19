<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="br.com.doctoranimal.projeto.servlet.CadastroClienteServlet" %>
 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cadastro Cliente</title>
		<link rel="stylesheet" type="text/css" href="_style/form.css">
	</head>
	<body>
		<h1>Cadastro</h1>
		<form action="/doctoranimal/cadastroCliente" method="post" id="cadastroCliente">
			<fieldset id="cliete">
				<legend>Cadastro do cliente</legend>
					<!-- NOME CLIENTE -->
					<p>
						<label for="cNomeCliete">Nome Cliente:</label>
						<input type="text" name="nomeCliente" id="cNomeCliente" size="20" maxlength="30" placeholder="Nome Completo"/>
					</p>
					
					<!-- IDADE CLIENTE --> 
					<p>
						<label for="cIdadeCliente">Idade:</label>
						<input type="text" name="idadeCliente" id="cIdadeCliente" size="2" maxlength="2" placeholder="Idade"/>
					</p> 
					
					<!-- SEXO CLIENTE --> 
				 	<fieldset id="cSexoCliente">
                         <legend>Sexo</legend>
                         <input type="radio" name="sexoCliente" id="cMasc" checked="true" value="M"> <label for="cMasc">Masculino</label>
                         <br/>
                         <input type="radio" name="sexoCliente" id="cFem" value="F"> <label for="cFem">Feminino</label>
                    </fieldset>
                    
					<!-- CPF CLIENTE --> 
					<p>
						<label for="cCpfCliente">CPF Cliente:</label>
						<input type="text" name="cpfCliente" id="cCpfCliente" size="11" maxlength="12" placeholder="CPF"/>
					</p>
					
					<!-- BOTÃO ENVIAR FORMULADO --> 
					<input id="enviarformuladoCliente" type="submit">
			</fieldset>
		</form>
		
	</body>
</html>