import java.util.Scanner;

public class numerosCrescente {
	
	public static void main(String[]args) {
		/*
		 * Faça um programa que entre com três números e coloque em ordem crescente.
		 */
		Scanner ler = new Scanner(System.in);
		int n1 , n2 , n3,total;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = ler.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = ler.nextInt();
		System.out.println("Digite o terceiro numero: ");
		n3 = ler.nextInt();
		
		if (n1>n2 && n1>n3) {
			total = n1;
			n1 = n2;
			n2 = n3;
			n3 = total;
		}
		else if (n2>n1 && n2>n3) {
			total = n2;
			n2 = n3;
			n3 = n1;
			n1 = total;
		}
		else {
			System.out.println("Valor Crescente: "+n1"+n2+"+3);
		}
			
	}
}
