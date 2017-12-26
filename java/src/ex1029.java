import java.util.HashMap;
import java.util.Scanner;

public class ex1029 {

    // paia o resultado para todos os n;
    static HashMap<Integer, Long> mapaResultado = new HashMap<>();

    // mapeia as chamadas para todos os n
    static HashMap<Integer, Long> mapaChamadas = new HashMap<>();
    static long chamadas = 0;

    static long fib (int n){

        if (mapaResultado.containsKey(n)) {
            chamadas += mapaChamadas.get(n);
            return mapaResultado.get(n);
      }

        long retorno;
        if (n == 0){
            retorno = 0;
        } else if (n == 1){
            retorno = 1;
        } else {
            retorno = fib(n-1) + fib( n-2);
            chamadas+=2;
        }
        mapaResultado.put(n, retorno);
        mapaChamadas.put(n, chamadas);
        return retorno;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            chamadas = 0;
            long resultado = fib(x);
            System.out.printf("fib(%d) = %d calls = %d\n", x, mapaChamadas.get(x), mapaResultado.get(x));
        }
    }
}