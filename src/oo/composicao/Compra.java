package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	/*Como agente de atua��o (atuador) entre
	 * o "Item" e a "Compra" usaremos o atributo
	 * de inst�ncia "Cliente"*/
	
	String cliente;
	
	/*Para armazenar os �tens criaremos um ArrayList que 
	 * mostra que apenas �tens do tipo (Classe) <Item> poder�o
	 * entrar, ou seja, s�o dados homog�neos.*/
	
	ArrayList<Item>itens = new ArrayList<Item>();
	/*Acima temos uma rela��o 1 para n, ou seja,
	 * uma compra tem muitos �tens, por�m, um 
	 * �tem s� pode pertencer a uma compra*/
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}

}
