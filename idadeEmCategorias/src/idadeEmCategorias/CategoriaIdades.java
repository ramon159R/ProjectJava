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
			System.out.println("Voc� ainda � Infantil..");
		}
		else if (idade>=15 && idade<=17)
		{
			System.out.println("Voc� est� na Juvenil..");
		}
		else 
		{
			System.out.println("Voc� j� � um Adulto..");
		}
		
		ler.close();
	}

}
