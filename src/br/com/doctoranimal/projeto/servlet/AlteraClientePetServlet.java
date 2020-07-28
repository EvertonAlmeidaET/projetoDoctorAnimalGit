package br.com.doctoranimal.projeto.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.doctoranimal.projeto.concretas.BancoDeDados;
import br.com.doctoranimal.projeto.concretas.DadosCliente;

/**
 * Servlet implementation class AlteraClientePetServlet
 */
//http:/localhost:8080/doctoranimal/alteraClientePet
@WebServlet("/alteraClientePet")
public class AlteraClientePetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Alterando Cliente e Pet......");
		
		String nomeCliente = request.getParameter("nomeCliente");
		String idCliente = request.getParameter("idCliente");
		String idadeCliente = request.getParameter("idadeCliente");
		String cpfCliente = request.getParameter("cpfCliente");
		String email = request.getParameter("emailCliente");
		String idPet = request.getParameter("idPet");
		String nomeAnimal = request.getParameter("nomeAnimal");
		String idadeAnimal = request.getParameter("idadeAnimal");
		String racaAnimal = request.getParameter("racaAnimal");
		String descricao = request.getParameter("descricao");
		
				
//		System.out.printf("ID Cliente %s - ID Pet %s \n\r", idCliente, idPet);
		
		BancoDeDados banco = new BancoDeDados();
		DadosCliente alterarDadosCliente  = banco.buscaClientePetPeloId(Integer.valueOf(idCliente), Integer.valueOf(idPet));
		alterarDadosCliente.setNomeCliente(nomeCliente);
		alterarDadosCliente.setIdade(Integer.valueOf(idadeCliente));
		alterarDadosCliente.setCpf(cpfCliente);
		alterarDadosCliente.setEmail(email);
		alterarDadosCliente.getAnimal().setNomeAnimal(nomeAnimal);
		alterarDadosCliente.getAnimal().setIdadeAnimal(Integer.valueOf(idadeAnimal));
		alterarDadosCliente.getAnimal().setRaca(racaAnimal);
		alterarDadosCliente.getAnimal().setDescricao(descricao);
		
		response.sendRedirect("listaDadosCadastrados");
		
		System.out.println("Cliente Alterado: " + alterarDadosCliente + " - " + alterarDadosCliente.getAnimal());
	}

}
