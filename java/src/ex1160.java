import java.util.Scanner;

class ex1160 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int anos, n = entrada.nextInt();
		int popuA, popuB;
		double taxaA, taxaB;
		for (int i = 0; i < n; i++ ) {
			popuA = entrada.nextInt();
			popuB = entrada.nextInt();
			taxaA = entrada.nextDouble();
			taxaB = entrada.nextDouble();

            for (anos = 0; popuA <= popuB && anos <= 100; anos++){
                popuA += (int)(popuA*taxaA/100);
                popuB += (int)(popuB*taxaB/100);
            }

            if (anos <= 100) {
				System.out.println(anos + " anos.");
			}
			if (anos > 100) {
				System.out.println("Mais de 1 seculo.");
			}
		}
	}
}