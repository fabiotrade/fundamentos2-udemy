package fundamentos.operadores;

public class DesafioAritmetico {
	
	public static void main(String[] args) {
		
		int a = 3 *4 -10;
		int b = (int)Math.pow(a, 3);
		/*quando usamos a função potência através da função Math.pow
		 * sempre nos é devolvido um número do tipo double e como
		 * a variável foi declarada como sendo do tipo inteiro, foi
		 * nececessário fazer o CAST da variável para double*/
		double c = Math.pow(a, 3);
		/*Na linha acima não foi necessário fazer o CAST porque a
		 * variável já havia sido declarada como sendo do tipo
		 * double, dessa forma, o resultado será decimal.*/
		System.out.println(b);
		System.out.println(c);
		
	}

}

