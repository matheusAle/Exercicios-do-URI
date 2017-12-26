import java.util.Arrays;
import java.util.Scanner;

public class ex1138 {
    public static void a (int array [], int valor) {
        if (valor != 0){
            array[valor%10]++;
            a(array, valor/10);
        }
    }
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            while (true){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = a/b;
                int digitosUsados[] = new int[10];
                for (int i = a; i <= b; i++){

                    if (i != 0)
                        a(digitosUsados, i);
                    else
                        digitosUsados[0]++;
                }
                System.out.printf("%d %d %d %d %d %d %d %d %d %d\n"
                        , digitosUsados[0]
                        , digitosUsados[1]
                        , digitosUsados[2]
                        , digitosUsados[3]
                        , digitosUsados[4]
                        , digitosUsados[5]
                        , digitosUsados[6]
                        , digitosUsados[7]
                        , digitosUsados[8]
                        , digitosUsados[9]
                );
            }
        }catch (ArithmeticException e){

        }
    }
}
