package classe;

public class Usuario {
	
	String nome;
	String email;
	
	
	public boolean equals(Object objeto) {
	/*Aqui implementamos o método equals para poder usá-lo
	 * na Classe EqualsHashCode. Essa implementação
	 * consiste em igualar o "objeto" da classe Object
	 * ao objeto Usuario instanciado pelo método construtor
	 * padrão na Classe UsuarioHashCode como vemos abaixo.*/
			Usuario outro = (Usuario) objeto ;
			/*Acima estamos fazendo algo semelhante
			 * a um Cast*/	
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;	
			
	     
  }

	
}
