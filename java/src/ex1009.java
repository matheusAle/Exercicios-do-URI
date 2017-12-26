import java.util.Scanner;
public class ex1009 {
	public static void main (String []args){
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		Double salFixo = entrada.nextDouble();
		Double vendaMes = entrada.nextDouble();
		System.out.printf("TOTAL = R$ %.2f\n",(((vendaMes*15)/100) +salFixo));
	}
}