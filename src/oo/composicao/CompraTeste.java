package oo.composicao;

@SuppressWarnings("unused")
public class CompraTeste {
	/*Essa Classe contnedo o sufixo Teste é 
	 * usada para testar o programa.*/
	public static void main(String[] args) {
		Compra compra1 = new Compra();
		/*Método construtor do objeto compra "compra1"
		 *com seus atributos abaixo */
		compra1.cliente = "João Pedro";
		compra1.itens.add(new Item("Caneta",20, 7.45));
		compra1.itens.add(new Item("Borracha",12, 3.89));
		compra1.itens.add(new Item("Caneta",3, 18.79));
		
		System.out.println("Quantidade de itens no carrinho: " +compra1.itens.size());
		System.out.println("Valor da compra R$" + compra1.obterValorTotal());
		
		/*Scanner entrada = new Scanner(System.in);
		System.out.println("Deseja finalizar as compras?");
		boolean resposta = entrada.;
		if (resposta = "sim") {
			
		}

		entrada.close();*/
	}

}
