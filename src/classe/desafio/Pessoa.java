package classe.desafio;

public class Pessoa {
	
	/*Definição dos atributos.*/
	String nome;
	double peso;
	/*Método construtor do objeto Pessoa.*/
	public Pessoa(String nome, double peso) {
		/*É necessário setar os valores recebidos como parâmetros
		 * usando o "this." para demonstrar claramente que os 
		 * parâmetros referem-se aos atributos da instância
		 * nas linhas 6 e 7*/
		this.nome = nome;
		this.peso = peso;
	
	}
	/*Método "comer" com retorno void, recebendo como parâmetro
	 *o objeto Comida.  */
	void comer(Comida comida) {
		/*Teste para checar se o que foi recebido é válido.*/
		if (comida != null) {
			this.peso += comida.peso;
			/*Caso o valor passado seja válido temos o acréscimo
			 * do peso usando o "this" para apontar para o atributo
			 * da instância.*/
		}
	}
	String apresentar() {
		return "Olá eu sou o " + nome + " e tenho " + peso + " Kgs.";
	}

}
