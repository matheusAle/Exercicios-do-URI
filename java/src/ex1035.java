import java.util.Scanner;
public class ex1035 {
	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		int d = entrada.nextInt();
		if (b > c && d > a && (c+d) > (a+b) && c > 0 && d > 0 && (a%2) == 0){
			System.out.printf("Valores aceitos\n");
		} else {
			System.out.printf("Valores nao aceitos\n");
		}
	}
}