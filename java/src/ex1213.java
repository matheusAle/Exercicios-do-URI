import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ex1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            try {
                Long valorN = Long.parseLong(scanner.readLine());
                long l;
                int contador = 1;
                for (l = 1; l%valorN != 0; l = (10 * l + 1) %valorN , contador++);
                System.out.println(contador);
            }catch (Exception e){break;}
        }
    }
}

class a {
    public static void main(String[] args) {
        for (long i = 1; i < 100000; i++){
            if (i%2 != 0 && i%5 != 0){
                System.out.println(i);
            }
        }
    }
}