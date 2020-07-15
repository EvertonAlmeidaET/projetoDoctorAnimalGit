package br.com.doctoranimal.projeto.concretas;

public class CadastroCliente {
	
	private String nomeCliente;
	private Integer idade;
	private Character sexo;
	private String cpf;
	private CadastroPet animal = new CadastroPet();
	

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
		
	}
	
	public String getNomeCliente() {
		return this.nomeCliente;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public Integer getIdade() {
		return this.idade;
	}
	
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	
	public Character getSexo() {
		return this.sexo;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	@Override
	public String toString() {
		return String.format("[Nome: %s - Sexo: %s - Idade: %d - CPF: %s]", this.nomeCliente, this.sexo, this.idade, this.cpf);
	}

	public CadastroPet getAnimal() {
		return animal;
	}

	public void setAnimal(CadastroPet animal) {
		this.animal = animal;
	}
	
}
