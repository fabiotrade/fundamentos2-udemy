package classe.desafio;

public class Comida {
	
	/*Definição dos atributos.*/
	String nome;
	double peso;
	
	/*Construtor do objeto Comida com valores recebidos como
	 * par|âmetros.*/
	public Comida(String nome, double peso) {
		/*É necessário setar os valores recebidos como parâmetros
		 * usando o "this." para demonstrar claramente que os 
		 * parâmetros referem-se aos atributos da instância
		 * nas linhas 6 e 7*/
		this.nome = nome;
		this.peso = peso;	
	}
		
		
}
	


