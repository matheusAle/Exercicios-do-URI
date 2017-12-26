import java.lang.Math;
import java.util.Scanner;

public class ex1036 {
	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);
		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		double c = entrada.nextDouble();
		double delta, x1 = 0.0, x2 = 0.0;

		delta = (b*b)-4*(a)*(c);
		x1 = (-b+Math.sqrt(delta))/(2*a);
		x2 = (-b-Math.sqrt(delta))/(2*a);

		if (delta < 0.0 || (2*a) == 0.0){
			System.out.printf("Impossivel calcular\n");
		}else {
			System.out.printf("R1 = %.5f\nR2 = %.5f\n", x1, x2);
		}
		
	}
}