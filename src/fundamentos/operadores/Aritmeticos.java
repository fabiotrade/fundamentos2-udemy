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
		/*na divisão acima, sem o CAST, obteremos um número inteiro*/
		System.out.println((double)a / b);
		/*na linha acima, ao adicionar o tipo de variável double
		 * estamos realizando um CAST (conversão de tipo de variável)
		 * com o objetivo de obetr uma divisão com resultado
		 * decimal*/
		System.out.println(a + b);
		System.out.println(a - b);
		
		System.out.println(a % b);
		/*Na linha acima, temos o operador MÓDULO, que é o resto da
		 * divisão.*/
			
	}

}
