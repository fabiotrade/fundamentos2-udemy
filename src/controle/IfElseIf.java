package controle;

import java.util.Scanner;

public class IfElseIf {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		
		double nota = entrada.nextDouble();
		/*o método nextDouble invocado pela notação ponto analisa o parâmetro
		 * digitado pelo usuário e recebido pelo método Scanner da classe Scanner
		 * que se encarrega de separar os blocos de input e tranformá-los
		 * em tokens. Se o valor digitado corresponder a um token válido (double)
		 * o programa segue, se for um valor float, será transformado em double
		 * com a retirada do separador (.) e do número após os mesmo, caso seja 
		 * outro tipo de parâmetro é lançada uma Exception.
		 * */
		if(nota > 10 || nota <0) {
			
			System.out.println("Nota inválida.");
		}else if(nota >= 8.1) {
			System.out.println("Conceito A.");
		}else if(nota >= 6.1) {
			System.out.println("Conceito B.");
		}else if(nota >= 4.1) {
			System.out.println("Conceito C.");
		}else if(nota >= 2.1) {
			System.out.println("Conceito D.");			
		}else {
			System.out.println("Conceito E.");
		}
		System.out.println("FIM.");
		
		
		entrada.close();
		
		
	}
	

}
