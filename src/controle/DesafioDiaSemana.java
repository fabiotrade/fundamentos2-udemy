package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		//Domingo -> 1
		//quarta -> 4
		//te�a -> 3
		
		Scanner entrada = new Scanner(System.in);
		/*A Classe System, da Classe java.lang, n�o pode ser estendida
		 * porque seus m�todos s�o est�ticos, possui 3 vari�veis (streams)
		 * voltadas para inputs, outputs e comunica��o de erros.
		 * Ap�s a nota��o ponto ".", temos a chamada da vari�vel in
		 * que � uma stream de inputs que armazena a forma de entrada
		 * de dados.
		 * */
		
		System.out.println("Digite o nome de um dia da semana: ");
		
		String dia = entrada.next();
		/*Para receber apenas uma linha de par�metros digitados 
		 * pelo usu�rio o m�todo next � suficiente, por�m, para
		 * receber mais de uma linha seria necess�rio usar o
		 * m�todo nextLine*/
		if(dia.equalsIgnoreCase("domingo")) {
			/*Para fazer igualdade de Strings n�o devemos usar == 
			 * uma das formas � o m�todo equalsIgnoreCase no qual
			 * s�o aceitas tanto letras mai�sculas quanto min�sculas*/
			    System.out.println(1);
		   }else if(dia.equalsIgnoreCase("segunda")) {
				System.out.println(2);
		   }else if(dia.equalsIgnoreCase("ter�a")
				   || dia.equalsIgnoreCase("terca")) {
				System.out.println(3);
		   }else if(dia.equalsIgnoreCase("quarta")) {
				System.out.println(4);
		   }else if(dia.equalsIgnoreCase("quinta")) {
				System.out.println(5);
		   }else if(dia.equalsIgnoreCase("sexta")) {
				System.out.println(6);
		   }else if(dia.equalsIgnoreCase("s�bado")
				   || dia.equalsIgnoreCase("sabado")) {
				System.out.println(7);
		   }else {
			    System.out.println("Dia inv�lido!!!");
		   }
			
		
		
		
		
		entrada.close();
		
	}
	

}
