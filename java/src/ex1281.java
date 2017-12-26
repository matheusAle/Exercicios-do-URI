import java.util.HashMap;
import java.util.Scanner;

public class ex1281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int x = 0, n = scanner.nextInt(); x < n; x++){
            int m = scanner.nextInt();
            HashMap<String, Double> produtos = new HashMap<String, Double>(m);
            for (int z = 0; z < m; z++){ // cadatra o produto no sistema
                produtos.put(scanner.next(), scanner.nextDouble());
            }
            double valorNecessario = 0;
            for (int z = 0, qt = scanner.nextInt(); z < qt; z++){
                valorNecessario += produtos.get(scanner.next()) * scanner.nextInt();
            }
            System.out.printf("R$ %.2f\n", valorNecessario);
        }
    }
}
