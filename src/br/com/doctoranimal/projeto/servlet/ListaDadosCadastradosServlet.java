package br.com.doctoranimal.projeto.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.doctoranimal.projeto.concretas.BancoDeDados;
import br.com.doctoranimal.projeto.concretas.DadosCliente;

/**
 * Servlet implementation class ListaDadosCadastradosServlet
 */
@WebServlet("/listaDadosCadastrados")
public class ListaDadosCadastradosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Listando Cliente e Pet......");
		
		BancoDeDados banco = new BancoDeDados();
		List<DadosCliente> cadastro = banco.getClienteCadastrado();
		
		
		for (DadosCliente clienteLista : cadastro) {
			System.out.printf("[ID: %d - Cliente Nome: %s - CPF: %s] [IDPet: %d - NomePet: %s - Raça: %s - Descrição: %s] \n\r"
					,clienteLista.getIdCliente(), clienteLista.getNomeCliente(), clienteLista.getCpf(), 
					clienteLista.getAnimal().getIdPet(), clienteLista.getAnimal().getNomeAnimal(), 
					clienteLista.getAnimal().getRaca(), clienteLista.getAnimal().getDescricao());
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/listarCadastrosSalvos.jsp");
		request.setAttribute("dadosCadastrados", cadastro);
		rd.forward(request, response);
	}


}
