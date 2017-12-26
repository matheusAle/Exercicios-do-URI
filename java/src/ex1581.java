import java.util.Scanner;

public class ex1581 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        for (int i = 0; i < n; i++){
            int k = Integer.parseInt(s.nextLine());
            String primeiroIdioma = s.nextLine();
            boolean apenasNativos = true;
            for (int j = 1; j < k; j++){
                String proximoIdioma = s.nextLine();
                if (!proximoIdioma.equals(primeiroIdioma)){
                    apenasNativos = false;
                }
            }
            if (apenasNativos){
                System.out.println(primeiroIdioma);
            }else {
                System.out.println("ingles");
            }
        }
    }
}
