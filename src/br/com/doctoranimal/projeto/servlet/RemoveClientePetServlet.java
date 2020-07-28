package br.com.doctoranimal.projeto.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.doctoranimal.projeto.concretas.BancoDeDados;

/**
 * Servlet implementation class RemoveClientePetServlet
 */
//http:/localhost:8080/doctoranimal/removeClientePet
@WebServlet("/removeClientePet")
public class RemoveClientePetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Excluindo Cliente e Pet......");
		
		String paramId = request.getParameter("id");
		Integer idCliente =  Integer.valueOf(paramId);
		String paramId2 =request.getParameter("id2");
		Integer idPet =  Integer.valueOf(paramId2);
		
		System.out.println(idCliente + " - " + idPet);
		
		BancoDeDados banco = new BancoDeDados();
		banco.remove(idCliente, idPet);
		
		response.sendRedirect("listaDadosCadastrados");
	}

}
