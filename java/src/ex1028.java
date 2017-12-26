/* -- para calcular o MDC:
http://brasilescola.uol.com.br/matematica/calculo-mmc-mdc.htm
*/
import java.util.Scanner;
public class ex1028 {
	public static int calculoMDC (int maior, int menor){
		int resto1 = 1, resto2;
		do{
			resto1 = resto(maior, menor);
			maior = menor;
			menor = resto1;
		}while(menor != 0);
		return maior;
	}
	
	public static int resto (int maior, int menor){
		int resto = maior%menor;
		return resto;
	}

	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);
		int vezes = entrada.nextInt();
		int cartasRicardo, cartasVicente, montes=0;
		int aux, aux2;
		for (int i = 0; i < vezes; i++){
			cartasVicente = entrada.nextInt();
			cartasRicardo = entrada.nextInt();
			if (cartasVicente > cartasRicardo){
				montes = calculoMDC(cartasVicente, cartasRicardo);
			}else if (cartasVicente < cartasRicardo){
				montes = calculoMDC(cartasRicardo, cartasVicente);
			}
			System.out.printf("%d\n", montes);
		}
	}
}