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
		
		BancoDeDados banco = new BancoDeDados();
		List<DadosCliente> cadastro = banco.getClienteCadastrado();
		
		request.setAttribute("dadosCadastrados", cadastro);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listarCadastrosSalvos.jsp");
		rd.forward(request, response);
	}


}
