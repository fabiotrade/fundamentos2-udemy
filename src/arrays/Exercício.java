package arrays;

import java.util.Arrays;

public class Exerc�cio {
	
	public static void main(String[] args) {
		
		double [] notasAlunoA = new double [3];
		/*Cria��o do objeto array unidimensional (possui
		 * apenas um par de colchetes) de nome notasAlunoaA
		 * contendo elementos do tipo double e declara��o
		 * do n�mero de posi��es entre colchetes.*/
		notasAlunoA [0] = 7.9;
		notasAlunoA [1] = 8;
		notasAlunoA [2] = 6.7;	
		
		System.out.println(Arrays.toString(notasAlunoA));
		/*Para imprimir as notas do aluno de uma forma mais
		 *interessante chamamos a Classe "Arrays" e atrav�s dela, 
		 *usando a nota��o"." invocamos o m�todo "toString" que 
		 *transforma o conte�do do array em string no momento e 
		 *nos permite imprimir o conte�do entre colchetes separados
		 *por v�rgula.*/
		
		/*Para percorrer o array e calcular a m�dia podemos
		 *usar um la�o "for" e no lugar da condi��o usamos o
		 *atributo do objeto "notasAlunoA" seguida da nota��o "."
		 *para invocar o atributo "lenght"*/
		double totalAlunoA = 0;
		for(int i = 0;i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		System.out.println(totalAlunoA / 3);
		/*Outra forma de declarar um array � a seguinte*/
		
		double [] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		/*Essa forma �  menos comum pois serve para dados fixos,
		 * n�o permitindo varia��es e reutiliza��es do c�digo.*/
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
			/*Acima usamos o �ndice "i" para solicitar que cada
			 * elemento do array seja somado.*/
						
		}
		System.out.println(totalAlunoB / notasAlunoB.length);
		
	}

}
