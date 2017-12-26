
public class ex1037 {
	public static void main(String [] args){

		double n = new java.util.Scanner(System.in).nextDouble();

		if (n >= 0.0&& n  <= 25.0){
			System.out.printf("Intervalo [0,25]\n");
		}
		else if (n > 25.0 && n  <= 50.0){
			System.out.printf("Intervalo (25,50]\n");
		}
		else if (n > 50.0 && n <= 75.0){
			System.out.printf("Intervalo (50,75]\n");
		}
		else if (n > 75.0 && n <= 100.0){
			System.out.printf("Intervalo (75,100]\n");
		}
		else {
			System.out.printf("Fora de intervalo\n");
		}
	}
} 