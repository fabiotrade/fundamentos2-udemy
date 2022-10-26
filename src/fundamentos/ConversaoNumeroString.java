package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		/*INTEGER é o WRAPPER dos tipos numéricos
		 * do tipo int, ou seja, números inteiros,
		 *os WRAPPERS são os envelopes que nos permitem 
		 *"transformar" tipos numéricos primitivos
		 *em objetos, e isso é realizado para que 
		 *um número possa ter atributos e métodos
		 *que sejam úteis e funcionais num programa
		 *quando temos um objeto, podemos usar a 
		 *notação ".", ela nos permite "chamar" uma
		 *série de métodos disponíveis na linguagem
		 *JAVA e atribuir funcionalidades ao objeto,
		 *portanto, um número que antes não tinha
		 *tinha funcionalidades simples passa a ter
		 *muitas funcionalidades.  */
		/*Um exemplo de funcionalidade disponível
		 * no tipo STRING e não disponível
		 * no tipo INTEGER é a notação .length que
		 * conta  quantos algarismos tem o número.*/
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		/*Essa é outra forma de converter o tipo inteiro
		 * INT para o WRAPPER INTEGER e a seguir usar
		 * as notações "."*/
		
		
	}
	

}
