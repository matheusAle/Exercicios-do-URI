import java.util.Scanner;
public class ex1008 {
	public static void main (String []args){
		Scanner entrada = new Scanner(System.in);
		int numFuncionario = entrada.nextInt();
		int numHorasT = entrada.nextInt();
		float numPagHora = entrada.nextFloat();
		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARY = U$ %.2f\n",(numPagHora*numHorasT));
	}
}