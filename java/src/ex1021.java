import java.util.Scanner;
public class ex1021 {
	public static void main (String []args){
		Scanner entrada = new Scanner (System.in);
		int m1s=0, m5s=0, m10s=0, m25s=0, m50s=0, m1=0, n2=0, n5=0, n10=0, n20=0, n50=0, n100=0;
		// leitura o valor monetario.
		double valor = entrada.nextDouble();
		double moeda = (valor - (int)valor) * 100; 
		valor -= moeda / 100;
		int moedas = (int) moeda;
		while (valor != 0.0) {
			//System.out.printf("val %f - ", valor);
			if (valor >= 100.0) {
				n100++;
				valor -= 100.0;	
			} else if (valor >= 50.0) {
				n50++;
				valor -= 50.0;
			} else if (valor >= 20.0) {
				n20++;
				valor -= 20;
			} else if (valor >= 10.0) {
				n10++;
				valor -= 10;
			} else if (valor >= 5.0) {
				n5++;
				valor -= 5;
			} else if (valor >= 2.0) {
				n2++;
				valor -= 2;
			} else if (valor >= 1.0) {
				m1++;
				valor -= 1;
			} 
		}
		System.out.printf("NOTAS:\n");
		System.out.printf("%d nota(s) de R$ 100.00\n", n100);
		System.out.printf("%d nota(s) de R$ 50.00\n", n50);
		System.out.printf("%d nota(s) de R$ 20.00\n", n20);
		System.out.printf("%d nota(s) de R$ 10.00\n", n10);
		System.out.printf("%d nota(s) de R$ 5.00\n", n5);
		System.out.printf("%d nota(s) de R$ 2.00\n", n2);
		
		while (moedas != 0 ){
			//System.out.printf("%d - ", moedas);
			if (moedas >= 50) {
				m50s++;
				moedas -= 50;
			} else if (moedas >= 25) {
				m25s++;
				moedas -= 25;
			} else if (moedas >= 10) {
				m10s++;
				moedas -= 10;
			} else if (moedas >= 05) {
				m5s++;
				moedas -= 5;
			} else if (moedas >= 1) {
				m1s++;
				moedas -= 1;
			}
		}

		System.out.printf("MOEDAS:\n");
		System.out.printf("%d moeda(s) de R$ 1.00\n", m1);
		System.out.printf("%d moeda(s) de R$ 0.50\n", m50s);
		System.out.printf("%d moeda(s) de R$ 0.25\n", m25s);
		System.out.printf("%d moeda(s) de R$ 0.10\n", m10s);
		System.out.printf("%d moeda(s) de R$ 0.05\n", m5s);
		System.out.printf("%d moeda(s) de R$ 0.01\n", m1s);
	}
}