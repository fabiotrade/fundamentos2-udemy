package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		//Trabalho na terça (V ou F)
		//Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		//Operador binário AND
		boolean comprouTv50 = trabalho1 && trabalho2;
		//Operador binário XOR
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		//Operador binário OR
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou a Tv 50\"? " + comprouTv50);
		System.out.println("Comprou a Tv 32\"? " + comprouTv32);
		System.out.println("Comprou a Tv 32\"Sorvete? " + comprouSorvete);
		
		//Operador Unário NOT = !
		System.out.println("Mais saudável " + !comprouSorvete);
		
		
	}
	
}
