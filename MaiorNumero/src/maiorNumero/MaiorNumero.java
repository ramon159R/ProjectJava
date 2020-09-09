package maiorNumero;

import java.util.Scanner;

public class MaiorNumero {
	
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int n1 , n2 , n3;
		
		System.out.println("Escreva o primeiro numero inteiro: ");
		n1 = ler.nextInt();
		System.out.println("Escreva o segundo numero inteiro: ");
		n2 = ler.nextInt();
		System.out.println("Escreva o terceiro numero inteiro: ");
		n3 = ler.nextInt();
		if (n1>n2 && n1>n3) {
			System.out.println("Maior Numero é: "+n1);
		}
		else if (n2>n1 && n2>n3) {
			System.out.println("Maior Numero é: "+n2);
		}
		else {
			System.out.println("Maior Numero é: "+n3);
		}
		ler.close();		
	}

}
