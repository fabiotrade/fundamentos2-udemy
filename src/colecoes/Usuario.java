package colecoes;

import java.util.Objects;

public class Usuario {
	/*Essa Classe servirá para criar o Objeto que dará nome
	 * à ArrayList que será criada e manipulada na Classe Lista
	 * e também para gerarmos HashCodes e Equals
	 * para isso, logo após o "String nome;" clicamos
	 * com o botão direito e procuramos source + 
	 * generate Hashodes e Equals, selecionamos as variáveis
	 * que serão submetidas a esses métodos e damos o "Enter".*/
	String nome;
	/*Criação do Objeto através do métoxdo construtor padrão.*/
	Usuario(String nome) {
		this.nome = nome;
	/*Após a criação do Objeto especificamos que sues parâmetros
	 * se referem às variáveis declaradas na mesma Classe.*/
	}
	@Override
	/*Abaixo instaciamos o método toString para sobreescrever
	 * o método "this.nome" para que ao ser invocado na outra
	 * classe seja executada a ordem do método toString, este
	 * último tem prevalência sobre "this.nome" por isso
	 * dizemos que ele (@Override) sobre-escreve o outro.*/
	public String toString() {
			return "Meu nome é " + this.nome + ".";
	}

	@Override
	/*Esse método construtor abaixo nos retorna o hashCode do
	 *objeto de nome específico. */
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	/*Esse método equals abaixo nos retorna true se o objeto
	 * retornado foi o objeto selecionado ou false se 
	 * não for o objeto solicitado ou se não estiver na Classe.*/
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
