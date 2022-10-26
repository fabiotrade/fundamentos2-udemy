package arrays;

public class Foreach {
	
	public static void main(String[] args) {
		
		double [] notas = {9.9, 8.7, 7.2, 9.4};
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i] + " ");
		}
		System.out.println();
		
		/*No laço abaixo, o parâmetro notas vai apontar para 
		 * cada um dos elementos do array.Dessa forma, não 
		 * precisamos mais acessar o elemento a partir do índice,
		 * dessa forma esse laço substitui o anterior.*/
		for(double nota: notas) {
			System.out.println(nota);
		}
		
		
	}
	

}
