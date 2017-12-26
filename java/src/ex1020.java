import java.util.Scanner;
public class ex1020 {
	public static void main (String []args){
		Scanner entrada = new Scanner (System.in);
		int cont = 0, emDias = entrada.nextInt();
		int anos = 0, meses = 0, dias = 0, aux = 0;
		while(cont < emDias){
			dias++;;
			cont++;
			if( dias == 30){
				meses++;
				dias = 0;
			}
			if(meses == 12){
				anos++;
				meses = 0;
			}
			
			//System.out.printf("%d ano(s) | %d mes(es) | %d dia(s) | cont = %d\n", anos, meses, dias, cont);
		}
		dias = dias-5;	
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, dias);
	}
}			
