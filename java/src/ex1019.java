import java.util.Scanner;
public class ex1019 {
	public static void main (String []args){
		Scanner entrada = new Scanner (System.in);
		int cont = 0, emSegundos = entrada.nextInt();
		int horas = 0, minutos = 0, segundos = 0;
		while(cont < emSegundos){
			segundos = segundos+1;
			cont++;
			if(segundos == 60){
				minutos++;
				segundos = 0;
			}
			if(minutos == 60){
				horas++;
				minutos = 0;
			}
		}	
		System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
	}
}			
