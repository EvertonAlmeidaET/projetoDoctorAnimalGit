package br.com.doctoranimal.projeto.concretas;

public class CadastroPet {
	
	private String nomeAnimal;
	
	private Integer idadeAnimal;
	
	private Character sexoAnimal;
	
	private String raca;
	
	private String descricao;

	public String getNomeAnimal() {
		return this.nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public Integer getIdadeAnimal() {
		return this.idadeAnimal;
	}

	public void setIdadeAnimal(Integer idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}

	public Character getSexoAnimal() {
		return this.sexoAnimal;
	}

	public void setSexoAnimal(Character sexoAnimal) {
		this.sexoAnimal = sexoAnimal;
	}

	public String getRaca() {
		return this.raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
