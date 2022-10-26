package classe.desafio;

public class Pessoa {
	
	/*Defini��o dos atributos.*/
	String nome;
	double peso;
	/*M�todo construtor do objeto Pessoa.*/
	public Pessoa(String nome, double peso) {
		/*� necess�rio setar os valores recebidos como par�metros
		 * usando o "this." para demonstrar claramente que os 
		 * par�metros referem-se aos atributos da inst�ncia
		 * nas linhas 6 e 7*/
		this.nome = nome;
		this.peso = peso;
	
	}
	/*M�todo "comer" com retorno void, recebendo como par�metro
	 *o objeto Comida.  */
	void comer(Comida comida) {
		/*Teste para checar se o que foi recebido � v�lido.*/
		if (comida != null) {
			this.peso += comida.peso;
			/*Caso o valor passado seja v�lido temos o acr�scimo
			 * do peso usando o "this" para apontar para o atributo
			 * da inst�ncia.*/
		}
	}
	String apresentar() {
		return "Ol� eu sou o " + nome + " e tenho " + peso + " Kgs.";
	}

}
