package Aplicacao;

import java.util.Scanner;


public class Programa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao sistema escolar, selecione uma das op��es.");
		System.out.println("1-TURMAS || 2-AVALIA��ES || 3-PROFESSORES");
		int e = entrada.nextInt();
	
		
		entrada.close();
	}
}
