

public class ex1046 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int hInicio = scanner.nextInt();
        int hFim = scanner.nextInt();
        System.out.printf("O JOGO DUROU %d HORA(S)\n", (hInicio >= hFim ? (24 - hInicio + hFim) : Math.abs(hInicio - hFim)));
    }
}
