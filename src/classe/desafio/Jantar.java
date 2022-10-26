package classe.desafio;

public class Jantar {
	/*Finalmente nessa Classe criamos a lógica de interação
	 * das Classes Comiida e Pessoa.*/ 
	public static void main(String[] args) {
		Comida c1 = new Comida("Arroz", 0.180);
		/*Criação do objeto c1.*/
		Comida c2 = new Comida("Feijão", 0.300);
		/*Criação do objeto c2.*/
		
		Pessoa p = new Pessoa("João", 99.8);
		/*Criação do objeto*/
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());
	}

}
