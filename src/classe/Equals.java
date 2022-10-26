package classe;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com.br";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		/*Observação: o hashSet é um conjunto de hashCodes
		 * usado para atribuir valores numéricos do tipo
		 * inteiro a um conjunto de dados. Podemos usar
		 * o próprio número de letras do nome de uma pessoa
		 * como hashCode ou podemos atribuir um determinado
		 * valor inteiro a um determinado dado.*/
		
		
	}
	

}
