package Somas;

import java.util.Scanner;

public class numeros {
	public static void main(String[] args) {
		/*
		 * 2- Faça um programa que receba 6 números inteiros e mostre: 
           • Os números pares digitados;  
           • A soma dos números pares digitados; 
           • Os números ímpares digitados; 
           • A quantidade de números ímpares digitados.
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
		System.out.println("Você Digitou : "+par+" Pares");
		System.out.println("A Soma dos numeros Pares são: "+calculo);
		System.out.println("Você Digitou: "+impar+" Impares");
		
		
		ler.close();
	}
}
