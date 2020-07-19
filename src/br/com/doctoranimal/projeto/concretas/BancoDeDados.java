package br.com.doctoranimal.projeto.concretas;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
	
	private static List<DadosCliente> listaCadastroCliente = new ArrayList<>();
	
	public void adiciona(DadosCliente cliente) {
		BancoDeDados.listaCadastroCliente.add(cliente);
	}
	
	public List<DadosCliente> getClienteCadastrado() {
		return BancoDeDados.listaCadastroCliente;
	}
	
}
