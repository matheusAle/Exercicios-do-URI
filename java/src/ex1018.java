import java.util.Scanner;
public class ex1018 {
	public static void main (String []args){
		Scanner entrada = new Scanner (System.in);
		int ultimoDigito = 0, granaOriginal;
		int n1=0, n2=0, n5=0, n10=0, n20=0, n50=0, n100=0;
		int grana = entrada.nextInt();
		granaOriginal = grana;
		ultimoDigito=(grana%10);
		if (ultimoDigito <= 9 && ultimoDigito >= 5){
			if (ultimoDigito == 9){
				n2 += 2;
				n5 += 1;
			}else if (ultimoDigito == 8){
				n1 += 1;
				n2 += 1;
				n5 += 1;
			}else if (ultimoDigito == 7){
				n2 += 1;
				n5 += 1;
			}else if (ultimoDigito == 6){
				n1 += 1;
				n5 += 1;
			}else if (ultimoDigito == 5){
				n5 += 1;
			}
		}else if (ultimoDigito >= 1 && ultimoDigito < 5){
			if (ultimoDigito == 4){
				n2 += 2;
			}else if (ultimoDigito == 3){
				n1 += 1;
				n2 += 1;
			}else if (ultimoDigito == 2){
				n2 += 1;
			}else if (ultimoDigito == 1){
				n1 += 1;
			}
		}
		grana = grana/10;
		ultimoDigito=(grana%10);
		if (ultimoDigito <=9 && ultimoDigito >= 5){
			if (ultimoDigito == 9){
				n20 += 2;
				n50 += 1;
			}else if (ultimoDigito == 8){
				n10 += 1;
				n20 += 1;
				n50 += 1;
			}else if (ultimoDigito == 7){
				n20 += 1;
				n50 += 1;
			}else if (ultimoDigito == 6){
				n10 += 1;
				n50 += 1;
			}else if (ultimoDigito == 5){
				n50 += 1;
			}
		}else if (ultimoDigito >= 1 && ultimoDigito < 5){
			if (ultimoDigito == 4){
				n20 += 2;
			}else if (ultimoDigito == 3){
				n10 += 1;
				n20 += 1;
			}else if (ultimoDigito == 2){
				n20 += 1;
			}else if (ultimoDigito == 1){
				n10 += 1;
			}
		}
		grana = grana/10;
		n100 = grana;
		System.out.printf("%d\n", granaOriginal);
		System.out.printf("%d nota(s) de R$ 100,00\n", n100);
		System.out.printf("%d nota(s) de R$ 50,00\n", n50);
		System.out.printf("%d nota(s) de R$ 20,00\n", n20);
		System.out.printf("%d nota(s) de R$ 10,00\n", n10);
		System.out.printf("%d nota(s) de R$ 5,00\n", n5);
		System.out.printf("%d nota(s) de R$ 2,00\n", n2);
		System.out.printf("%d nota(s) de R$ 1,00\n", n1);
	}
}