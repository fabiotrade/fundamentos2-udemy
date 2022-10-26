package classe;

public class Usuario {
	
	String nome;
	String email;
	
	
	public boolean equals(Object objeto) {
	/*Aqui implementamos o m�todo equals para poder us�-lo
	 * na Classe EqualsHashCode. Essa implementa��o
	 * consiste em igualar o "objeto" da classe Object
	 * ao objeto Usuario instanciado pelo m�todo construtor
	 * padr�o na Classe UsuarioHashCode como vemos abaixo.*/
			Usuario outro = (Usuario) objeto ;
			/*Acima estamos fazendo algo semelhante
			 * a um Cast*/	
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;	
			
	     
  }

	
}
