package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	/*Abertura da Classe Scanner para receber o input do usu�tio.*/
	System.out.print("Quantas notas: ");
	/*Solicita��o do input ao usu�rio.*/
	int qtdeNotas = entrada.nextInt();
	/*A Classe nextInt recolhe o input extritamente como um inteiro.*/
	double [] notas = new double [qtdeNotas];
	/*Cria��o do objeto array de nome "notas" que receber�, atrav�s
	 * da inicializa��o da vari�vel qtdeNotas com a entrada do 
	 * Scanner usando a nota��o ponto para invocar o m�todo nextInt
	 * que abastecer� o array com os tokens do tipo double 
	 * digitados pelo usu�rio, */
	for (int i = 0; i < notas.length; i ++) {
		System.out.print("Informe a nota: " + (i + 1) + ": ");
		notas [i] = entrada.nextDouble();
	/*O la�o for acima instrui o programa a requisitar as notas
	 * enquanto o n�mero m�ximo de posi��es do array n�o for
	 * atingido e deixa expl�cito que o objeto array "notas"
	 * contendo os �ndices "i" receber� a entrada de acordo com
	 * o m�tod "nextInt"*/
	}
	System.out.println("As notas do aluno foram " + Arrays.toString(notas));
	/*Impress�o utilizando a Classe "Arrays" que invoca atrav�s da
	 * nota��o "." o m�todo "toString" que converte os dados de
	 * entrada em tipo String para uma melhor impress�o*/
	double total = 0;
	for(double nota : notas) {
		total += nota;
	}
	double media = total / notas.length;
	System.out.println("A m�dia � " + media + "!");

	entrada.close();
	/*Fechameno da Classe Scanner.*/
	}

}
