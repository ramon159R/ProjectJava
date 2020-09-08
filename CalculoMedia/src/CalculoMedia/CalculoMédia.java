package CalculoMedia;

import java.util.Scanner;

public class CalculoMédia {

	public static void main(String[] args) {
		float n1 , n2 , n3 , total;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva a primeira nota: ");
		n1 = ler.nextFloat();
		System.out.println("Escreva a segunda nota: ");
		n2 = ler.nextFloat();
		System.out.println("Escreva a terceira nota: ");
		n3 = ler.nextFloat();
		
		total = (n1*2 + n2*3 + n3*5) /10;
		
		System.out.println("A media do aluno é :"+total);

	}

}
