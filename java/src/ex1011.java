
import java.util.Scanner;
public class ex1011 {
	public static void main (String []args){
		Scanner entrada = new Scanner(System.in);
		Long raio = entrada.nextLong();
		Double eq = (4.0/3) * 3.14159;
		System.out.printf("VOLUME = %.3f\n", eq * ((raio*raio)*raio));	
	}
}
