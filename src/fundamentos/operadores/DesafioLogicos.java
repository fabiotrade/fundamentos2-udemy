package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		//Trabalho na ter�a (V ou F)
		//Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		//Operador bin�rio AND
		boolean comprouTv50 = trabalho1 && trabalho2;
		//Operador bin�rio XOR
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		//Operador bin�rio OR
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou a Tv 50\"? " + comprouTv50);
		System.out.println("Comprou a Tv 32\"? " + comprouTv32);
		System.out.println("Comprou a Tv 32\"Sorvete? " + comprouSorvete);
		
		//Operador Un�rio NOT = !
		System.out.println("Mais saud�vel " + !comprouSorvete);
		
		
	}
	
}
