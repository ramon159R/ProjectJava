package somas;

import java.util.Scanner;

public class ContadordePessoas {

	public static void main(String[] args) {
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
		 *  Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		 */
		Scanner ler = new Scanner(System.in);
		int idade,contador21=0,contador50=0;
		
		System.out.println("Escreva as Idades: ");
		idade = ler.nextInt();
		do
		{
			if (idade<=21)
			{
				contador21++;
			}
			else
			{
				contador50++;
			}
			System.out.println("Escreva a idade: ");
			idade = ler.nextInt();
		}while(idade<99);
		
		System.out.printf("\n Quantidade de pessoas com Menor de 21 anos: %d",contador21);
		System.out.printf("\n Quantidade de pessoas com mair de 50 anos: %d",contador50);
		ler.close();
	}
		
 
}
