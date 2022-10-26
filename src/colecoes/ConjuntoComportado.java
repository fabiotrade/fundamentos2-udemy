package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	/*Objetivo: criar um Set que tenha dados
	 * de apenas um tipo.*/
	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>();
		/*Quando usamos HashSet não mantemos a ordem
		 * de inserção. */
		//TreeSet<String> listaAprovados = new TreeSet<>();
		/*Quando usamos o TreeSet mantemos a ordem de 
		 * inserção*/
		SortedSet<String> listaAprovados = new TreeSet<>();
		/*Outra opção para manter o ordenamento é o SortedSet.*/
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for (int n: nums) {
			System.out.println(n);
		}
				
	}

}
