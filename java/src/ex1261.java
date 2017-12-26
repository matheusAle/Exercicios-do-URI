import java.util.HashMap;

public class ex1261 {
    public static void main(String[] args) {
        java.util.Scanner scanner= new java.util.Scanner(System.in);
        int numeroDePalavras = scanner.nextInt();
        int numeroDeDescricao = scanner.nextInt();
        HashMap<String, Double> mapaDePontos = new HashMap<String, Double>(numeroDePalavras);
        for (int i = 0; i <numeroDePalavras; i++)
            mapaDePontos.put(scanner.next(), scanner.nextDouble());
        for (int i = 0; i < numeroDeDescricao; i++){
            String descricao = "";
            do {
                String s = scanner.nextLine();
                if (s.equals("."))
                    break;
                descricao += s + " ";
            }while (true);
            String palavras[] = descricao.split(" ");
            double valor = 0.0;
            for (String palavra: palavras) {
                double v = 0.0;
                try{
                    v = mapaDePontos.get(palavra);
                }catch (NullPointerException e) {}
                valor += v;
            }
            System.out.printf("%.0f\n", valor);
        }
    }
}
