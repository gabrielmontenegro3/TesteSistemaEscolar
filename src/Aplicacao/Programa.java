package Aplicacao;

import java.util.Scanner;


public class Programa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao sistema escolar, selecione uma das opções.");
		System.out.println("1-TURMAS || 2-AVALIAÇÕES || 3-PROFESSORES");
		int e = entrada.nextInt();
	
		
		entrada.close();
	}
}
