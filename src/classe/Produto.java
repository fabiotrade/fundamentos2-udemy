package classe;

public class Produto {
/*O objetivo é conceder desconto de 25% em todos os produtos.*/
	String nome;
	double preco;
	static double desconto = 0.25;
	/*Abaixo estamos criando um construtor sem parâmetros para 
	 * representar os valores padrão
	 * e outro com parâmetros, ao fazer isso teremos, além do 
	 * construtor padrão (implícito que existe em toda classe que 
	 * criamos)um construtor 
	 * com parâmetros, precisamos passar os parâmetros
	 * de cada objeto referente a esse construtor na Classe teste.*/
			
		
	
	Produto() {
		//Esse método serve para o valor padrão.
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
