
import java.util.Scanner;
public class ex1010 {
	public static void main (String []args){
		Scanner entrada = new Scanner(System.in);
		int codigo, quantidade;
		int codigo1, quantidade1;
		float valorU, valorU1;
		
		String dadosEntrada = entrada.nextLine();
		String[] dados = dadosEntrada.split(" ");
		codigo = Integer.parseInt(dados[0]);
		quantidade = Integer.parseInt(dados[1]);
		valorU = Float.parseFloat(dados[2]);
		
		String dadosEntrada1 = entrada.nextLine();
		String[] dados1 = dadosEntrada1.split(" ");
		codigo1 = Integer.parseInt(dados1[0]);
		quantidade1 = Integer.parseInt(dados1[1]);
		valorU1 = Float.parseFloat(dados1[2]);

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", (float) (valorU*quantidade)+(valorU1*quantidade1));	
	}
}
