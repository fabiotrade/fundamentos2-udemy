package fundamentos.operadores;

public class Atribuicao {
	
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		
		c += b; //c = c + b;
		c -= a; //c = a - a;
		c *= b; //c = c * b;
		c /= a; //c = c / a;(para n�meros quebrados seria necess�rio faxer um cast.
		c %= 2; //c / % 2; 0 ou 1 m�dulo
		
		c++;// c = c + 1; operador un�rio de atribui��o e incremento.
		
		System.out.println(c);
		
		c %= 2; // c =c %2; 0 ou 1
		System.out.println(c);
		
		
	}
	

}
