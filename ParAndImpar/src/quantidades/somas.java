package quantidades;

public class somas {

	public static void main(String[] args) {
		/*
		 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 */
		int total,par=0,impar;
		for (impar=0;impar<10;impar++) {
			if (impar%2==1) {
				impar++;
			}
			else {
				par++;
			}
				
				par = impar;
				System.out.printf("%d numeros impares.\n",impar);					
				System.out.printf("%d numeros pares. | ", par);
		}
		
	}

}
