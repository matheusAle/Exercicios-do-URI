import java.util.Scanner;
class ex1066 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);		
		int numpar = 0, numImpar = 0, numPos = 0, numNeg = 0;
		int n;
		for (int i = 0; i < 5 ; i++ ) {
			n = entrada.nextInt();
			if (n%2 == 0) { 
				numpar++; 
			}
			if (n%2 != 0) { 
				numImpar++; 
			}
			if (n > 0) { 
				numPos++; 
			}
			if (n < 0) { 
				numNeg++; 
			}
		}
		System.out.printf("%d valor(es) par(es)\n", numpar);
		System.out.printf("%d valor(es) impar(es)\n", numImpar);
		System.out.printf("%d valor(es) positivo(s)\n", numPos);
		System.out.printf("%d valor(es) negativo(s)\n", numNeg);
	}
}