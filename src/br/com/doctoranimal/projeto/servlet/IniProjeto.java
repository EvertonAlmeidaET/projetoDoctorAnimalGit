package br.com.doctoranimal.projeto.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.doctoranimal.projeto.concretas.BancoDeDados;
import br.com.doctoranimal.projeto.concretas.CadastroCliente;

/**
 * Servlet implementation class IniProjeto
 */
//http:/localhost:8080/doctoranimal/iniProjeto
@WebServlet("/iniProjeto")
public class IniProjeto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando Cliente");
		
		String nomeCliente = request.getParameter("nomeCliente");
		String idadeCliente = request.getParameter("idadeCliente");
		String sexoCliente = request.getParameter("sexoCliente");
		String cpfCliente = request.getParameter("cpfCliente");
		
		CadastroCliente cliente = new CadastroCliente();
		cliente.setNome(nomeCliente);
		cliente.setIdade(Integer.valueOf(idadeCliente));
		cliente.setSexo(sexoCliente.toUpperCase().charAt(0));
		cliente.setCpf(cpfCliente);
		
		BancoDeDados cadastroBanco = new BancoDeDados();
		cadastroBanco.adiciona(cliente);
		
	
		RequestDispatcher rd = request.getRequestDispatcher("/sucessoCadastroCliente.jsp");
		request.setAttribute("cadastroCliente", cliente);
		rd.forward(request, response);
		
		for (CadastroCliente clienteLista : cadastroBanco.getClienteCadastrado()) {
			System.out.println(clienteLista);
		}
		
	}

}
