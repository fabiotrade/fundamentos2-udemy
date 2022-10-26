package colecoes;

import java.util.Objects;

public class Usuario {
	/*Essa Classe servir� para criar o Objeto que dar� nome
	 * � ArrayList que ser� criada e manipulada na Classe Lista
	 * e tamb�m para gerarmos HashCodes e Equals
	 * para isso, logo ap�s o "String nome;" clicamos
	 * com o bot�o direito e procuramos source + 
	 * generate Hashodes e Equals, selecionamos as vari�veis
	 * que ser�o submetidas a esses m�todos e damos o "Enter".*/
	String nome;
	/*Cria��o do Objeto atrav�s do m�toxdo construtor padr�o.*/
	Usuario(String nome) {
		this.nome = nome;
	/*Ap�s a cria��o do Objeto especificamos que sues par�metros
	 * se referem �s vari�veis declaradas na mesma Classe.*/
	}
	@Override
	/*Abaixo instaciamos o m�todo toString para sobreescrever
	 * o m�todo "this.nome" para que ao ser invocado na outra
	 * classe seja executada a ordem do m�todo toString, este
	 * �ltimo tem preval�ncia sobre "this.nome" por isso
	 * dizemos que ele (@Override) sobre-escreve o outro.*/
	public String toString() {
			return "Meu nome � " + this.nome + ".";
	}

	@Override
	/*Esse m�todo construtor abaixo nos retorna o hashCode do
	 *objeto de nome espec�fico. */
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	/*Esse m�todo equals abaixo nos retorna true se o objeto
	 * retornado foi o objeto selecionado ou false se 
	 * n�o for o objeto solicitado ou se n�o estiver na Classe.*/
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
	

}
