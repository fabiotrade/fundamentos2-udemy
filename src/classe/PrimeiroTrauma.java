package classe;

public class PrimeiroTrauma {
	
	int a = 3;
	/*O atributo a � um atributo de inst�ncia porque n�o possui
	 *o tipificador static na sua composi��o, se possu�sse, poderia
	 *ser acessado por um m�todo de dentro do m�todo main porque
	 *o m�todo main tamb�m � est�tico (public STATIC void main)*/
	static int b = 4;
	/*O atributo b � est�tico pois possui o tipificador static
	 * e pode ser acessado de dentro do m�todo est�tico main.*/
	
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
		/*Para poder acessar o valor inteiro e primitivo do
		 *atributo de inst�ncia (vari�vel) "a" que est� fora
		 *do escopo do m�todo main tivemos que criar (instanciar)
		 *um objeto "PrimeiroTrauma p" porque "a" � um atributo
		 *de inst�ncia por n�o ser do tipo est�tico "static"
		 *se possu�sse esse tipificador, automaticamente
		 *se tornaria m atributo de Classe. Usando o m�todo
		 *construtor criamos um objeto e a seguir usando a
		 *nota��o ponto "." chamamos o atributo "a". */
		
		System.out.println(p.b);
		/*Usando o mesmo objeto de inst�ncia "p" podemos 
		 *chamar o atributo est�tico (atributo de Classe) "b"*/
	}

}
