import java.util.Scanner;

class Fibonacci2{
	
	// imprimir a sequencia de fibonacci
	void printSequencia(long n){
		long cont=0, aux1 = 1, aux2 = 0, aux3;
		System.out.print("0");	
		do{
			aux3 = aux2;
			aux2 = aux1 + aux2;
			System.out.printf(" %d", aux2); 
			aux1 = aux3 ; 

			cont ++;	
		}while(cont < n - 1);				
		System.out.printf("\n");
		
	}

	//retorna o N-ésimo termo da série de Fibonacci
	    static long nEsimo(long n) {
        long F = 0;     // atual
        long ant = 0;   // anterior
        for (long i = 1; i <= n; i++) {
            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F += ant;
                ant = F - ant;
            }
        }
 
        return F;
    }
	
}


public class ex1176 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Fibonacci2 fib = new Fibonacci2 ();
		
		int quant = entrada.nextInt();
		long vetor [] = new long[quant];
		
		for(int d = 0; d < quant; d ++){
			vetor[d] = entrada.nextLong();
		}
		for(int i = 0; i < quant; i ++){
			System.out.printf("Fib(%d) = %d\n", vetor[i], fib.nEsimo(vetor[i]));			
		}
		
	}
}