package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Digite uma nota ou -1 para sair:\n ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
			total += nota;
			quantidadeDeNotas ++;
		}else if(nota !=-1) {
			System.out.println("Nota inválida.;D");
		}
	}
		//Calcular Média
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);

		entrada.close();
		
	}

}

