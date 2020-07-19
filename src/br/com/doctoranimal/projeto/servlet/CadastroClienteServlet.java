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
 * Servlet implementation class IniProjeto
 */
//http:/localhost:8080/doctoranimal/iniProjeto
@WebServlet("/cadastroCliente")
public class CadastroClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando Cliente");
		
		String nomeCliente = request.getParameter("nomeCliente");
		String idadeCliente = request.getParameter("idadeCliente");
		String sexoCliente = request.getParameter("sexoCliente");
		String cpfCliente = request.getParameter("cpfCliente");
		
		DadosCliente cliente = new DadosCliente();
		cliente.setNomeCliente(nomeCliente);
		cliente.setIdade(Integer.valueOf(idadeCliente));
		cliente.setSexo(sexoCliente.toUpperCase().charAt(0));
		cliente.setCpf(cpfCliente);
		
		BancoDeDados cadastroBanco = new BancoDeDados();
		cadastroBanco.adiciona(cliente);
		
		request.setAttribute("cadastroCliente", cliente);
		
		response.sendRedirect("formPet.jsp");
		
//		RequestDispatcher rd = request.getRequestDispatcher("/sucessoCadastroCliente.jsp");
//		request.setAttribute("cadastroCliente", cliente);
//		rd.forward(request, response);
		
		for (DadosCliente clienteLista : cadastroBanco.getClienteCadastrado()) {
			System.out.println(clienteLista);
		}
		
	}

}
