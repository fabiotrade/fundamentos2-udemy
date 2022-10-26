package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a =1;/*convers�o impl�cita, pois,
		1 � inteiro e foi automaticamante convertido
		em float*/
		System.out.println(a);
		
		float b = (float)1.23456789999999;
		/* CAST � a conver�o como essa
		,� mais trabalhosa, por�m, � expl�cita. Quando
		fazemos o CAST, estamos demonstrando � linguagem 
		JAVA que estamos cientes do risco de perda de 
		dados, exatamente como no caso do Float acima.*/
		System.out.println(b);
		
		/*int c = 4;
		byte d = c;*/
		/* esse tipo de convers�o n�o funcionaria pois o JAVA
		 * "pensa" que n�o temos consci�ncia de que estamos 
		 * trocando um tipo por outro tipo, por�m, se 
		 * fizermos um CAST, o JAVA percebe que � uma mudan�a
		 * consciente e permite a execu��o como vemos abaixo: */
		
		/*int c = 1;
		byte d = (byte) c;
		System.out.println(d);*/
		
		/*Existe um limite para o CAST determinado pelo pr�prio
		 * RANGE do tipo num�rico. Se fizermos um CAST de valor
		 * maior do que o suportado pelo RANGE ocorrer�
		 * uma inconsist�ncia, por exemplo, o RANGE do byte
		 * fica entre -126 e 127, se fizermos um CAST de 130
		 * teremos o valor impresso -128, porque o RANGE foi
		 * ultrapassado e ap�s o valor 127, foi iniciada a 
		 * contagem novamente a partir de -126 e como eram
		 * 3 unidades a mais cheamos at� 128*/
		
		int c = 130;
		byte d = (byte) c;
		System.out.println(d);//expl�cita CAST
		
		
	}

}
