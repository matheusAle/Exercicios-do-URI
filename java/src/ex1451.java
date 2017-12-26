import java.io.*;

public class ex1451 {

    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader( new InputStreamReader(System.in));
        String s = "";
        try {
            do {
                s = scanner.readLine();
                if (s.isEmpty())
                    break;
                corrigirSplit(s);
            } while (!s.equals(""));
        }catch (NullPointerException e){}
    }

    private static void corrigirSplit (String texo){
        ListaEncadeada<String> lista = new ListaEncadeada<String>();
        try {
            String subs [] = texo.split("\\[");
            for (String st : subs) {
                String subSub [] = st.split("]");
                try {
                    lista.adicionarNoInicio(subSub[0]);
                    for (int i = 1; i < subSub.length; i++)
                        lista.adicionarNoFinal(subSub[i]);
                }catch (Exception e) {}
            }
        }catch (NullPointerException e){}
        lista.imprimir();
    }

    static class ListaEncadeada<T> {

        private Celula<T> cabeca;
        private Celula<T> finalDaLista;

        public ListaEncadeada() {
            cabeca = new Celula<T>();
            finalDaLista = cabeca;
        }

        /**
         * Imprime em uma unica linha o valor de todas as celulas apartir da primeira celula
         */
        public void imprimir() {
            Celula atual = cabeca.prox;

            while(atual != null) {
                System.out.print(atual.valor);
                atual = atual.prox;
            }
            System.out.println();
        }


        /**
         * adiciona na lista uma nova celula no começo da lista
         * @param p valor
         */
        public void adicionarNoInicio(T p){
            Celula<T> x = new Celula<T>(p);
            x.ant = cabeca;
            x.prox = cabeca.prox;
            try {
                cabeca.prox.ant = x;
            }catch (NullPointerException e) {}
            cabeca.prox = x;
            if (finalDaLista == cabeca)
                finalDaLista = cabeca.prox;
        }

        /**
         * Adciona o parametro p em uma nova celula no final da lista
         * @param p valor da nova ultima celula da lista
         */
        public void adicionarNoFinal(T p){
            Celula<T> x = new Celula<T>(p);
            finalDaLista.prox = x;
            x.ant = finalDaLista;
            finalDaLista = x;
        }

        public String toString (){
            Celula atual = cabeca.prox;
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
