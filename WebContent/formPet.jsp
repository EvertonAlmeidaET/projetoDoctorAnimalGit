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
		<link rel="stylesheet" type="text/css" href="_style/form.css">
		<script language="javascript" src="_javascript/scriptform.js"></script>
	</head>
	<body>
		
		<p>
			<c:if test="${not cadastroCliente}">
				Cliente ${cadastroCliente.nomeCliente} cadastrado com sucesso!
			</c:if>
		</p>
	
		<h1>CadastroPET</h1>
		<form action="/doctoranimal/cadastroPet" method="post" id="cadastroPet">
			<fieldset id="pet">
				<legend>Cadastro do Animal</legend>
					<!-- NOME ANIMAL -->
					<p>
						<label for="cNomeAnimal">Nome Animal:</label>
						<input type="text" name="nomeAnimal" id="cNomeAnimal" size="20" maxlength="30" placeholder="Nome do Animal" onkeypress="return formatarApenasLetras()"/>
					</p>
					
					<!-- IDADE ANIMAL -->
					<p>
						<label for="cIdadeAnimal">Idade do Animal:</label>
						<input type="text" name="idadeAnimal" id="cIdadeAnimal" size="2" maxlength="2" placeholder="Idade" onkeypress="return formatarApenasNumero()"/>
					</p>
					
					<!-- SEXO CLIENTE --> 
				 	<fieldset id="cSexoAnimal">
                         <legend>Sexo do Animal</legend>
                         <input type="radio" name="sexoAnimal" id="cMasc" checked="true" value="M"> <label for="cMasc">Masculino</label>
                         <br/>
                         <input type="radio" name="sexoAnimal" id="cFem" value="F"> <label for="cFem">Feminino</label>
                    </fieldset>
                    
                    <!-- ESPECIE/RAÇA ANIMAL -->
					<p>
						<label for="cRaca">Raça:</label>
						<select name="racaAnimal" id="cRaca">
							<option value="null">Selecione...</option>
							<optgroup label="Cachorro">
								<option value="Poodle">Poodle</option>
								<option value="Shih-tzu">Shih tzu</option>
								<option value="Pastor-alemao">Pastor alemão</option>
								<option value="Pinscher">Pinscher</option>
								<option value="Pit-bull">Pit bull</option>
								<option value="Vira-Lata">Vira-Lata</option>
							</optgroup>
							<optgroup label="Gato">
								<option value="Peterbald">Peterbald</option>
								<option value="angora-turco">angorá turco</option>
								<option value="Maine-coon">Maine coon</option>
								<option value="Sphynx">Sphynx</option>
							</optgroup>
							<optgroup label="Rato">
								<option value="Camundongo">Camundongo</option>
								<option value="Porquinho-da-India">Porquinho da-India </option>
								<option value="Ratazana">Ratazana</option>
								<option value="Chinchila">Chinchila </option>
							</optgroup>
						</select>
					</p>
					
				  	<!-- DESCRIÇÃO -->
                    <p><label for="cDescricao">Descricao:</label>
                    	<br/>
                    	<textarea name="descricao" id="cDescricao" cols="35" rows="5" placeholder="Comente sobre o Animal"></textarea>
                    </p>
                    
					<!-- BOTÃO ENVIAR FORMULADO --> 
					<input id="enviarformuladoCliente" type="submit">
			</fieldset>
		</form>
		
	</body>
</html>