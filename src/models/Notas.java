package models;

public class Notas {

	int id;
	int ano;
	String nome;
	int nota_geografia;
	int nota_matematica;
	int nota_portugues;
	int nota_historia;
	int nota_ciencia;
	int nota_edfisica;
	
	public Notas() {
		
	}
	
	public Notas(int id, int ano, String nome, int nota_geografia, int nota_matematica, int nota_portugues,
			int nota_historia, int nota_ciencia, int nota_edfisica) {
		super();
		this.id = id;
		this.ano = ano;
		this.nome = nome;
		this.nota_geografia = nota_geografia;
		this.nota_matematica = nota_matematica;
		this.nota_portugues = nota_portugues;
		this.nota_historia = nota_historia;
		this.nota_ciencia = nota_ciencia;
		this.nota_edfisica = nota_edfisica;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNota_geografia() {
		return nota_geografia;
	}
	public void setNota_geografia(int nota_geografia) {
		this.nota_geografia = nota_geografia;
	}
	public int getNota_matematica() {
		return nota_matematica;
	}
	public void setNota_matematica(int nota_matematica) {
		this.nota_matematica = nota_matematica;
	}
	public int getNota_portugues() {
		return nota_portugues;
	}
	public void setNota_portugues(int nota_portugues) {
		this.nota_portugues = nota_portugues;
	}
	public int getNota_historia() {
		return nota_historia;
	}
	public void setNota_historia(int nota_historia) {
		this.nota_historia = nota_historia;
	}
	public int getNota_ciencia() {
		return nota_ciencia;
	}
	public void setNota_ciencia(int nota_ciencia) {
		this.nota_ciencia = nota_ciencia;
	}
	public int getNota_edfisica() {
		return nota_edfisica;
	}
	public void setNota_edfisica(int nota_edfisica) {
		this.nota_edfisica = nota_edfisica;
	}
	
	
	
}
