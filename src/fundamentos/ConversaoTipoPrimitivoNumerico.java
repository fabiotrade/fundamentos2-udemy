package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a =1;/*conversão implícita, pois,
		1 é inteiro e foi automaticamante convertido
		em float*/
		System.out.println(a);
		
		float b = (float)1.23456789999999;
		/* CAST é a converão como essa
		,é mais trabalhosa, porém, é explícita. Quando
		fazemos o CAST, estamos demonstrando à linguagem 
		JAVA que estamos cientes do risco de perda de 
		dados, exatamente como no caso do Float acima.*/
		System.out.println(b);
		
		/*int c = 4;
		byte d = c;*/
		/* esse tipo de conversão não funcionaria pois o JAVA
		 * "pensa" que não temos consciência de que estamos 
		 * trocando um tipo por outro tipo, porém, se 
		 * fizermos um CAST, o JAVA percebe que é uma mudança
		 * consciente e permite a execução como vemos abaixo: */
		
		/*int c = 1;
		byte d = (byte) c;
		System.out.println(d);*/
		
		/*Existe um limite para o CAST determinado pelo próprio
		 * RANGE do tipo numérico. Se fizermos um CAST de valor
		 * maior do que o suportado pelo RANGE ocorrerá
		 * uma inconsistência, por exemplo, o RANGE do byte
		 * fica entre -126 e 127, se fizermos um CAST de 130
		 * teremos o valor impresso -128, porque o RANGE foi
		 * ultrapassado e após o valor 127, foi iniciada a 
		 * contagem novamente a partir de -126 e como eram
		 * 3 unidades a mais cheamos até 128*/
		
		int c = 130;
		byte d = (byte) c;
		System.out.println(d);//explícita CAST
		
		
	}

}
