package fundamentos.operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		/*As duas condições abaixo deveriam ser verdadeiras
		para que o resultado fosse verdadeiro.*/
		System.out.println(condicao1 && condicao2);
		/*Se apenas uma das condições for verdadeira, o resultado
		 * já será true.*/
		System.out.println(condicao1 || condicao2);
		/**/
		System.out.println(condicao1 ^ condicao2);
		/*O ponto de exclamação é uma negação da condição, portanto
		 * se ela for verdadeira e for negada, o resultado será falso.*/
		System.out.println(!condicao1);
		/*O ponto de exclamação é uma negação da condição, portanto
		 * se ela for falsa e for negada o resultado será verdadeiro.*/
		System.out.println(!condicao2);
		System.out.println("\nTabela Verdade com conectivo lógico E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("\nTabela Verdade com conectivo lógico OU (OR)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
	
		System.out.println("\nTabela Verdade com conectivo lógico OU EXCLUSIVO (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela Verdade de NEGAÇÃO com operador lógico NOT ( ! )");
		System.out.println(!true);
		System.out.println(!false);
		
	
	}

}
