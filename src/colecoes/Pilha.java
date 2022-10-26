package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String>livros = new ArrayDeque<String>();
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		/*Abaixo temos um "for" para percorrer a pilha. Esse
		 * "for" segue as regras LIFO  no caso de uma pilha
		 * e as regras FIFO no caso de uma  fila.*/
		for(String livro: livros) {
			System.out.println(livro);
		}
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		/*livros.size();
		livros.clear();
		livros.contains(livros);
		livros.isEmpty();*/
		
		
	
	}

}
