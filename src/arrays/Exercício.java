package arrays;

import java.util.Arrays;

public class Exercício {
	
	public static void main(String[] args) {
		
		double [] notasAlunoA = new double [3];
		/*Criação do objeto array unidimensional (possui
		 * apenas um par de colchetes) de nome notasAlunoaA
		 * contendo elementos do tipo double e declaração
		 * do número de posições entre colchetes.*/
		notasAlunoA [0] = 7.9;
		notasAlunoA [1] = 8;
		notasAlunoA [2] = 6.7;	
		
		System.out.println(Arrays.toString(notasAlunoA));
		/*Para imprimir as notas do aluno de uma forma mais
		 *interessante chamamos a Classe "Arrays" e através dela, 
		 *usando a notação"." invocamos o método "toString" que 
		 *transforma o conteúdo do array em string no momento e 
		 *nos permite imprimir o conteúdo entre colchetes separados
		 *por vírgula.*/
		
		/*Para percorrer o array e calcular a média podemos
		 *usar um laço "for" e no lugar da condição usamos o
		 *atributo do objeto "notasAlunoA" seguida da notação "."
		 *para invocar o atributo "lenght"*/
		double totalAlunoA = 0;
		for(int i = 0;i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		System.out.println(totalAlunoA / 3);
		/*Outra forma de declarar um array é a seguinte*/
		
		double [] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		/*Essa forma é  menos comum pois serve para dados fixos,
		 * não permitindo variações e reutilizações do código.*/
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
			/*Acima usamos o índice "i" para solicitar que cada
			 * elemento do array seja somado.*/
						
		}
		System.out.println(totalAlunoB / notasAlunoB.length);
		
	}

}
