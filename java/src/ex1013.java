import java.lang.Math;
import java.util.Scanner;
public class ex1013{
	public static void main (String []args){
		Scanner entrada = new Scanner(System.in);
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		int C = entrada.nextInt();
 		int maior = (A+B+Math.abs(A-B))/2;
 		int maiorABS = (maior+C+Math.abs(maior-C))/2;
		System.out.printf("%d eh o maior\n", maiorABS);
	}
}