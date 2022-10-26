package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	/*Importante: a visão correta é que criamos a Classe Usuário
	 * porque precisamos de um objeto para manipular dentro
	 * da Classe Lista, portanto, quando trabalhamos com Orientação
	 * a Objetos (usamos objetos para abstrair situações atribuindo-lhes
	 * atributos e métodos) nosso foco sempre será criar uma Classe
	 * para que a partitr dela possamos criar objetos e manipulá-los.
	 * Caso não tenhamos o "Objeto X" oriundo da "Classe X" no
	 * mesmo "package" da Classe na qual queremos manipulá-lo
	 * devemos importar o "Objeto"*/
	
	public static void main(String[] args) {
		
		List<Usuario>lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		/*Acima instanciamos o Objetos dessa forma porque
		 * quando esse Objeto foi criado na outra Classe
		 * ele recebeu como parâmetros String nome, então,
		 * ao instanciá-lo temos que fornecer esses parâmetros.*/
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(4));//acessando pelo índice.
		/*Método get para selecionar o nome na posição 4 da lista.*/
		lista.remove(1);
		/*O método acima remove pelo índice.Essa forma de remoção
		 * quando solicitada a imprimir responde com o 
		 * próprio elemento removido para informar sobre
		 * o ato de remoção. Ver abaixo.*/
		System.out.println(">>>>" + lista.remove(2) + ">foi removido<");
		System.out.println(lista.remove(new Usuario("Manu")));
		/*O método acima remove pelo objeto.Essa forma de remoção
		 * quando solicitada a imprimir responde com true ou false
		 * para informar sobre o ato de remoção.*/
		System.out.println("Tem o elemento Lia? " +lista.contains(new Usuario("Lia")));
		System.out.println();
		
		/*O laço for serve para percorrer a ArrayList, 
		 *com "Usuario u" percorremos a "lista" e com "u" +
		 *notação "." chamamos os nomes da "lista"*/
		for(Usuario u: lista) {
			System.out.println(u);
		}/*Acima poderíamos escrever "(u.toString)", ou
		deixar implícito como já está.*/
	}

}
