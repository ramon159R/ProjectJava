package Soma;

public class resto {
	public static void main(String[] args) {
		/*
		 * Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5
		 */
		
		int total,contador=1000;
		
		for (total=1000; total<=2000; total++) {
			if ((total%11)==5){
				System.out.printf("\nContador {-%d-}",total);
			}
			
		}
		
	}

}