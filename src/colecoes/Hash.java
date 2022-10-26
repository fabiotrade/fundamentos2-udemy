package colecoes;

import java.util.HashSet;

public class Hash {
	/*Uma pesquisa � muito mais r�pida num HashSet do que numa
	 * List porque percorrer atrav�s de HashCodes �
	 * mais r�pido do que percorrer atrav�s de equals.
	 * Nesse caso o HashCode foi implementado na 
	 * Classe Usuario dessse mesmo package.*/
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));
		
		boolean resultado = usuarios.contains(new Usuario("Guilherme"));
		System.out.println(resultado);
		
	}
}