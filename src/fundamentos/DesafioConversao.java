package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Informe o primeiro salário: ");
		String valor1 = scan.next().replace(",",".");
		

		/*caso o usuário entre com um valor equivocadamente separado
		 * por vírgula(já que o JAVA segue o padrão americano
		 * e usa ponto para separar casas decimais) essa linha
		 * de código usa a notação ponto para chamar o método
		 * replace que corrigirá o problema.
		 */
		
		System.out.println("Informe o segundo salário: ");
		String valor2 = scan.next().replace(",",".");
		
		System.out.println("Informe o terceiro salário: ");
		String valor3 = scan.next().replace(",",".");
		
		double salario1 = Double.parseDouble(valor1);
		/*Na linha acima estamos declarando uma variável do tipo
		 * double, estamos inicializando-a através da atribuição
		 * do valor1, e ao mesmo tempo que a inicializamos
		 * estamos usando a notação ponto(.) para invocar o
		 * método parseDouble que substituirá o que for
		 * digitado pelo usuário por um valor do tipo double*/
		double salario2 = Double.parseDouble(valor2);
		
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3)/3;
		System.out.println("A média dos salários é " + media);
		
		scan.close();
	}

}
