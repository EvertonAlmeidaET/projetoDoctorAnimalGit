package br.com.doctoranimal.projeto.concretas;

public class DadosCliente {
	
	private static final long serialVersionUID = 1;
	
	private Integer idCliente = Integer.valueOf(0);
	private String nomeCliente;
	private Integer idade;
	private Character sexo;
	private String cpf;
	private String email;
	private CadastroPet animal = new CadastroPet();

	public DadosCliente() {
//		DadosCliente.idCliente++;
	}
	
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	
	public Integer getIdCliente() {
		return this.idCliente;
	}
	
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
	
	public CadastroPet getAnimal() {
		return animal;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	@Override
	public String toString() {
		return String.format("[Nome: %s - Sexo: %s - Idade: %d - CPF: %s - Email: %s]", this.nomeCliente, this.sexo, this.idade, 
				this.cpf, this.email);
	}
	
}
