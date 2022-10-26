package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String>fila = new LinkedList<String>();
		
		fila.add("Ana");
		/*O método "offer" também adiciona, porém, quando a fila
		 * está cheia ele retorna uma "exception", no caso
		 * do método "add", se ele não puder adicionar porque
		 * a fila está cheia, ele retorna "false". */
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		/*Os métodos "peek" e "element" buscam elementos na fila
		 * sem remover caso a fila esteja vazia, "peek" retorna
		 *"null" e "element" retorna uma exception.*/
		System.out.println(fila.peek());
		System.out.println(fila.element());
		/*Outros métodos são: "fila.size()", "fila.clear()",
		 * "fila.isEmpty()","fila.contains()".*/
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		/*O método "fila.poll" mostra o primeiro elemento da
		 * fila e ao mesmo tempo o remove, caso seja usado
		 * quando a fila já estiver vazia retorna "null".*/
		System.out.println(fila.isEmpty());
		/*Com a fila já vazia o método "fila.isEmpty" retorna
		 * "true".*/
		
		
		
			
		
	
	}

}
