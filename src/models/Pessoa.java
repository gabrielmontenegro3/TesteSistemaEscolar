package models;

public class Pessoa {

		int id;
		String tipo;
		String nome;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public Pessoa() {}
		
		public Pessoa(int id, String tipo, String nome) {
			super();
			this.id = id;
			this.tipo = tipo;
			this.nome = nome;
		}
						
}
