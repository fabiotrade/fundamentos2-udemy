package classe;

public class ValorVsReferencia {
	/*Ojetivo dessa Classe: mostrar o uso de atribui��o por valor,
	 *a atribui��o por refer�ncia, o uso de um objeto como 
	 *par�metro de um m�todo est�tico e as implica��es dessa
	 *pr�tica na modifica��o de refer�ncias em mem�ria. Usaremos
	 *refer�ncias de outras Classes j� criadas anteriormente
	 *nesse mesmo pacote "classe",por exemplo o objeto Data
	 * da Classe Data.*/
	
	public static void main(String[] args) {
	/*Fun��o main com modificadores de acesso p�blico, est�tico 
	 * e retorno vazio (void), cujos par�metros referenciados
	 * pela classe String s�o o package "classe" e a Classe
	 * "ValorVsReferencia".*/
		double a = 2;
		/*Declara��o e inicializa��o da vari�vel a, atribui��o
		 *por valor.(Tipo primitivo).*/
		double b = a;
		/*Declara��o e inicializa��o da vari�vel b.*/
		
		a ++;//Somando 1 ao valor 2 inicializado em a.
		b --;/*Subtraindo 1 do valor 2 inicializado em a
		e igualado em b. */
		
		System.out.println(a + " " + b);
		/*Impress�o dos valores ap�s a soma e subtra��o usando a 
		 *classe System,  a corrente  de exterioriza��o
		 *(out put stream) out e o m�todo println.*/
		
		Data d1 = new Data(1, 6, 2022);//Cria��o do Objeto Data d1.
		Data d2 = d1; //atribui��o por refer�ncia d2 = Objeto d1.
		/*As duas vari�veis apontam para o mesmo objeto em mem�ria
		 * Acima temos a cria��o do objeto data com as posi��es
		 * iniciais preenchidas por conveni�ncia com 1, 6, 2022.
		 * Esse objeto data pode ser passado como par�metro para
		 * um ou mais m�todos, caso seja feita alguma modifica��o
		 *nos dados do objeto dentro do m�todo que o est� utilizando
		 *quem criou o objeto vai perceber. Tanto d1 quanto d2
		 *apontam para o mesmo endere�o em mem�ria.*/
		
		d1.dia = 31;
		/*Aqui o objeto Data d1 atrav�s da nota��o 
		ponto "chama" a vari�vel do tipo inteiro dia, presente 
		na Classe Data e a inicializa com o valor 31.*/
		d2.mes = 12;
		/*Aqui o objeto Data d2 atrav�s da nota��o 
		ponto "chama" a vari�vel do tipo inteiro mes,  presente 
		na Classe Data e a inicializa com o valor 12.*/
		
		d1.ano = 2025;
		/*Aqui o objeto Data d1 atrav�s da nota��o 
		ponto "chama" a vari�vel do tipo inteiro ano,  presente 
		na Classe Data e a inicializa com o valor 2025.*/
		
		System.out.println(d1.obterDataFormatada());
		/*Usando a nota��o ponto, o objeto d1 "chama" o m�todo
		 * obter data formatada para impress�o.*/
		System.out.println(d2.obterDataFormatada());
		/*Usando a nota��o ponto, o objeto d2 "chama" o m�todo
		 * obter data formatada para impress�o.*/
		
		voltarDataParaValorPadrao(d1);
		/*Esse m�todo, seguindo as instru��es passadas na 
		 * linha 88, por um m�todo que usa como par�metro 
		 * o objeto Data, modifica  as refer�ncias armazenadas em
		 * mem�ria que inicialmente seguiam a declara��o e
		 * inicializa��o do objeto Data na linha 32.
		 * Isso n�o � uma boa pr�tica, � apenas para demonstrar
		 * a modifica��o de refer�ncias em mem�ria atrav�s
		 * da utiliza��o de um objeto como par�metro de um
		 * m�todo. */
		
		System.out.println(d1.obterDataFormatada());
		/*Impress�o da Data d1 atrav�s da chamada do novo padr�o
		 * estabelecido na linha 88 usando a nota��o ponto.*/
		System.out.println(d2.obterDataFormatada());
		/*Impress�o da Data d2 que � igual a d1 (linha 33)
		 *atrav�s da chamada do novo padr�o estabelecido
		 *na linha 88 usando a nota��o ponto.*/
		
		int c = 5;//Declara��o e inicializa��o da vari�vel c.
		alterarPrimitivo(c);//Chamada do m�todo alterarPrimitivo.
		System.out.println(c);//Impress�o do valor.
		
	}	
	static void voltarDataParaValorPadrao(Data d) {
		/*\M�todos com modificador de acesso do tipo static pertencem
		 * � Classe e podem acessar outros atributos ou m�todos
		 * do tipo static que perten�am � Classe, mas, n�o podem 
		 * acessar m�todos que preten�am � int�ncias (objetos).
		 * Nesse m�todo passamos como par�metro, entre parenteses, o
		 * objeto Data d (� uma refer�ncia real ao m�todo
		 * e n�o um clone), logo a seguir dentro do escopo do m�todo
		 * usando a nota��o ponto invocamos os par�metros dia, mes
		 * e ano e atribu�mos os valores 1, 1, 1970.
		 * Dessa forma modificamos o objeto (inst�ncia)criado 
		 * anteriormente e instanciado na lina 32. Isso s� foi
		 * poss�vel porque usamos uma refer�ncia ao objeto e n�o
		 * um clone.  */
		d.dia = 1;
		d.mes = 1;
		d.ano =1970;
	}
	
	static void alterarPrimitivo(int c) {
		/*Ao criar um m�todo para alterar uma atribui��o por valor
		 *percebemos que n�o funciona como funcionou 
		 *na atribui��o por refer�ncia dentro do objeto, na verdade
		 *� criada uma c�pia na mem�ria em local totalmente 
		 *diferente da vari�vel c declarada e inicializada
		 *na linha 70.*/
		
		c++;
		
	}

}
