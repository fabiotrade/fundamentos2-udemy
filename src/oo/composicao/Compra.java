package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	/*Como agente de atuação (atuador) entre
	 * o "Item" e a "Compra" usaremos o atributo
	 * de instância "Cliente"*/
	
	String cliente;
	
	/*Para armazenar os ítens criaremos um ArrayList que 
	 * mostra que apenas ítens do tipo (Classe) <Item> poderão
	 * entrar, ou seja, são dados homogêneos.*/
	
	ArrayList<Item>itens = new ArrayList<Item>();
	/*Acima temos uma relação 1 para n, ou seja,
	 * uma compra tem muitos ítens, porém, um 
	 * ítem só pode pertencer a uma compra*/
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}

}
