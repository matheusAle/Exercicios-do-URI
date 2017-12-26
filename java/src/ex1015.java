import java.lang.Math;
import java.util.Scanner;
public class ex1015 {
	public static void main (String []args){
		Scanner entrada = new Scanner(System.in);
		float x1 = entrada.nextFloat();
		float y1 = entrada.nextFloat();
		float x2 = entrada.nextFloat();
		float y2 = entrada.nextFloat();
		Double distancia = Math.sqrt( ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)) );
		System.out.printf("%.4f\n", distancia);

	}
}
