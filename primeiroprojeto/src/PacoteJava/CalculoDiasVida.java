package PacoteJava;

import java.util.Scanner;

public class CalculoDiasVida {

	public static void main(String[] args) {
		int dia , mes ,ano, soma;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva o dia de vida: ");
		dia = ler.nextInt();
		System.out.println("Qual m�s voc� nasceu?: ");
		mes = ler.nextInt();
		System.out.println("Quantos Anos Voc� Tem?: ");
		ano = ler.nextInt();
		soma= ano*365 + mes*30 + dia;
		System.out.printf("Voc� Tem %d de dias",soma);

	}

}
