package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom ");
		System.out.print("dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6 );
		
		System.out.printf("Sal�rio: %.1f%n", 1234.5678);
			
		System.out.printf("Nome: %s%n", "Jo�o");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		
		String nome = scan.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		
		String sobrenome = scan.nextLine();
		
		System.out.println("Digite sua idade: ");
		
		int idade = scan.nextInt();
		
		System.out.printf("%s %s tem %d anos." , nome, sobrenome, idade);
				
		scan.close();
	}

}
