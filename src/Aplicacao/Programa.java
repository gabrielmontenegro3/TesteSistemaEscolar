package Aplicacao;

import java.sql.SQLException;
import java.util.Scanner;

import models.AlunoDAO;
import models.NotasDAO;
import models.Aluno;


public class Programa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao sistema escolar, selecione uma das opções.");
		System.out.println("1-TURMAS || 2-AVALIAÇÕES || 3-PROFESSORES");
		int e = entrada.nextInt();
	
		switch (e) {
		case 1:
			System.out.println("Selecione a turma: 6a | 6b | 7a | 7b | 8a | 8b | 9a | 9b");
			int soupp = entrada.nextInt();
			
			AlunoDAO a = new AlunoDAO();
			
			a.consultarAluno();
			
			
		case 2:
			System.out.println("2");
			soupp = entrada.nextInt();
		
		
		case 3:
			System.out.println("3");
			soupp = entrada.nextInt();

		
		
			
		}
		
		entrada.close();
	}

}
