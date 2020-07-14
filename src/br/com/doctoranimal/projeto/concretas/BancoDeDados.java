package br.com.doctoranimal.projeto.concretas;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
	
	private static List<CadastroCliente> listaCadastroCliente = new ArrayList<>();
	
	public void adiciona(CadastroCliente cliente) {
		BancoDeDados.listaCadastroCliente.add(cliente);
	}
	
	public List<CadastroCliente> getClienteCadastrado() {
		return BancoDeDados.listaCadastroCliente;
	}
	
}
