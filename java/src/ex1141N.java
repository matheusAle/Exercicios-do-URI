import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ex1141N {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (true){
            int quantidade = scanner.nextInt();

            if (quantidade == 0)
                System.exit(0);

            String [] strings = new String[quantidade];
            for (int i = 0; i < quantidade; i++)
                strings[i] = scanner.next();
            int contador = 0;
            for (int i = 0; i < quantidade; i++){
                for (int p = 0, leg = strings[i].length(); p < leg; p++){
                    String sub = strings[i].substring(p, leg);
                    for (int a = i; a < quantidade; a++){
                        contador += strings[a].contains(sub) ? 1 : 0;
                    }
                }
            }
            System.out.println(contador);
        }
    }
}
