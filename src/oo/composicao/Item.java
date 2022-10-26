package oo.composicao;

public class Item {
	
	String nome;
	int quantidade;
	double preco;					
	
	/*Abaixo usaremos o construtor padr�o da 
	 * Classe Item para criar o objeto Item.
	 *Usaremos o "this" para sinalizar que
	 *os atributos do objeto referem-se aos
	 *atributos de inst�ncia declarados na 
	 *Classe. */
	Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		/*Esse ojeto poder� ser utilizado v�rias vezes
		 * na Classe "CompraTeste", com seus atributos
		 * sendo modificados.*/
	}

}
