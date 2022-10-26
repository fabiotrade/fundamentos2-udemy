package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	/*Abertura da Classe Scanner para receber o input do usuátio.*/
	System.out.print("Quantas notas: ");
	/*Solicitação do input ao usuário.*/
	int qtdeNotas = entrada.nextInt();
	/*A Classe nextInt recolhe o input extritamente como um inteiro.*/
	double [] notas = new double [qtdeNotas];
	/*Criação do objeto array de nome "notas" que receberá, através
	 * da inicialização da variável qtdeNotas com a entrada do 
	 * Scanner usando a notação ponto para invocar o método nextInt
	 * que abastecerá o array com os tokens do tipo double 
	 * digitados pelo usuário, */
	for (int i = 0; i < notas.length; i ++) {
		System.out.print("Informe a nota: " + (i + 1) + ": ");
		notas [i] = entrada.nextDouble();
	/*O laço for acima instrui o programa a requisitar as notas
	 * enquanto o número máximo de posições do array não for
	 * atingido e deixa explícito que o objeto array "notas"
	 * contendo os índices "i" receberá a entrada de acordo com
	 * o métod "nextInt"*/
	}
	System.out.println("As notas do aluno foram " + Arrays.toString(notas));
	/*Impressão utilizando a Classe "Arrays" que invoca através da
	 * notação "." o método "toString" que converte os dados de
	 * entrada em tipo String para uma melhor impressão*/
	double total = 0;
	for(double nota : notas) {
		total += nota;
	}
	double media = total / notas.length;
	System.out.println("A média é " + media + "!");

	entrada.close();
	/*Fechameno da Classe Scanner.*/
	}

}
