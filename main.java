package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String nome = sc.nextLine();
		System.out.println("Inofrme a idade do aluno: ");
		int idade = sc.nextInt();
		sc.close();
		
		System.out.println("Aluno "+nome+ ", sua idade é "+idade+ " anos.");
	}

}
