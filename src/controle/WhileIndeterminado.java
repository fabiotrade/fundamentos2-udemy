package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String  valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			
			System.out.println("Digite qualquer palavra ou sair para encerrar o programa:");
			valor = entrada.nextLine();
			
		}
		
		
		
		entrada.close();
		
		
	}
	

}
