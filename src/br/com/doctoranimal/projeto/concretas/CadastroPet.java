package br.com.doctoranimal.projeto.concretas;

public class CadastroPet {
	
	private static final long serialVersionUID = 1;
	
	private static Integer idPet = Integer.valueOf(1);
	private String nomeAnimal;
	private Integer idadeAnimal;
	private Character sexoAnimal;
	private String especie;
	private String descricao;
	
	
	public CadastroPet() {
		CadastroPet.idPet++;
	}
	
	public static Integer getIdPet() {
		return CadastroPet.idPet;
	}

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

	public String getEspecie() {
		return this.especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return String.format("[Nome: %s, Idade: %d, Sexo: %s, Tipo: %s, Descrição: %s]", this.nomeAnimal, this.idadeAnimal, 
				this.sexoAnimal, this.especie, this.descricao);
	}

}
