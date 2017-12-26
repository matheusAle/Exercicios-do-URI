import java.util.Scanner;

public class ex1145 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        for (int i = 1; i <= y; i++){
            System.out.printf("%d" + (i%x == 0 ? '\n' : " "), i);
        }
    }
}
