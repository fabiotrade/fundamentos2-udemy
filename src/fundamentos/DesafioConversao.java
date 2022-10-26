package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Informe o primeiro sal�rio: ");
		String valor1 = scan.next().replace(",",".");
		

		/*caso o usu�rio entre com um valor equivocadamente separado
		 * por v�rgula(j� que o JAVA segue o padr�o americano
		 * e usa ponto para separar casas decimais) essa linha
		 * de c�digo usa a nota��o ponto para chamar o m�todo
		 * replace que corrigir� o problema.
		 */
		
		System.out.println("Informe o segundo sal�rio: ");
		String valor2 = scan.next().replace(",",".");
		
		System.out.println("Informe o terceiro sal�rio: ");
		String valor3 = scan.next().replace(",",".");
		
		double salario1 = Double.parseDouble(valor1);
		/*Na linha acima estamos declarando uma vari�vel do tipo
		 * double, estamos inicializando-a atrav�s da atribui��o
		 * do valor1, e ao mesmo tempo que a inicializamos
		 * estamos usando a nota��o ponto(.) para invocar o
		 * m�todo parseDouble que substituir� o que for
		 * digitado pelo usu�rio por um valor do tipo double*/
		double salario2 = Double.parseDouble(valor2);
		
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3)/3;
		System.out.println("A m�dia dos sal�rios � " + media);
		
		scan.close();
	}

}
