package classe;

public class ValorVsReferencia {
	/*Ojetivo dessa Classe: mostrar o uso de atribuição por valor,
	 *a atribuição por referência, o uso de um objeto como 
	 *parâmetro de um método estático e as implicações dessa
	 *prática na modificação de referências em memória. Usaremos
	 *referências de outras Classes já criadas anteriormente
	 *nesse mesmo pacote "classe",por exemplo o objeto Data
	 * da Classe Data.*/
	
	public static void main(String[] args) {
	/*Função main com modificadores de acesso público, estático 
	 * e retorno vazio (void), cujos parâmetros referenciados
	 * pela classe String são o package "classe" e a Classe
	 * "ValorVsReferencia".*/
		double a = 2;
		/*Declaração e inicialização da variável a, atribuição
		 *por valor.(Tipo primitivo).*/
		double b = a;
		/*Declaração e inicialização da variável b.*/
		
		a ++;//Somando 1 ao valor 2 inicializado em a.
		b --;/*Subtraindo 1 do valor 2 inicializado em a
		e igualado em b. */
		
		System.out.println(a + " " + b);
		/*Impressão dos valores após a soma e subtração usando a 
		 *classe System,  a corrente  de exteriorização
		 *(out put stream) out e o método println.*/
		
		Data d1 = new Data(1, 6, 2022);//Criação do Objeto Data d1.
		Data d2 = d1; //atribuição por referência d2 = Objeto d1.
		/*As duas variáveis apontam para o mesmo objeto em memória
		 * Acima temos a criação do objeto data com as posições
		 * iniciais preenchidas por conveniência com 1, 6, 2022.
		 * Esse objeto data pode ser passado como parâmetro para
		 * um ou mais métodos, caso seja feita alguma modificação
		 *nos dados do objeto dentro do método que o está utilizando
		 *quem criou o objeto vai perceber. Tanto d1 quanto d2
		 *apontam para o mesmo endereço em memória.*/
		
		d1.dia = 31;
		/*Aqui o objeto Data d1 através da notação 
		ponto "chama" a variável do tipo inteiro dia, presente 
		na Classe Data e a inicializa com o valor 31.*/
		d2.mes = 12;
		/*Aqui o objeto Data d2 através da notação 
		ponto "chama" a variável do tipo inteiro mes,  presente 
		na Classe Data e a inicializa com o valor 12.*/
		
		d1.ano = 2025;
		/*Aqui o objeto Data d1 através da notação 
		ponto "chama" a variável do tipo inteiro ano,  presente 
		na Classe Data e a inicializa com o valor 2025.*/
		
		System.out.println(d1.obterDataFormatada());
		/*Usando a notação ponto, o objeto d1 "chama" o método
		 * obter data formatada para impressão.*/
		System.out.println(d2.obterDataFormatada());
		/*Usando a notação ponto, o objeto d2 "chama" o método
		 * obter data formatada para impressão.*/
		
		voltarDataParaValorPadrao(d1);
		/*Esse método, seguindo as instruções passadas na 
		 * linha 88, por um método que usa como parâmetro 
		 * o objeto Data, modifica  as referências armazenadas em
		 * memória que inicialmente seguiam a declaração e
		 * inicialização do objeto Data na linha 32.
		 * Isso não é uma boa prática, é apenas para demonstrar
		 * a modificação de referências em memória através
		 * da utilização de um objeto como parâmetro de um
		 * método. */
		
		System.out.println(d1.obterDataFormatada());
		/*Impressão da Data d1 através da chamada do novo padrão
		 * estabelecido na linha 88 usando a notação ponto.*/
		System.out.println(d2.obterDataFormatada());
		/*Impressão da Data d2 que é igual a d1 (linha 33)
		 *através da chamada do novo padrão estabelecido
		 *na linha 88 usando a notação ponto.*/
		
		int c = 5;//Declaração e inicialização da variável c.
		alterarPrimitivo(c);//Chamada do método alterarPrimitivo.
		System.out.println(c);//Impressão do valor.
		
	}	
	static void voltarDataParaValorPadrao(Data d) {
		/*\Métodos com modificador de acesso do tipo static pertencem
		 * à Classe e podem acessar outros atributos ou métodos
		 * do tipo static que pertençam à Classe, mas, não podem 
		 * acessar métodos que pretençam à intâncias (objetos).
		 * Nesse método passamos como parâmetro, entre parenteses, o
		 * objeto Data d (é uma referência real ao método
		 * e não um clone), logo a seguir dentro do escopo do método
		 * usando a notação ponto invocamos os parâmetros dia, mes
		 * e ano e atribuímos os valores 1, 1, 1970.
		 * Dessa forma modificamos o objeto (instância)criado 
		 * anteriormente e instanciado na lina 32. Isso só foi
		 * possível porque usamos uma referência ao objeto e não
		 * um clone.  */
		d.dia = 1;
		d.mes = 1;
		d.ano =1970;
	}
	
	static void alterarPrimitivo(int c) {
		/*Ao criar um método para alterar uma atribuição por valor
		 *percebemos que não funciona como funcionou 
		 *na atribuição por referência dentro do objeto, na verdade
		 *é criada uma cópia na memória em local totalmente 
		 *diferente da variável c declarada e inicializada
		 *na linha 70.*/
		
		c++;
		
	}

}
