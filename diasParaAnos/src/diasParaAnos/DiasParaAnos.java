package diasParaAnos;

import java.util.Scanner;

public class DiasParaAnos {

	public static void main(String[] args) {
		int dia, mes , ano , soma;
		Scanner ler = new Scanner(System.in);
		System.out.println("Quantos dias você já viveu?: ");
		dia = ler.nextInt();
		
		ano = dia / 365;
		mes = dia % 365 / 30;
		dia = dia % 365 % 30;
		System.out.printf("Sua data é %d anos e %d meses  e %d dias",ano,mes,dia);
		

	}

}
