package classe;

public class Produto {
/*O objetivo � conceder desconto de 25% em todos os produtos.*/
	String nome;
	double preco;
	static double desconto = 0.25;
	/*Abaixo estamos criando um construtor sem par�metros para 
	 * representar os valores padr�o
	 * e outro com par�metros, ao fazer isso teremos, al�m do 
	 * construtor padr�o (impl�cito que existe em toda classe que 
	 * criamos)um construtor 
	 * com par�metros, precisamos passar os par�metros
	 * de cada objeto referente a esse construtor na Classe teste.*/
			
		
	
	Produto() {
		//Esse m�todo serve para o valor padr�o.
	}
	
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		
	}

	double precoComDesconto() {

		return preco * (1 - desconto);
	}

	double precoComDesconto(double descontoDoGerente) {
		
		return preco * (1 - desconto + descontoDoGerente);

}
}
