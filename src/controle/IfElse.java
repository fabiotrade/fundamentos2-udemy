package controle;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o n�mero: ");
			/*JOptionPane � uma forma de criar uma caixa (box) de di�logo
			 * ao usar a nota��o ponto "." ap�s essa instru��o invocamos
			 * o m�todo showInputDialog que ordena que o par�metro seja
			 * digitado e retornado no diplay (box).
			 */
			
			int numero = Integer.parseInt(valor);
			/*Uma vari�vel chamada n�mero, do tipo inteiro recebe(=)o valor do
			 * WRAPPER (envelope) Integer, ou seja, deixa de ser apenas uma vari�vel
			 * e passa a PODER invocar m�todos a partir do uso da 
			 * nota��o ".", ap�s o Integer temos o m�todo parseint(valor)
			 * que verifica se o par�metro passado pelo usu�rio � um valor
			 * inteiro decimal ou n�o. O par�metro passado pelo usu�rio 
			 * � inicialmente uma String que ap�s ser transformada para um valor
			 * do tipo inteiro recebe o valor de Wrapper e retorna um Integer
			 * na forma de um inteiro decimal. Caso o m�todo parseint(valor)
			 * detecte um par�metro passado pelo usu�rio diferente de um inteiro
			 * o m�todo lan�a uma Exception NumberFormatException.
			 * */
			
			if(numero % 2 ==0) {
				System.out.println("N�mero par!");
			}
			else {
				System.out.println("N�mero �mpar!");
			}
				
		
	}

}
