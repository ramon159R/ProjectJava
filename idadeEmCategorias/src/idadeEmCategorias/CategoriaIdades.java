package idadeEmCategorias;

import java.util.Scanner;

public class CategoriaIdades {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.println("Escreva a sua idade: ");
		idade = ler.nextInt();
		if (idade<=14)
		{
			System.out.println("Você ainda é Infantil..");
		}
		else if (idade>=15 && idade<=17)
		{
			System.out.println("Você está na Juvenil..");
		}
		else 
		{
			System.out.println("Você já é um Adulto..");
		}
		
		ler.close();
	}

}
