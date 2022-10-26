package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		/*Java converte automaticamente o double (ptimitivo)
		 * para Classe Double.*/
		conjunto.add(true);
		/*Java converte automaticamente boolean (primitivo)
		 * para Classe Boolean.*/
		conjunto.add("Teste");
		/*Java converte automaticamente a string (primitivo)
		 * para classe String.*/
		conjunto.add(1);
		/*Java converte automaticamente o inteiro (primitivo)
		 * para wrapper INTEGER.*/
		conjunto.add('x');
		/*Java converte automaticamente o char (primitivo)
		 * para a Classe Caracter.*/
		/*Abaixo chamamos os métodos*/
		System.out.println("Tamanho é " + conjunto.size());
		conjunto.add("teste");
		System.out.println("Novo tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains("teste"));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.add(nums);
		/*Acima temos a união entre os comjuntos.*/
		System.out.println(conjunto);
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		conjunto.clear();
		/*Limpa os dados do conjunto.*/
		System.out.println(conjunto);
	}

}
