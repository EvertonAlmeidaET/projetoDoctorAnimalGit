package br.com.doctoranimal.projeto.servlet;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.doctoranimal.projeto.concretas.BancoDeDados;
import br.com.doctoranimal.projeto.concretas.DadosCliente;


@WebServlet("/cadastroPet")
public class CadastroPetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando Pet");
		
		String nomeAnimal = request.getParameter("nomeAnimal");
		String idadeAnimal = request.getParameter("idadeAnimal");
		String sexoAnimal = request.getParameter("sexoAnimal");
		String especie = request.getParameter("especie");
		String descricao = request.getParameter("descricao");
//		byte[] descricao2 = descricao.getBytes("UTF-8");
//		descricao = new String(descricao2, "UTF-8");
		
		DadosCliente cliente = new DadosCliente();
		cliente.getAnimal().setNomeAnimal(nomeAnimal);
		cliente.getAnimal().setIdadeAnimal(Integer.valueOf(idadeAnimal));
		cliente.getAnimal().setSexoAnimal(sexoAnimal.toUpperCase().charAt(0));
		cliente.getAnimal().setEspecie(especie);
		cliente.getAnimal().setDescricao(descricao);
		
		BancoDeDados cadastroBanco = new BancoDeDados();
		cadastroBanco.adiciona(cliente);
		
		for (DadosCliente clienteLista : cadastroBanco.getClienteCadastrado()) {
			System.out.println(clienteLista.getAnimal());
		}
	}

}
