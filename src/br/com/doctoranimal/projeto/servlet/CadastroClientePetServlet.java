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
 * Servlet implementation class IniProjeto
 */
//http:/localhost:8080/doctoranimal/cadastroClientePet
@WebServlet("/cadastroClientePet")
public class CadastroClientePetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando Cliente");
		
		String nomeCliente = request.getParameter("nomeCliente");
		String idadeCliente = request.getParameter("idadeCliente");
		String sexoCliente = request.getParameter("sexoCliente");
		String cpfCliente = request.getParameter("cpfCliente");
		String email = request.getParameter("emailCliente");
		String nomeAnimal = request.getParameter("nomeAnimal");
		String idadeAnimal = request.getParameter("idadeAnimal");
		String sexoAnimal = request.getParameter("sexoAnimal");
		String racaAnimal = request.getParameter("racaAnimal");
		String descricao = request.getParameter("descricao");
		
		DadosCliente cliente = new DadosCliente();
		cliente.setNomeCliente(nomeCliente);
		cliente.setIdade(Integer.valueOf(idadeCliente));
		cliente.setSexo(sexoCliente.toUpperCase().charAt(0));
		cliente.setCpf(cpfCliente);
		cliente.setEmail(email);
		cliente.getAnimal().setNomeAnimal(nomeAnimal);
		cliente.getAnimal().setIdadeAnimal(Integer.valueOf(idadeAnimal));
		cliente.getAnimal().setSexoAnimal(sexoAnimal.toUpperCase().charAt(0));
		cliente.getAnimal().setRaca(racaAnimal);
		cliente.getAnimal().setDescricao(descricao);
		
		BancoDeDados cadastroBanco = new BancoDeDados();
		cadastroBanco.adiciona(cliente);
			
		request.setAttribute("cadastroCliente", cliente);
		
		response.sendRedirect("listaDadosCadastrados");
		
		for (DadosCliente clienteLista : cadastroBanco.getClienteCadastrado()) {
			System.out.printf("[ID: %d - Cliente Nome: %s - CPF: %s] [IDPet: %d - NomePet: %s - Raça: %s - Descrição: %s] \n\r"
					,clienteLista.getIdCliente(), clienteLista.getNomeCliente(), clienteLista.getCpf(), 
					clienteLista.getAnimal().getIdPet(), clienteLista.getAnimal().getNomeAnimal(), 
					clienteLista.getAnimal().getRaca(), clienteLista.getAnimal().getDescricao());
		}
		
//		RequestDispatcher rd = request.getRequestDispatcher("/sucessoCadastroCliente.jsp");
//		request.setAttribute("cadastroCliente", cliente);
//		rd.forward(request, response);
		
	}

}

