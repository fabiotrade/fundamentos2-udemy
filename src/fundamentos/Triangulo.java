package fundamentos;

import java.util.Scanner;

public class Triangulo {
	
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Digite o número de fileiras: ");		
		int fileiras = scan.nextInt();		
		for (int i = 1; i <= fileiras; i ++) {			
			for(int j = i; j < fileiras; j ++) {				
				System.out.print(" ");			}			
			for ( int k = 1; k <= (2*i - 1); k ++) {				
				if (k == 1|| i == fileiras || k == (2*i - 1)) {					
					System.out.print("O");					
				}
				else {
					System.out.print(":");
				}			
			
			}
			
			System.out.println("");
			
					
						
		}
		scan.close();
		
		
		
	}

}
