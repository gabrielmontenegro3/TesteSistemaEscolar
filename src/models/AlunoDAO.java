package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DB.FabricaConexao;

public class AlunoDAO extends Pessoa {
	public static void consultarAluno() throws SQLException{
			
		
		String sql = "SELECT * FROM alunos";		// VERIFICAR
		
		Connection conexao = FabricaConexao.getConexao();
	
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		ResultSet resultado = stmt.executeQuery(sql);
		List<Aluno> alunos = new ArrayList<>();
		
		while(resultado.next()) {
			int id = resultado.getInt("id_alunos");
			String nome = resultado.getString("nome_aluno");
			int turma = resultado.getInt("turma_aluno");
			
			alunos.add(new Aluno(id, nome, turma));			

		}
		
		for(Aluno p: alunos) {
			System.out.println(p.getId() /* + " | " + p.getNome() + ", " + p.getTurma() */);
				
			}	

	}
	

	private void add(Aluno aluno) {}

	public static void adicionarAluno() throws SQLException {
		
		try {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o nome do Aluno");
		String nome = entrada.next();
		
		System.out.println("Insira o ano do aluno");
		int ano = entrada.nextInt();
		
		String sql = "INSERT INTO alunos (nome_aluno, turma_aluno) values ('" + nome + "', '" + ano + "');";
		
		Connection conexao = FabricaConexao.getConexao();
		
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		ResultSet resultado = stmt.executeQuery(sql);
		List<Aluno> alunos = new ArrayList<>();
		
		entrada.close();
		
	} catch (Exception e) {
		e.getMessage();
	}
}

	public static void removerAluno() throws SQLException{
		
		Scanner entrada = new Scanner(System.in);

		
		
		System.out.println("Remover aluno, digite o ID");
		int id = entrada.nextInt();
		
		String sql = "DELETE FROM professor where id_aluno = " + id + "";
	//	String sql = "DELETE FROM pessoa where codigo_pessoa = " + id_usuario + "";
				
		Connection conexao = FabricaConexao.getConexao();
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		System.out.println("Aluno removido!");
		entrada.close();
	}
	public static void main(String[] args) throws SQLException {
	
		consultarAluno();
	
	}
}
