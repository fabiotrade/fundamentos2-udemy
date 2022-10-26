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
		/*Quando usamos HashSet n�o mantemos a ordem
		 * de inser��o. */
		//TreeSet<String> listaAprovados = new TreeSet<>();
		/*Quando usamos o TreeSet mantemos a ordem de 
		 * inser��o*/
		SortedSet<String> listaAprovados = new TreeSet<>();
		/*Outra op��o para manter o ordenamento � o SortedSet.*/
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
