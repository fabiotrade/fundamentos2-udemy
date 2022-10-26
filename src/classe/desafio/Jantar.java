package classe.desafio;

public class Jantar {
	/*Finalmente nessa Classe criamos a l�gica de intera��o
	 * das Classes Comiida e Pessoa.*/ 
	public static void main(String[] args) {
		Comida c1 = new Comida("Arroz", 0.180);
		/*Cria��o do objeto c1.*/
		Comida c2 = new Comida("Feij�o", 0.300);
		/*Cria��o do objeto c2.*/
		
		Pessoa p = new Pessoa("Jo�o", 99.8);
		/*Cria��o do objeto*/
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());
	}

}
