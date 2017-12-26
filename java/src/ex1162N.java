import java.util.Scanner;

public class ex1162N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int x = 0; x < n; x++){
            int l = scanner.nextInt();
            int [] vagoes = new int[l];
            int posicaoL = -1;
            for (int y = 0; y < l; y++){
                vagoes[y] = scanner.nextInt();
                posicaoL = (vagoes[y] == l ? y : posicaoL);
            }
            int contador = 0;
            for (int i = posicaoL; i < l-1; i++){
                int p = vagoes[i];
                vagoes[i] = vagoes[i+1];
                vagoes[i+1] = p;
                contador += (i+2 == l ? 1 : (contador == 0 ? 1 : 2));
            }
            System.out.printf("Optimal train swapping takes %d swaps.\n", contador);
        }
    }
}
