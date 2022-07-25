package models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import DB.FabricaConexao;

public class NotasDAO {

	public static void buscarNotaTurma() {
	
		String sql = "SELECT * FROM notas";
	
	
	
	
	}
	
	public static void buscarNotaAlunoUnica() throws SQLException {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno");
		int id = entrada.nextInt();
		
		System.out.println("Digite o ID do aluno");
		String nome = entrada.nextLine();
		
		
		String sql = "SELECT from notas where nome_aluno = " + nome + " || id_aluno = " + id + " ";

		Connection conexao = FabricaConexao.getConexao();
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		
		
	}
	
}
