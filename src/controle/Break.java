package controle;

public class Break {
	
	public static void main(String[] args) {
		/*O break pode ser utilizado num for para que não seja neces-
		 * sário percorrer toda uma lista por exemplo. */
		for (int i = 0; i < 10; i++) {
			
			if(i == 5) {
				
				break;
			}
			System.out.println(i);
			
		}
		System.out.println("Fim.");	
		
		
	}
	

}
