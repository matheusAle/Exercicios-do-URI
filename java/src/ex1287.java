import java.util.Scanner;
import static java.lang.Character.isSpaceChar;
import static java.lang.Character.isAlphabetic;

public class ex1287 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            ListaEncadeada<Character> lista = new ListaEncadeada<Character>();
            String linha = scanner.nextLine();
            char [] chars = linha.toCharArray();
            boolean sequenciaCorreta = true;
            for (char c : chars){
                if (sequenciaCorreta){
                    switch (c){
                        case 'O':
                        case 'o':
                            lista.adicionarNoFinal('0');
                            break;
                        case 'l':
                            lista.adicionarNoFinal('1');
                            break;
                        default:
                            if (c >= '0' && c <= '9'){
                                lista.adicionarNoFinal(c);
                                break;
                            }
                            if (c != ',' && c != ' '){
                                sequenciaCorreta = false;
                                break;
                            }
                    }
                }else {
                    break;
                }
            }
            try{
                int t = Integer.parseInt(lista.imprimir());
                if (t <= Integer.MAX_VALUE && sequenciaCorreta) {
                    System.out.println(t);
                }
            }catch (NumberFormatException e){
                System.out.println("error");
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    static class ListaEncadeada<T> {
        private Celula<T> cabeca;
        private Celula<T> finalDaLista;

        public ListaEncadeada() {
            cabeca = new Celula<T>();
            finalDaLista = cabeca;
        }


        public String imprimir() {
            Celula atual = cabeca.prox;
            String t = "";
            while (atual != null) {
                t = t.concat(String.valueOf(atual.valor));
                atual = atual.prox;
            }
            return t;
        }

        /**
         * Adciona o parametro p em uma nova celula no final da lista
         *
         * @param p valor da nova ultima celula da lista
         */
        public void adicionarNoFinal(T p) {
            Celula<T> x = new Celula<T>(p);
            finalDaLista.prox = x;
            x.ant = finalDaLista;
            finalDaLista = x;
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

            public String toString() {
                return valor.toString();
            }
        }

    }
}