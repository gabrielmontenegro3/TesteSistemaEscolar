package models;

public class Alunos extends Pessoa {

	int id;
	String nome;
	int turma;
	
	public Alunos() {
		
	}

	public Alunos(int id, String nome, int turma) {
		this.id = id;
		this.nome = nome;
		this.turma = turma;
	}

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

	public int getTurma() {
		return turma;
	}

	public void setTurma(int turma) {
		this.turma = turma;
	}
	
	
	
	
}
