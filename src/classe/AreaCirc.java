package classe;

public class AreaCirc {
	
	double raio;
	final static double pi = 3.1415;
	//Acima temos  dois atributos da classe AreaCirc.
	AreaCirc(double raioInicial) {
		/*Acima temos o m�todo construtor*/
		//raioInicial � um par�metro do tipo double
		raio = raioInicial;
		
		/*Os atributos raio e pi sa� obrigat�rios 
		 * para a constru��o do objeto. */
	
	
	}
	
	double area() {
		return pi * Math.pow(raio, 2);
		/*O m�todo acima � considerado est�tico porque
		 * n�o precisamos instanciar o m�todo power
		 * que se refere � opera��o de potencia��o
		 * esse m�todo � est�tico porque j� pertence
		 * � classe Math. */
		/*Math � uma classe e power � um m�todo est�tico 
		 * que pertence a ela*/
		/*Outra forma seria raio * raio * pi*/
		/*Logo ap�s a Classe Math usamos a nota��o "."(ponto)
		 * para invocar o m�todo de potencia��o pow, logo ap�s
		 * o m�todo pow surge o par�nteses com duas "vagas"
		 * a serem preenchidas, na primeira adicionamos o atributo
		 * da classe e na segunda "vaga" adicionamos o valor
		 * de potencia��o.*/
	}
	
}


