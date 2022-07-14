package models;

public class Professor extends Pessoa {
	
	private int id;
	private String nome;
	private String materia;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public Professor(int id, String nome, String materia) {
		super();
		this.id = id;
		this.nome = nome;
		this.materia = materia;
	}
	
public Professor() {
	
}

}
