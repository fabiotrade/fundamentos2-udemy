package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	/*A estrutura de dados do tipo Map usa o sistema
	 *"chave-valor". Lembrando que um valor pode ter
	 *duas chaves diferentes correspondentes a ele,
	 *porém, uma chave só pode ter um valor correspondente
	 *a ela.*/
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		/*Tanto Integer como String são tipos não primitivos em Java
		 * portanto, letra maiúscula no início.*/
		usuarios.put(1, "Fábio");
		/*estrutura do tipo Map não utiliza o método "add" para
		 * adicionar, usa o método "put" que tanto adiciona um
		 * elemento quanto substitui elementos.*/
		usuarios.put(3, "Roberto");
		/*Primeiro o método put adiciona "Roberto", num segundo
		 * momento ele substitui por "Fábio".*/
		usuarios.put(20, "Rafaela");
		usuarios.put(5, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));
		System.out.println(usuarios.get(20));
		/*Abaixo temos 3 formas de percorrer o Map.*/
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
			}
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + "==>");
			System.out.println(registro.getValue());
		}
	}

}
