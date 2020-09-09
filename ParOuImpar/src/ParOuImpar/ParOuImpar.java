package ParOuImpar;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Escreva o Numero desejado: ");
		numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			System.out.printf("O número %d é Par e sua raiz quadrada é: %.1f", numero, Math.sqrt(numero));
		} else {
			System.out.printf("O número %d é Impar e elevado ao quadrada é: %.1f", numero, Math.pow(numero, 2));
		} 
		
		ler.close();
		
	}

}
