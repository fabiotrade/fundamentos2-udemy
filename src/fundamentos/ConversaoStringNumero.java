package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + soma / 2);
		/*A maioria das linguagens usa um algoritmo interno
		 * para realizar esses cálculos e a característica desse
		 * algoritmo é mais velocidade e menos precisão nas casas
		 * decimais, uma maneira de obter o máximo em termos de 
		 * precisão é utilizar o tipo BIG DECIMAL no lugar do tipo
		 * DOUBLE. O tipo BIG DECIMAL por padrão não está em JAVA.LANG
		 * ,mas sim, em JAVA.MATH (import java.math.BigDecimal)*/
		
		
		
	}
	
	

}
