import java.util.Scanner;

public class ex1905 {

    static int matriz[][] = new int[5][5];
    static boolean copsVenceu;

    static boolean procurar(int v, int h, int c){
        if (v == 4 && h == 4) {
            return true;
        }
        System.out.println("chamada: "+c);
        print(v, h);
        boolean r = false;
        if (!r && localValido(v+1, h)) r = procurar(v+1, h, c+1); // desce na vertical;
        if (!r && localValido(v, h+1)) r = procurar(v, h+1, c+1); // anda para a direita na mesma linha;
        if (!r && localValido(v-1, h)) r = procurar(v-1, h, c+1); // sobe na vertical;
        if (!r && localValido(v, h-1)) r = procurar(v,h-1, c+1); // anda pra traz na mesma linha.
        return r;
    }

    static boolean localValido(int v, int h){
        try {
            if (h >= 0 && h < 5 && v >= 0 && v < 5 && matriz[v][h] == 0)
                return true;
        }catch (Exception e){}
        return false;

    }

    static void print(int v, int h){
        int aux = matriz[v][h];
        matriz[v][h] = 8;
        for (int e = 0; e < 5; e++){
            for (int x = 0; x < 5; x++){
                System.out.print(matriz[e][x] + " ");
            }
            System.out.println();
        }
        matriz[v][h] = aux;
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0, n = scanner.nextInt(); i < n; i++){
            for (int v = 0; v < 5; v++){
                for (int h = 0; h < 5; h++){
                    matriz[v][h] = scanner.nextInt();
                }
            }
            ;
            System.out.println((procurar(0, 0, 1)? "COPS" : "ROBBERS"));
        }


    }
}
