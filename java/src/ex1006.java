import java.util.Scanner;
public class ex1006 {
	public static void main (String []args){
		Scanner entrada = new Scanner(System.in);
		Double A = entrada.nextDouble();
		Double B = entrada.nextDouble();
		Double C = entrada.nextDouble();
		Double MEDIA = ((2*A)+(3*B)+(5*C))/10;
		System.out.printf("MEDIA = %.1f\n", MEDIA);
	}
}