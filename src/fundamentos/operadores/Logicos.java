package fundamentos.operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		/*As duas condi��es abaixo deveriam ser verdadeiras
		para que o resultado fosse verdadeiro.*/
		System.out.println(condicao1 && condicao2);
		/*Se apenas uma das condi��es for verdadeira, o resultado
		 * j� ser� true.*/
		System.out.println(condicao1 || condicao2);
		/**/
		System.out.println(condicao1 ^ condicao2);
		/*O ponto de exclama��o � uma nega��o da condi��o, portanto
		 * se ela for verdadeira e for negada, o resultado ser� falso.*/
		System.out.println(!condicao1);
		/*O ponto de exclama��o � uma nega��o da condi��o, portanto
		 * se ela for falsa e for negada o resultado ser� verdadeiro.*/
		System.out.println(!condicao2);
		System.out.println("\nTabela Verdade com conectivo l�gico E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("\nTabela Verdade com conectivo l�gico OU (OR)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
	
		System.out.println("\nTabela Verdade com conectivo l�gico OU EXCLUSIVO (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela Verdade de NEGA��O com operador l�gico NOT ( ! )");
		System.out.println(!true);
		System.out.println(!false);
		
	
	}

}
