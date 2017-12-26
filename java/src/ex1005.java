import java.util.Scanner;
public class ex1005 {
	public static void main (String []args){
		Scanner entrada = new Scanner(System.in);
		Double A = entrada.nextDouble();
		Double B = entrada.nextDouble();
		Double MEDIA = ((3.5*A)+(7.5*B))/11;
		System.out.printf("MEDIA = %.5f\n", MEDIA);
	}
}