
public class ex1047 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int hInicio = scanner.nextInt();
        int mInicio = scanner.nextInt();
        int hFim = scanner.nextInt();
        int mFim = scanner.nextInt();
        int dMinutos = (hFim*60 + mFim) - (hInicio*60 + mInicio);
        int dhoras, dMin;
        if (dMinutos < 0 )
                dhoras = 24;
        else


        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n"
                ,Math.abs((dMinutos/60) == 0 ? (dMinutos < 0 ? 23 : 24 ) :(dMinutos < 0 ? 24-Math.abs(dMinutos/60) : dMinutos/60))
                ,Math.abs(dMinutos < 0 ? 60 - Math.abs(dMinutos) : dMinutos % 60)
        );
    }
}
