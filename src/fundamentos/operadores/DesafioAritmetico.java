package fundamentos.operadores;

public class DesafioAritmetico {
	
	public static void main(String[] args) {
		
		int a = 3 *4 -10;
		int b = (int)Math.pow(a, 3);
		/*quando usamos a fun��o pot�ncia atrav�s da fun��o Math.pow
		 * sempre nos � devolvido um n�mero do tipo double e como
		 * a vari�vel foi declarada como sendo do tipo inteiro, foi
		 * nececess�rio fazer o CAST da vari�vel para double*/
		double c = Math.pow(a, 3);
		/*Na linha acima n�o foi necess�rio fazer o CAST porque a
		 * vari�vel j� havia sido declarada como sendo do tipo
		 * double, dessa forma, o resultado ser� decimal.*/
		System.out.println(b);
		System.out.println(c);
		
	}

}

