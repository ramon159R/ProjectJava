package Crescente;

import java.util.Scanner;

public class Ncrescente {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n1 , n2 , n3;
		
		System.out.println("Escreva o primeiro numero inteiro: ");
		n1 = ler.nextInt();
		System.out.println("Escreva o segundo numero inteiro: ");
		n2 = ler.nextInt();
		System.out.println("Escreva o terceiro numero inteiro: ");
		n3 = ler.nextInt();
		if (n1>n2 && n1>n3 && n2>n3) {
			System.out.println(n1 + "," + n2 +"," + n3);
		}
		else if (n2>n1 && n2>n3) {
			System.out.println(n2 + "," + n1 + "," +n3);
		}
		else if (n3>n1 && n3>n2){
			System.out.println(n3 + "," + n1 + "," +n2);
		}
	ler.close();
	}
	
}
