package br.com.doctoranimal.projeto.concretas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BancoDeDados {
	
	private static List<DadosCliente> listaCadastroCliente = new ArrayList<>();
	private static Integer chaveSequencial = Integer.valueOf(1);
	
	static {
		DadosCliente cliente1 = new DadosCliente();
		cliente1.setIdCliente(BancoDeDados.chaveSequencial);
		cliente1.setNomeCliente("Caroline");
		cliente1.setIdade(32);
		cliente1.setCpf("555.000.222-10");
		cliente1.setSexo('F');
		cliente1.setEmail("caroline32@teste.com.br");
		cliente1.getAnimal().setNomeAnimal("Charlies");
		cliente1.getAnimal().setIdPet(BancoDeDados.chaveSequencial++);
		cliente1.getAnimal().setIdadeAnimal(8);
		cliente1.getAnimal().setRaca("Poodle");
		cliente1.getAnimal().setSexoAnimal('M');
		cliente1.getAnimal().setDescricao("Charlies � um cachorro muito feliz");
		
		DadosCliente cliente2 = new DadosCliente();
		cliente2.setIdCliente(BancoDeDados.chaveSequencial);
		cliente2.setNomeCliente("Everton");
		cliente2.setIdade(24);
		cliente2.setCpf("535.666.302-10");
		cliente2.setSexo('M');
		cliente2.setEmail("everton25@teste.com.br");
		cliente2.getAnimal().setNomeAnimal("Billy");
		cliente2.getAnimal().setIdPet(BancoDeDados.chaveSequencial++);
		cliente2.getAnimal().setIdadeAnimal(8);
		cliente2.getAnimal().setRaca("Shih tzu");
		cliente2.getAnimal().setSexoAnimal('M');
		cliente2.getAnimal().setDescricao("Billy � um cachorro muito feliz");
		
		listaCadastroCliente.add(cliente1);
		listaCadastroCliente.add(cliente2);
		
	}
	
	public void adiciona(DadosCliente cliente) {
		cliente.setIdCliente(BancoDeDados.chaveSequencial);
		cliente.getAnimal().setIdPet(BancoDeDados.chaveSequencial++);
		BancoDeDados.listaCadastroCliente.add(cliente);
	}
	
	public List<DadosCliente> getClienteCadastrado() {
		return BancoDeDados.listaCadastroCliente;
	}

	
	public void remove(Integer idCliente, Integer idPet) {
		Iterator<DadosCliente> it = listaCadastroCliente.iterator();
		while(it.hasNext()) {
			DadosCliente cliente = it.next();
			if((cliente.getIdCliente() == idCliente) 
					& (cliente.getAnimal().getIdPet() == idPet)){
					it.remove();
				}
		}
		
//		for(DadosCliente clinte : listaCadastroCliente) {
//			if((clinte.getIdCliente() == idCliente) 
//				& (clinte.getAnimal().getIdPet() == idPet)){
//				listaCadastroCliente.remove(clinte);
//			}
//		}
//		
	}

	public DadosCliente buscaClientePetPeloId(Integer idCliente, Integer idPet) {
		
		for (DadosCliente cliente : listaCadastroCliente) {
			if((cliente.getIdCliente() == idCliente) 
					& (cliente.getAnimal().getIdPet() == idPet)){
					return cliente;
			}
		}
		
		return null;
		
	}
	
}
