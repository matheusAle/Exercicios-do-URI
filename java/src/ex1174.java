import java.util.Scanner;

public class ex1174 {
    public static void main(String[] args) {
        float [] A = new float[100];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < A.length; i++){
            A[i] = scanner.nextFloat();
            if (A[i] <= 10) {
                System.out.printf("A[%d] = %.1f\n", i, A[i]);
            }
        }

    }
}
