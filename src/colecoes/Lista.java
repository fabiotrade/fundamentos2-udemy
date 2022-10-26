package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	/*Importante: a vis�o correta � que criamos a Classe Usu�rio
	 * porque precisamos de um objeto para manipular dentro
	 * da Classe Lista, portanto, quando trabalhamos com Orienta��o
	 * a Objetos (usamos objetos para abstrair situa��es atribuindo-lhes
	 * atributos e m�todos) nosso foco sempre ser� criar uma Classe
	 * para que a partitr dela possamos criar objetos e manipul�-los.
	 * Caso n�o tenhamos o "Objeto X" oriundo da "Classe X" no
	 * mesmo "package" da Classe na qual queremos manipul�-lo
	 * devemos importar o "Objeto"*/
	
	public static void main(String[] args) {
		
		List<Usuario>lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		/*Acima instanciamos o Objetos dessa forma porque
		 * quando esse Objeto foi criado na outra Classe
		 * ele recebeu como par�metros String nome, ent�o,
		 * ao instanci�-lo temos que fornecer esses par�metros.*/
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(4));//acessando pelo �ndice.
		/*M�todo get para selecionar o nome na posi��o 4 da lista.*/
		lista.remove(1);
		/*O m�todo acima remove pelo �ndice.Essa forma de remo��o
		 * quando solicitada a imprimir responde com o 
		 * pr�prio elemento removido para informar sobre
		 * o ato de remo��o. Ver abaixo.*/
		System.out.println(">>>>" + lista.remove(2) + ">foi removido<");
		System.out.println(lista.remove(new Usuario("Manu")));
		/*O m�todo acima remove pelo objeto.Essa forma de remo��o
		 * quando solicitada a imprimir responde com true ou false
		 * para informar sobre o ato de remo��o.*/
		System.out.println("Tem o elemento Lia? " +lista.contains(new Usuario("Lia")));
		System.out.println();
		
		/*O la�o for serve para percorrer a ArrayList, 
		 *com "Usuario u" percorremos a "lista" e com "u" +
		 *nota��o "." chamamos os nomes da "lista"*/
		for(Usuario u: lista) {
			System.out.println(u);
		}/*Acima poder�amos escrever "(u.toString)", ou
		deixar impl�cito como j� est�.*/
	}

}
