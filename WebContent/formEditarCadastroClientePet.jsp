<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="br.com.doctoranimal.projeto.servlet.CadastroClientePetServlet" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
 
 <c:url value="/alteraClientePet" var="linkServletAlteraClientePet"/>
 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Editar Cadastro Cliente Pet</title>
		<link rel="stylesheet" type="text/css" href="_style/form.css">
		<script language="javascript" src="_javascript/scriptform.js"></script>
	</head>
	<body>
		<h1>Cadastro</h1>
		<form action="${linkServletAlteraClientePet}" method="post" id="cadastroCliente">
			<input type="hidden" id="cIdCliente" name="idCliente" value="${editaClintePet.idCliente}">
			<fieldset id="cliete">
				<legend>Cadastro do cliente</legend>
					<!-- NOME CLIENTE -->
					<p>
						<label for="cNomeCliete">Nome Cliente:</label>
						<input type="text" name="nomeCliente" id="cNomeCliente" size="20" maxlength="30" placeholder="Nome Completo" onkeypress="return formatarApenasLetras()"
						value="${editaClintePet.nomeCliente}"/>
					</p>
					
					<!-- IDADE CLIENTE --> 
					<p>
						<label for="cIdadeCliente">Idade:</label>
						<input type="text" name="idadeCliente" id="cIdadeCliente" size="2" maxlength="2" placeholder="Idade" onkeypress="return formatarApenasNumero()"
						value="${editaClintePet.idade}"/>
					</p> 
                    
					<!-- CPF CLIENTE --> 
					<p>
						<label for="cCpfCliente">CPF Cliente:</label>
						<input type="text" name="cpfCliente" id="cCpfCliente" size="11" maxlength="12" placeholder="CPF" onkeypress="return formatarApenasNumero()"
						value="${editaClintePet.cpf}"/>
					</p>
					
					<!-- EMAIL CLIENTE --> 
					<p>
						<label for="cEmail">E-mail:</label>
						<input type="email" name="emailCliente" id="cEmail" size="20" maxlength="40" placeholder="Digite seu E-mail"
						value="${editaClintePet.email}"/>
					</p>
			</fieldset>
	
			<hr class="linhaDivisoria"/>
			
			<h1>CadastroPET</h1>
			<input type="hidden" id="cIdPet" name="idPet" value="${editaClintePet.animal.idPet}">
			<fieldset id="pet">
				<legend>Cadastro do Animal</legend>
					<!-- NOME ANIMAL -->
					<p>
						<label for="cNomeAnimal">Nome Animal:</label>
						<input type="text" name="nomeAnimal" id="cNomeAnimal" size="20" maxlength="30" placeholder="Nome do Animal" onkeypress="return formatarApenasLetras()"
						value="${editaClintePet.animal.nomeAnimal}"/>
					</p>
					
					<!-- IDADE ANIMAL -->
					<p>
						<label for="cIdadeAnimal">Idade do Animal:</label>
						<input type="text" name="idadeAnimal" id="cIdadeAnimal" size="2" maxlength="2" placeholder="Idade" onkeypress="return formatarApenasNumero()"
						value="${editaClintePet.animal.idadeAnimal}"/>
					</p>
                    
                    <!-- ESPECIE/RA�A ANIMAL -->
					<p>
						<label for="cRaca">Ra�a:</label>
						<select name="racaAnimal" id="cRaca">
							<option value="${editaClintePet.animal.raca}" >Selecione...</option>
							<optgroup label="Cachorro">
								<option value="Poodle">Poodle</option>
								<option value="Shih-tzu">Shih tzu</option>
								<option value="Pastor-alemao">Pastor alem�o</option>
								<option value="Pinscher">Pinscher</option>
								<option value="Pit-bull">Pit bull</option>
								<option value="Vira-Lata">Vira-Lata</option>
							</optgroup>
							<optgroup label="Gato">
								<option value="Peterbald">Peterbald</option>
								<option value="angora-turco">angor� turco</option>
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
					
				  	<!-- DESCRI��O -->
                    <p><label for="cDescricao">Descricao:</label>
                    	<br/>
                    	<textarea name="descricao" id="cDescricao" cols="35" rows="5" placeholder="Comente sobre o Animal"
                    	>${editaClintePet.animal.descricao}</textarea>
                    </p>
                    
					<!-- BOT�O ENVIAR FORMULADO --> 
					<input id="editarformuladoClientePet" type="submit">
			</fieldset>
		</form>
			
	</body>
</html>