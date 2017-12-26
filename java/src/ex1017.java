import java.util.Scanner;
public class ex1017 {
	public static void main (String []args){
		Scanner entrada = new Scanner(System.in);
		int tempo = entrada.nextInt();
		int distancia = entrada.nextInt();
		System.out.printf("%.3f\n", (float)(distancia*tempo)/12);
	}
}
