package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DB.FabricaConexao;

public class professorDAO extends Pessoa {
		
	public static void consultarProfessor() throws SQLException{
			
		
		String sql = "SELECT * FROM professor";
		
		Connection conexao = FabricaConexao.getConexao();
	
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		ResultSet resultado = stmt.executeQuery(sql);
		List<Professor> professores = new ArrayList<>();
		
		while(resultado.next()) {
			int id = resultado.getInt("id_professor");
			String nome = resultado.getString("nome_professor");
			String materia = resultado.getString("materia_professor");
			
			professores.add(new Professor(id, nome, materia));			

		}
		
		for(Professor p: professores) {
			System.out.println(p.getId() + " | " + p.getNome() + ", " + p.getMateria());
				
			}	

	}
	

	private void add(Professor professor) {}

	public static void adicionarProfessor() throws SQLException {
		
		try {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira seu nome");
		String nome = entrada.next();
		
		System.out.println("Insira a materia");
		String materia = entrada.next();
		
		String sql = "INSERT INTO professor (nome_professor, materia_professor) values ('" + nome + "', '" + materia + "');";
		
		Connection conexao = FabricaConexao.getConexao();
		
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		ResultSet resultado = stmt.executeQuery(sql);
		List<Pessoa> pessoas = new ArrayList<>();
		
		entrada.close();
		
	} catch (Exception e) {
		e.getMessage();
	}
}

	public static void removerProfessor() throws SQLException{
		
		Scanner entrada = new Scanner(System.in);

		
		
		System.out.println("Remover professor, digite o ID");
		int id = entrada.nextInt();
		
		String sql = "DELETE FROM professor where id_professor = " + id + "";
	//	String sql = "DELETE FROM pessoa where codigo_pessoa = " + id_usuario + "";
				
		Connection conexao = FabricaConexao.getConexao();
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		System.out.println("Professor deletado!");
		entrada.close();
	}
	
	public static void alterarAluno() throws SQLException {
		
		//CRIAÇÃO DE UPDATE
						
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Digite o ID do aluno");
		int id = entrada.nextInt();
		
		
		String sql = "UPDATE from aluno where id_aluno = " + id + "";
		
		Connection conexao = FabricaConexao.getConexao();
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
				
		
		entrada.close();
	}
	
	public static void main(String[] args) throws SQLException {
	
	
		consultarProfessor();
		removerProfessor();
		consultarProfessor();
	}
	
	
}

