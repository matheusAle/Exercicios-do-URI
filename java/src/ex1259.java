
import java.util.PriorityQueue;
import java.util.Scanner;

public class ex1259 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qntEntradas = scanner.nextInt();
        PriorityQueue<Integer> pares = new PriorityQueue<Integer>(qntEntradas, (o1, o2) -> {
            if (o1 > o2)
                return 1;
            else if (o1 < o2)
                return -1;
            return 0;
        });
        PriorityQueue<Integer> impares = new PriorityQueue<Integer>(qntEntradas, (o1, o2) -> {
            if (o1 < o2)
                return 1;
            else if (o1 > o2)
                return -1;
            return 0;
        });
        for (int i = 0; i < qntEntradas; i++){
            int entrada = scanner.nextInt();
            if (entrada%2 == 0)
                pares.add(entrada);
            else
                impares.add(entrada);
        }
        while (!pares.isEmpty()){
            System.out.println(pares.poll());
        }
        while (!impares.isEmpty()){
            System.out.println(impares.poll());
        }

    }
}
