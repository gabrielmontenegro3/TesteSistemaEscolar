package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DB.FabricaConexao;

public class AlunosDAO {

	public static void consultarAlunos () throws Exception {
	
	String sql = "SELECT * FROM alunos";
	
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
		System.out.println(p.getId() + " | " + p.getNome() + ", " + p.getTurma());
			
	}
	
	
		}
	public static void main(String[] args) throws Exception {

		consultarAlunos();
		
	}
	}


