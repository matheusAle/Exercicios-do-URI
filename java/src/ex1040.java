import java.util.Scanner;
public class ex1040 {

	static float nN1, nN2, nN3, nN4, nE;
	static float media;
	static boolean aprovado;
	static boolean exame;

	static void calculaMedia (){
		media = (nN1*2 + nN2*3 + nN3*4 + nN4*1) / (2+3+4+1); 
	}

	static void apRpEx (){
		if (media >= 7.0){
			aprovado = true;
			exame = false;
		}else if (media >= 5.0 && media <= 6.9){
			aprovado = false;
			exame = true;
		}else if (media < 5.0){
			aprovado = false;
			exame = false;
		}
	}

	static void passoExame (){
		media = (media+nE)/2;
		if (media >= 5.0){
			exame = false;
			aprovado = true;
		}else{
			exame = false;
			aprovado = false;
		}
	}

	public static void main (String args []){

		Scanner entrada = new Scanner (System.in);

		nN1 = entrada.nextFloat();
		nN2 = entrada.nextFloat();
		nN3 = entrada.nextFloat();
		nN4 = entrada.nextFloat();
		
		calculaMedia();
		apRpEx();

		if (aprovado && exame == false){

			System.out.printf("Media: %.1f\n", media);
			System.out.printf("Aluno aprovado.\n");

		}else if (exame && aprovado == false){

			System.out.printf("Media: %.1f\n", media);
			System.out.printf("Aluno em exame.\n");
			nE = entrada.nextFloat();

			passoExame();
			
			if (aprovado){
			
				System.out.printf("Nota do exame: %.1f\n", nE);
				System.out.printf("Aluno aprovado.\n");
				System.out.printf("Media final: %.1f\n", media);

			}else{

				System.out.printf("Aluno reprovado.\n");
				System.out.printf("Media final: %.1f\n", media);
			
			}
		}else if (aprovado == false && exame == false){
				
				System.out.printf("Media: %.1f\n", media);
				System.out.printf("Aluno reprovado.\n");
				
		}

	}

}