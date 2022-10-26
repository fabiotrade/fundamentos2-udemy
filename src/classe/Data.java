package classe;

public class Data {
	/*Usando essa Classe para falar do uso do "this". Ele pode ser 
	 * usado de duas formas, a primeira forma é acessando uma
	 * variável que pertence a uma instância.*/
	
	int dia;
	int mes;
	int ano;
	/*Os três atributos acima são considerados atributos de 
	 *instância porque não possuem o tipificado static */
	
	Data() {
		/*Método construtor Data usado aqui para instanciar o objeto
		 *Data*/
		dia = 1;
		mes = 1;
		ano = 1970;
		/*Acima os 3 atributos do objeto Data.
		 * Outra forma de usar o "this" seria a partir de 
		 * dentro de um construtor chamando outro construtor*/
	
	}
	Data(int dia, int mes, int ano){
		/*Os parâmetros acima só são visíveis durante a construção
		 * do objeto na classe teste, justamente por isso, foram 
		 * alocados como variáveis de instância na parte superior
		 * do código, para que tenham um escopo global e possam ser 
		 * vistas por outros métodos do código.*/
		
		this.dia = dia;
		/*Usando o "this" estamos acessando e nos
		 * referenciando ao atributo de instância (do objeto Data)
		 * ou seja o "this" aponta para o objeto atual que 
		 * está executando esse código.*/
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato,dia, mes, ano);
		/*A variável String é local. portanto só pode ser usada
		 * aqui, se quisermos usá-la em outros métodos do
		 * programa teremos que alocá-la acima do método
		 * "obterDataFormatada". O mais correto é alocar as 
		 * variáveis e constantes globais no início do código.
		 * Se quisermos tranformar uma variável em uma constante
		 * devemos adicionar a o modificador "final" na frente
		 * da variável.*/
		
	}
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}

}
