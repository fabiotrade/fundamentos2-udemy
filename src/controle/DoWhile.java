package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Diga a senha correta: ");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
			
		} while(!texto.equalsIgnoreCase("por favor"));
		System.out.println("Ok, at� logo.");
		System.out.println("FIM.");

		entrada.close();		
		

		
	}
	

}
