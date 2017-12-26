
public class ex1169 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int quantCasos = scanner.nextInt();
        for (int i = 0; i < quantCasos; i++){
            System.out.printf("%d kg\n", (long)((Math.pow(2, scanner.nextInt())/12)/1000));
        }
    }
}
