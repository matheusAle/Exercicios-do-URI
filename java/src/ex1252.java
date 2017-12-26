import java.util.Scanner;

public class ex1252 {

    private static boolean ehPar(int i){
        return i % 2 == 0;
    }
    private static boolean ehImpar (int i){
        return i % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int qtEntradas = scanner.nextInt();
            int modulo = scanner.nextInt();
            if (qtEntradas == 0 && modulo == 0) break;

            ListaEncadeada<Integer>[] vetor = new ListaEncadeada[modulo];
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = new ListaEncadeada<Integer>();
            }
            for (int i = 0; i < qtEntradas; i++) {
                int entradaN = scanner.nextInt();
                int modN = entradaN % modulo;
                Integer primeiroInteger = null;
                primeiroInteger = vetor[modN].removerNoInicio();
                if(primeiroInteger != null){
                    int primeiro = primeiroInteger.intValue();
                    if (ehPar(primeiro) && ehPar(entradaN)){ // empate entre pares
                        if (entradaN < primeiro){
                            vetor[modN].adicionarNoInicio(primeiro);
                            vetor[modN].adicionarNoInicio(entradaN);
                        }else{
                            vetor[modN].adicionarNoInicio(entradaN);
                            vetor[modN].adicionarNoInicio(primeiro);
                        }
                    }else if (ehImpar(primeiro) && ehImpar(entradaN)) { // empate impar
                        if (entradaN < primeiro){
                            vetor[modN].adicionarNoInicio(entradaN);
                            vetor[modN].adicionarNoInicio(primeiro);
                        }else{
                            vetor[modN].adicionarNoInicio(primeiro);
                            vetor[modN].adicionarNoInicio(entradaN);
                        }
                    } else if (ehPar(primeiro) && ehImpar(entradaN)){ // empate entre par e impar
                        vetor[modN].adicionarNoInicio(entradaN);
                        vetor[modN].adicionarNoInicio(primeiro);
                    } else if  (ehImpar(primeiro) && ehPar(entradaN)) {
                        vetor[modN].adicionarNoInicio(primeiro);
                        vetor[modN].adicionarNoInicio(entradaN);
                    }
                }else {
                    vetor[modN].adicionarNoInicio(entradaN);
                }
            }

            System.out.printf("%d %d\n", qtEntradas, modulo);
            for (int i = 0; i < vetor.length; i++) {
                vetor[i].imprimir();
            }

        }
        System.out.println("0 0");
    }

    static class ListaEncadeada<T> {
        private Celula<T> cabeca;

        ListaEncadeada() {
            cabeca = new Celula<T>();
        }

        void imprimir() {
            Celula<T> atual = cabeca.prox;

            while(atual != null) {
                System.out.println(atual.valor);
                atual = atual.prox;
            }
        }

        void adicionarNoInicio(T p){
            Celula<T> x = new Celula<T>(p);
            x.prox = cabeca.prox;
            cabeca.prox = x;
        }

        T removerNoInicio(){
            if (cabeca.prox != null){
                T r = cabeca.prox.valor;
                cabeca.prox = cabeca.prox.prox;
                return r;
            }
            return  null;
        }

        public String toString (){
            Celula<T> atual = cabeca.prox;
            String st = "";
            while(atual != null) {
                st += ", " + atual.toString();
                atual = atual.prox;
            }
            return st;
        }
        class Celula<T> {
            Celula<T> ant;
            T valor;
            Celula<T> prox;
            public Celula() {
            }
            public Celula(T valor) {
                this.valor = valor;
            }
            public String toString (){
                return valor.toString();
            }
        }

    }

}
