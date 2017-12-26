import java.util.*;

public class ex1023 {
        public static void margeSort (int inicio, int fim, int vetor[][]){
        int meio;
        if (inicio < fim -1) {
            meio = (int)((inicio + fim) / 2);
            margeSort(inicio, meio, vetor);
            margeSort(meio, fim, vetor);
            intercalar(inicio, meio, fim, vetor);
        }
    }

    public static void intercalar(int metade1, int metade2, int fim, int vetor[][]){
        int aux[][] = new int[vetor.length][2];

        int pMetade1 = metade1, pMetade2 = metade2, pAux = 0;

        while (pMetade1 < metade2 && pMetade2 < fim) {
            if (vetor[pMetade1][1] < vetor[pMetade2][1]) {
                aux[pAux][1] = vetor[pMetade1][1];
                aux[pAux][0] = vetor[pMetade1][0];
                pMetade1++;
            } else  {
                aux[pAux][1] = vetor[pMetade2][1];
                aux[pAux][0] = vetor[pMetade2][0];
                pMetade2++;
            }
            pAux++;
        }

        while (pMetade1 < metade2) {
            aux[pAux][1] = vetor[pMetade1][1];
            aux[pAux][0] = vetor[pMetade1][0];
            pAux++;
            pMetade1++;
        }

        while (pMetade2 < fim) {
            aux[pAux][1] = vetor[pMetade2][1];
            aux[pAux][0] = vetor[pMetade2][0];
            pAux++;
            pMetade2++;
        }

        for (int i = metade1; i < fim; i++ ) {
            vetor[i][1] = aux[i-metade1][1];
            vetor[i][0] = aux[i-metade1][0];
        }
    }
    private static void troca(int[][] v, int i, int r) {
        int x = v[i][0];
        v[i][0] = v[r][0];
        v[r][0] = x;

        x = v[i][1];
        v[i][1] = v[r][1];
        v[r][1] = x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long contaCasas = 1;
        while (true) {
            int quantidadeDeAmostras = scanner.nextInt();
            if (quantidadeDeAmostras == 0) break;
            int acumuladorMoradores = 0;
            int acumuladorConsumo = 0;
            HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>(quantidadeDeAmostras);
            for (int casa = 0; casa < quantidadeDeAmostras; casa++){ // le as amostras
                int moradores = scanner.nextInt();
                int consumo = scanner.nextInt();
                acumuladorMoradores += moradores;
                acumuladorConsumo += consumo;
                Integer anterior = hashMap.put(consumo/moradores, moradores);
                if (anterior != null){
                    hashMap.put(consumo/moradores, hashMap.get(consumo/moradores) + anterior);
                }
            }
            Iterator<Integer> iteratorKey = hashMap.keySet().iterator();
            int amosta[][] = new int[hashMap.size()][2];
            for (int i = 0; i < amosta.length; i++){
                int key = iteratorKey.next();
                amosta[i][0] = hashMap.get(key);
                amosta[i][1] = key;
            }
            margeSort(0, amosta.length, amosta);
            System.out.println("Cidade# "+contaCasas+":");
            contaCasas++;
            for (int i = 0; i < amosta.length; i++){
                System.out.print(amosta[i][0] + "-" + amosta[i][1]  + (i < amosta.length-1 ? " " : ""));
            }
            String st = Double.toString((acumuladorConsumo*1d)/acumuladorMoradores) + "000";
            System.out.printf("\nConsumo medio: %s m3.\n\n", st.substring(0, st.indexOf('.')+ 3));
        }
    }
}
