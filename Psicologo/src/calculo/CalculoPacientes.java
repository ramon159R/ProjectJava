package calculo;

import java.util.Scanner;

public class CalculoPacientes {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		int idade,sexo,comportamento,mulheresNervosas=0,homensAgressivos=0,pessoasNervosas=0,pessoasCalmas18=0;
		final int limite=3,vez=0;
		
		System.out.println("Idade da Pessoa: ");
		idade = ler.nextInt();
		System.out.println("Se for Masculino Digite 1 | Femenino Digite 2 ");
		sexo = ler.nextInt();
		System.out.println("Você é uma pessoa, 1 Calmo(a) | 2 Nervoso(a) | 3 Agressivo(a)");
		comportamento = ler.nextInt();
		
		
	do
		{
			if (sexo ==2 && comportamento ==2)
			{
				mulheresNervosas++;
			} 
			if  (sexo ==1 && comportamento ==3)
			{
				homensAgressivos++;
			}
			if (idade>40 && comportamento ==2)
			{
				pessoasNervosas++;
			}
			if (idade<18 && comportamento ==1)
			{
				pessoasCalmas18++;
			}
			
			System.out.println("Idade da Pessoa: ");
			idade = ler.nextInt();
			System.out.println("Se for Masculino Digite 1 | Femenino Digite 2 ");
			sexo = ler.nextInt();
			System.out.println("Você é uma pessoa, 1 Calmo(a) | 2 Nervoso(a) | 3 Agressivo(a)");
			comportamento = ler.nextInt();
			
			System.out.printf("\nMulheres nervosas: %d", mulheresNervosas);
			System.out.printf("\nNumeros de homens agressivos: %d",  homensAgressivos);
			System.out.printf("\nNumero de pessoas nervorsas com mais de 40 anos: %d", pessoasNervosas);
			System.out.printf("\nNumero de pessoas calmas menores de 18 anos: %d", pessoasCalmas18);
			}
		}while(vez<=limite);
		
			
		
	
