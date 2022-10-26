package classe;

public class AreaCirc {
	
	double raio;
	final static double pi = 3.1415;
	//Acima temos  dois atributos da classe AreaCirc.
	AreaCirc(double raioInicial) {
		/*Acima temos o método construtor*/
		//raioInicial é um parâmetro do tipo double
		raio = raioInicial;
		
		/*Os atributos raio e pi saõ obrigatórios 
		 * para a construção do objeto. */
	
	
	}
	
	double area() {
		return pi * Math.pow(raio, 2);
		/*O método acima é considerado estático porque
		 * não precisamos instanciar o método power
		 * que se refere à operação de potenciação
		 * esse método é estático porque já pertence
		 * à classe Math. */
		/*Math é uma classe e power é um método estático 
		 * que pertence a ela*/
		/*Outra forma seria raio * raio * pi*/
		/*Logo após a Classe Math usamos a notação "."(ponto)
		 * para invocar o método de potenciação pow, logo após
		 * o método pow surge o parênteses com duas "vagas"
		 * a serem preenchidas, na primeira adicionamos o atributo
		 * da classe e na segunda "vaga" adicionamos o valor
		 * de potenciação.*/
	}
	
}


