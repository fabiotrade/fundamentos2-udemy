package fundamentos.operadores;

public class Aritmeticos {
	
	public static void main(String[] args) {
		
		System.out.println(2+3);
		
		var x= 34.56;
		double y = 2.2;
		
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x + y);
		System.out.println(x - y);
		
		int a =8;
		int b=3;
		
		System.out.println(a * b);
		System.out.println(a / b);
		/*na divis�o acima, sem o CAST, obteremos um n�mero inteiro*/
		System.out.println((double)a / b);
		/*na linha acima, ao adicionar o tipo de vari�vel double
		 * estamos realizando um CAST (convers�o de tipo de vari�vel)
		 * com o objetivo de obetr uma divis�o com resultado
		 * decimal*/
		System.out.println(a + b);
		System.out.println(a - b);
		
		System.out.println(a % b);
		/*Na linha acima, temos o operador M�DULO, que � o resto da
		 * divis�o.*/
			
	}

}
