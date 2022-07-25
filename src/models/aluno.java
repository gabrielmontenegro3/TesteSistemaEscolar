package models;

public class Aluno extends Pessoa{
	
	int id;
	String nome;
	int turma;
	
	public Aluno() {}
	
	public Aluno(int id, String nome, int turma) {		
	}
	
	public Aluno(String nome, int turma) {
		super();
		this.id = id;
		this.nome = nome;
		this.turma = turma;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}