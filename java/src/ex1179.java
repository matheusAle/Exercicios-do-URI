import java.util.Scanner;
class Vetor {

	void imprimirVetor(String txt, Integer vetor[]){
		int p = 0;
		for(int x : vetor){
			System.out.printf("%s[%d] = %d\n", txt, p, vetor[x]);
			p++;
		}
	}
}

class ex1179 {
	public static void main(String[] args) {
		Vetor v = new Vetor();
		Scanner entrada = new Scanner(System.in);
		int numero, auxPar = 0, auxImpar = 0;
		Integer[] par = new Integer[5];
		Integer[] impar = new Integer[5]; 

		for (int i = 0; i < 15; i++){
			
			numero = entrada.nextInt();
			
			if ((numero%2) == 0){
				par[auxPar] = numero;
				auxPar++;
			}
			else{
				impar[auxImpar] = numero;
				auxImpar++;
			}

			if (auxPar == 5){
				v.imprimirVetor("par", par);
				auxPar = 0;
			}
			if (auxImpar == 5){
				v.imprimirVetor("impar", impar);
				auxImpar = 0;
			}
				
		}
	}
}