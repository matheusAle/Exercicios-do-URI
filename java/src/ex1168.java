import java.util.Scanner;

public class ex1168 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            String numero = scanner.next();
            System.out.println(contaLeds(numero, 0) + " leds");
        }
    }

    private static int contaLeds(String numero, int index) {
        if (index < numero.length()){
            int nLeds = 0;
            switch ((numero.charAt(index))){
                case '1' : nLeds = 2; break;
                case '2' :
                case '3' :
                case '5' : nLeds = 5; break;
                case '4' : nLeds = 4; break;
                case '0' :
                case '6' :
                case '9' : nLeds = 6; break;
                case '7' : nLeds = 3; break;
                case '8' : nLeds = 7; break;
            }
            return nLeds + contaLeds(numero, index+1);
        }else {
            return 0;
        }
    }
}
