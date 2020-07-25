package br.com.doctoranimal.projeto.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.doctoranimal.projeto.concretas.BancoDeDados;
import br.com.doctoranimal.projeto.concretas.DadosCliente;

/**
 * Servlet implementation class EditarClientePetServlet
 */
@WebServlet("/editarClientePet")
public class EditarClientePetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramId = request.getParameter("id");
		Integer idCliente =  Integer.valueOf(paramId);
		String paramId2 =request.getParameter("id2");
		Integer idPet =  Integer.valueOf(paramId2);
		
		BancoDeDados banco = new BancoDeDados();
		DadosCliente cliente =  banco.buscaClientePetPeloId(idCliente, idPet);
		
		System.out.println(cliente.getNomeCliente() + " - " + cliente.getAnimal().getNomeAnimal());
		
		RequestDispatcher rd = request.getRequestDispatcher("/formEditarCadastroClientePet.jsp");
		request.setAttribute("editaClintePet", cliente);
		rd.forward(request, response);
	}

}
