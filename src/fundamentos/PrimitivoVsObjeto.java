package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		String s = new String("texto");
		s.toUpperCase();
		
		/* Wrappers simbolizam envelopes ou encapsulamento
		 * num caso em que precisamos que um tipo primitivo
		 * possua atributos e/ou métodos que possam ser chamados pela 
		 * notação "." usamos um Wrapper para que um tipo primitivo 
		 * encapsulado se torne um objeto, com isso ele deixa de ser
		 *  apenas um  tipo primitivo e passa a ser um objeto com 
		 *  atributos e/ou métodos. Para cada tipo primitivo há um
		 *   tipo de Wrapper associado. 
		 * */
		int a = 123;
		System.out.println(a);
	}
	

}
