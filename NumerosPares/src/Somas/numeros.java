package Somas;

import java.util.Scanner;

public class numeros {
	public static void main(String[] args) {
		/*
		 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
           � Os n�meros pares digitados;  
           � A soma dos n�meros pares digitados; 
           � Os n�meros �mpares digitados; 
           � A quantidade de n�meros �mpares digitados.
		 */
		
		Scanner ler = new Scanner(System.in);
		int limite,par=0,impar=0,number=0,calculo=0;
		
		for (limite=0;limite<=5;limite++)
		{
			System.out.println("Digite os Numeros: ");
			number = ler.nextInt();
			if ((number%2)==0)
			{
				par++;
				calculo = calculo + number;
			}
			else 
			{
				impar++;
			}		
			
		}
		System.out.println("Voc� Digitou : "+par+" Pares");
		System.out.println("A Soma dos numeros Pares s�o: "+calculo);
		System.out.println("Voc� Digitou: "+impar+" Impares");
		
		
		ler.close();
	}
}
