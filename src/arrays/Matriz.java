package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	/*O objetivo da classe � obter entradas de n�meros de alunos, 
	 * n�mero de notas por aluno e devolver a m�dia final da classe.*/
	
	public static void main(String[] args) {
		/*M�todo main.*/		
		Scanner entrada = new Scanner(System.in);
		/*Uso da classe Scanner para abrir uma stream de input.*/		
		System.out.println("Quantos alunos h� na sala? ");
		/*\Primeira quest�o.*/
		int qtdeAlunos = entrada.nextInt();
		/*Primeiro input atrav�s do Scanner com ".nextInt" que 
		 *� um m�todo da Classe Scanner que analisa e confirma
		 *se o token recebido est� no formato do tipo inteiro.*/
		System.out.println("Quantas notas por aluno? ");
		/*Segunda quest�o.*/
		int qtdeNotas = entrada.nextInt();
		/*Segundo input atrav�s do Scanner com ".nextInt".*/		
		double [][] notasDaTurma = new double [qtdeAlunos] [qtdeNotas];
		/*Instanciando o objeto matriz (array bidimensional) 
		 *notasDaTurma. Nesse caso o mais importante �
		 *lembrar que cada "array" externo representa um aluno
		 *e que dentro de cada um deles h� um array interno com
		 *as notas, portanto, para obter a m�dia final
		 *da classe temos que dividir a soma das notas
		 *pela multiplica��o entre o n�mero de alunos "qtdeAlunos"
		 *e o n�mero de notas "qtdeNotas".*/
		double total  = 0;
		/*Essa vari�vel foi inicializada com o valor 0 porque depois
		 *receber� a soma das notas ap�s o ".nextDouble".*/
		for (int a = 0; a < notasDaTurma.length; a++) {
			/*O for acima � o mais externo e percorre a quantidade 
			 *de alunos.*/
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				/*O for mais interno percorre a quantidade de 
				 *notas dos alunos.*/
			System.out.printf("Informe a nota %d do aluno %d: "
					, n + 1, a + 1);
			/*Na impress�o acima usamos "n+1" e "a+1" porque caso 
			 * us�ssemos apenas n e a, a contagem come�aria do 0
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
		System.out.println("A m�dia da turma foi " + media);	
		
		for(double[] notasDoAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));	
		}
		

		entrada.close();
	}

}
