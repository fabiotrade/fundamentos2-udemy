package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro n�mero");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo n�mero");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("A soma �: " + soma);
		System.out.println("A m�dia �: " + soma / 2);
		/*A maioria das linguagens usa um algoritmo interno
		 * para realizar esses c�lculos e a caracter�stica desse
		 * algoritmo � mais velocidade e menos precis�o nas casas
		 * decimais, uma maneira de obter o m�ximo em termos de 
		 * precis�o � utilizar o tipo BIG DECIMAL no lugar do tipo
		 * DOUBLE. O tipo BIG DECIMAL por padr�o n�o est� em JAVA.LANG
		 * ,mas sim, em JAVA.MATH (import java.math.BigDecimal)*/
		
		
		
	}
	
	

}
