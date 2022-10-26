package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		//Domingo -> 1
		//quarta -> 4
		//teça -> 3
		
		Scanner entrada = new Scanner(System.in);
		/*A Classe System, da Classe java.lang, não pode ser estendida
		 * porque seus métodos são estáticos, possui 3 variáveis (streams)
		 * voltadas para inputs, outputs e comunicação de erros.
		 * Após a notação ponto ".", temos a chamada da variável in
		 * que é uma stream de inputs que armazena a forma de entrada
		 * de dados.
		 * */
		
		System.out.println("Digite o nome de um dia da semana: ");
		
		String dia = entrada.next();
		/*Para receber apenas uma linha de parâmetros digitados 
		 * pelo usuário o método next é suficiente, porém, para
		 * receber mais de uma linha seria necessário usar o
		 * método nextLine*/
		if(dia.equalsIgnoreCase("domingo")) {
			/*Para fazer igualdade de Strings não devemos usar == 
			 * uma das formas é o método equalsIgnoreCase no qual
			 * são aceitas tanto letras maiúsculas quanto minúsculas*/
			    System.out.println(1);
		   }else if(dia.equalsIgnoreCase("segunda")) {
				System.out.println(2);
		   }else if(dia.equalsIgnoreCase("terça")
				   || dia.equalsIgnoreCase("terca")) {
				System.out.println(3);
		   }else if(dia.equalsIgnoreCase("quarta")) {
				System.out.println(4);
		   }else if(dia.equalsIgnoreCase("quinta")) {
				System.out.println(5);
		   }else if(dia.equalsIgnoreCase("sexta")) {
				System.out.println(6);
		   }else if(dia.equalsIgnoreCase("sábado")
				   || dia.equalsIgnoreCase("sabado")) {
				System.out.println(7);
		   }else {
			    System.out.println("Dia inválido!!!");
		   }
			
		
		
		
		
		entrada.close();
		
	}
	

}
