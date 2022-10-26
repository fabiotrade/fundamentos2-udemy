package controle;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o número: ");
			/*JOptionPane é uma forma de criar uma caixa (box) de diálogo
			 * ao usar a notação ponto "." após essa instrução invocamos
			 * o método showInputDialog que ordena que o parâmetro seja
			 * digitado e retornado no diplay (box).
			 */
			
			int numero = Integer.parseInt(valor);
			/*Uma variável chamada número, do tipo inteiro recebe(=)o valor do
			 * WRAPPER (envelope) Integer, ou seja, deixa de ser apenas uma variável
			 * e passa a PODER invocar métodos a partir do uso da 
			 * notação ".", após o Integer temos o método parseint(valor)
			 * que verifica se o parâmetro passado pelo usuário é um valor
			 * inteiro decimal ou não. O parâmetro passado pelo usuário 
			 * é inicialmente uma String que após ser transformada para um valor
			 * do tipo inteiro recebe o valor de Wrapper e retorna um Integer
			 * na forma de um inteiro decimal. Caso o método parseint(valor)
			 * detecte um parâmetro passado pelo usuário diferente de um inteiro
			 * o método lança uma Exception NumberFormatException.
			 * */
			
			if(numero % 2 ==0) {
				System.out.println("Número par!");
			}
			else {
				System.out.println("Número ímpar!");
			}
				
		
	}

}
