package classe;

public class Data {
	/*Usando essa Classe para falar do uso do "this". Ele pode ser 
	 * usado de duas formas, a primeira forma � acessando uma
	 * vari�vel que pertence a uma inst�ncia.*/
	
	int dia;
	int mes;
	int ano;
	/*Os tr�s atributos acima s�o considerados atributos de 
	 *inst�ncia porque n�o possuem o tipificado static */
	
	Data() {
		/*M�todo construtor Data usado aqui para instanciar o objeto
		 *Data*/
		dia = 1;
		mes = 1;
		ano = 1970;
		/*Acima os 3 atributos do objeto Data.
		 * Outra forma de usar o "this" seria a partir de 
		 * dentro de um construtor chamando outro construtor*/
	
	}
	Data(int dia, int mes, int ano){
		/*Os par�metros acima s� s�o vis�veis durante a constru��o
		 * do objeto na classe teste, justamente por isso, foram 
		 * alocados como vari�veis de inst�ncia na parte superior
		 * do c�digo, para que tenham um escopo global e possam ser 
		 * vistas por outros m�todos do c�digo.*/
		
		this.dia = dia;
		/*Usando o "this" estamos acessando e nos
		 * referenciando ao atributo de inst�ncia (do objeto Data)
		 * ou seja o "this" aponta para o objeto atual que 
		 * est� executando esse c�digo.*/
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato,dia, mes, ano);
		/*A vari�vel String � local. portanto s� pode ser usada
		 * aqui, se quisermos us�-la em outros m�todos do
		 * programa teremos que aloc�-la acima do m�todo
		 * "obterDataFormatada". O mais correto � alocar as 
		 * vari�veis e constantes globais no in�cio do c�digo.
		 * Se quisermos tranformar uma vari�vel em uma constante
		 * devemos adicionar a o modificador "final" na frente
		 * da vari�vel.*/
		
	}
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}

}
