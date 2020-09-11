package calculo;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		/*
		 * Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		 */
		Scanner ler = new Scanner(System.in);
		
		float[][] matri=new float[3][3];
		int contador=0,linha=0,coluna=0;
		
		for (linha=0;linha<=4;linha++)
		{
			for (coluna=0;coluna<=4;coluna++)
			{
				System.out.println("Entre com os Valores: ");
				matri[linha][coluna] = ler.nextFloat();
			}
		}
		for (linha=0;linha<=3;linha++)
		{
			for (coluna=0;coluna<=3;coluna++)
			{
				if (matri[linha][coluna] >10)
				{
					contador++;
					System.out.printf("Numeros Maior que 10 são: %d",matri[linha][coluna]);
				}
			}
		}
		
	}

}
