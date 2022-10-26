package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	/*O objetivo da classe é obter entradas de números de alunos, 
	 * número de notas por aluno e devolver a média final da classe.*/
	
	public static void main(String[] args) {
		/*Método main.*/		
		Scanner entrada = new Scanner(System.in);
		/*Uso da classe Scanner para abrir uma stream de input.*/		
		System.out.println("Quantos alunos há na sala? ");
		/*\Primeira questão.*/
		int qtdeAlunos = entrada.nextInt();
		/*Primeiro input através do Scanner com ".nextInt" que 
		 *é um método da Classe Scanner que analisa e confirma
		 *se o token recebido está no formato do tipo inteiro.*/
		System.out.println("Quantas notas por aluno? ");
		/*Segunda questão.*/
		int qtdeNotas = entrada.nextInt();
		/*Segundo input através do Scanner com ".nextInt".*/		
		double [][] notasDaTurma = new double [qtdeAlunos] [qtdeNotas];
		/*Instanciando o objeto matriz (array bidimensional) 
		 *notasDaTurma. Nesse caso o mais importante é
		 *lembrar que cada "array" externo representa um aluno
		 *e que dentro de cada um deles há um array interno com
		 *as notas, portanto, para obter a média final
		 *da classe temos que dividir a soma das notas
		 *pela multiplicação entre o número de alunos "qtdeAlunos"
		 *e o número de notas "qtdeNotas".*/
		double total  = 0;
		/*Essa variável foi inicializada com o valor 0 porque depois
		 *receberá a soma das notas após o ".nextDouble".*/
		for (int a = 0; a < notasDaTurma.length; a++) {
			/*O for acima é o mais externo e percorre a quantidade 
			 *de alunos.*/
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				/*O for mais interno percorre a quantidade de 
				 *notas dos alunos.*/
			System.out.printf("Informe a nota %d do aluno %d: "
					, n + 1, a + 1);
			/*Na impressão acima usamos "n+1" e "a+1" porque caso 
			 * usássemos apenas n e a, a contagem começaria do 0
			 * exemplo "aluno 0" e "nota 0" e ficaria estranho.*/
			notasDaTurma[a][n] = entrada.nextDouble();
			/*Acima, o array bidimensional aluno, nota recebe
			 *os valores recolhidos pelo Scanner 
			 *"entrada.nextDouble"*/
			total += notasDaTurma [a][n];
			/*Soma (+=) das "notasDaturma [][]".*/
			}
			
		}
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("A média da turma foi " + media);	
		
		for(double[] notasDoAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));	
		}
		

		entrada.close();
	}

}
