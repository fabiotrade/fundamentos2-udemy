package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String>fila = new LinkedList<String>();
		
		fila.add("Ana");
		/*O m�todo "offer" tamb�m adiciona, por�m, quando a fila
		 * est� cheia ele retorna uma "exception", no caso
		 * do m�todo "add", se ele n�o puder adicionar porque
		 * a fila est� cheia, ele retorna "false". */
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		/*Os m�todos "peek" e "element" buscam elementos na fila
		 * sem remover caso a fila esteja vazia, "peek" retorna
		 *"null" e "element" retorna uma exception.*/
		System.out.println(fila.peek());
		System.out.println(fila.element());
		/*Outros m�todos s�o: "fila.size()", "fila.clear()",
		 * "fila.isEmpty()","fila.contains()".*/
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		/*O m�todo "fila.poll" mostra o primeiro elemento da
		 * fila e ao mesmo tempo o remove, caso seja usado
		 * quando a fila j� estiver vazia retorna "null".*/
		System.out.println(fila.isEmpty());
		/*Com a fila j� vazia o m�todo "fila.isEmpty" retorna
		 * "true".*/
		
		
		
			
		
	
	}

}
