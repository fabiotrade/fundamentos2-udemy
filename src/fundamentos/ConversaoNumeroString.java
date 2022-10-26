package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		/*INTEGER � o WRAPPER dos tipos num�ricos
		 * do tipo int, ou seja, n�meros inteiros,
		 *os WRAPPERS s�o os envelopes que nos permitem 
		 *"transformar" tipos num�ricos primitivos
		 *em objetos, e isso � realizado para que 
		 *um n�mero possa ter atributos e m�todos
		 *que sejam �teis e funcionais num programa
		 *quando temos um objeto, podemos usar a 
		 *nota��o ".", ela nos permite "chamar" uma
		 *s�rie de m�todos dispon�veis na linguagem
		 *JAVA e atribuir funcionalidades ao objeto,
		 *portanto, um n�mero que antes n�o tinha
		 *tinha funcionalidades simples passa a ter
		 *muitas funcionalidades.  */
		/*Um exemplo de funcionalidade dispon�vel
		 * no tipo STRING e n�o dispon�vel
		 * no tipo INTEGER � a nota��o .length que
		 * conta  quantos algarismos tem o n�mero.*/
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		/*Essa � outra forma de converter o tipo inteiro
		 * INT para o WRAPPER INTEGER e a seguir usar
		 * as nota��es "."*/
		
		
	}
	

}
