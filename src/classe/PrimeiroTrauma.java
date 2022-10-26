package classe;

public class PrimeiroTrauma {
	
	int a = 3;
	/*O atributo a é um atributo de instância porque não possui
	 *o tipificador static na sua composição, se possuísse, poderia
	 *ser acessado por um método de dentro do método main porque
	 *o método main também é estático (public STATIC void main)*/
	static int b = 4;
	/*O atributo b é estático pois possui o tipificador static
	 * e pode ser acessado de dentro do método estático main.*/
	
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
		/*Para poder acessar o valor inteiro e primitivo do
		 *atributo de instância (variável) "a" que está fora
		 *do escopo do método main tivemos que criar (instanciar)
		 *um objeto "PrimeiroTrauma p" porque "a" é um atributo
		 *de instância por não ser do tipo estático "static"
		 *se possuísse esse tipificador, automaticamente
		 *se tornaria m atributo de Classe. Usando o método
		 *construtor criamos um objeto e a seguir usando a
		 *notação ponto "." chamamos o atributo "a". */
		
		System.out.println(p.b);
		/*Usando o mesmo objeto de instância "p" podemos 
		 *chamar o atributo estático (atributo de Classe) "b"*/
	}

}
