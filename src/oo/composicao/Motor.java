package oo.composicao;

public class Motor {
	
	boolean ligado = false;
	double fatorInjecao = 1;
	
	int giros() {
		if(!ligado) {
			return 0;
		}else {
		return (int)Math.round(fatorInjecao * 3000);
		}/*Logo acima tivemos que usar o método
		Math.round que arredonda valores porque
		no método "giros()" usamos o tipo de 
		retorno "int" = inteiro.*/
	}

}
	
