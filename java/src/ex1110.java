import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class ex1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            int nCartas = scanner.nextInt();
            if (nCartas == 0) System.exit(0);
            LinkedList<Integer> linkedList = new LinkedList<Integer>();
            for (int i = 1; i <= nCartas; i++){
                linkedList.addLast(i);
            }
            StringBuilder stringBuilder = new StringBuilder(1000);
            stringBuilder.append("Discarded cards: ");
            while (linkedList.size() != 1){
                stringBuilder.append(linkedList.removeFirst() + (linkedList.size() != 1 ? ", ": ""));
                linkedList.addLast(linkedList.removeFirst());
            }
            stringBuilder.append("\nRemaining card: " + linkedList.removeFirst());
            System.out.println(stringBuilder.toString());
        }while (true);
    }

    private static class ListaDuplamenteEncadeada<T>{
        Celula<T> cabeca;
        int quantidade = 0;

        ListaDuplamenteEncadeada(){
            cabeca = new Celula<T>();
        }

        public void adicionarNoInicio(T elemento) {
            Celula<T> celula = new Celula<T>(elemento);
            celula.setAnt(cabeca);
            if (cabeca.getProx() == null){ // se a fina estiver vazia
                celula.setProx(cabeca); // o proximo elemento apos o novo é a cabeça
                cabeca.setAnt(celula);
            }else{
                celula.setProx(cabeca.getProx()); // ou o proximo apos a cabeça
            }
            cabeca.setProx(celula); // o primeiro elemeto é o novo elemento
            quantidade++;
        }

        public void adicionarNoFinal (T elemento) {
            Celula<T> celula = new Celula<T>(elemento);
            celula.setProx(cabeca);
            if (cabeca.getAnt() == null) { // se a fima estiver vazia
                adicionarNoInicio(elemento); // o elemento anterior é a cabeça o cooca no começo
            }else {
                celula.setAnt(cabeca.getAnt()); // se não será o peniltimo elemento da fila
            }
            cabeca.getAnt().setProx(celula);
            cabeca.setAnt(celula); // o ultimo elemento é o novo elemento
            quantidade++;
        }

        public T removerDoInicio(){
            if (cabeca.getProx() != null){
                T r = (T) cabeca.getProx().getValor(); // salva o valor do primeiro elemento
                cabeca.getProx().getProx().setAnt(cabeca);
                cabeca.setProx(cabeca.getProx().getProx());
                quantidade--;
                return r;
            }
            return null;
        }

        public T removerDoFinal (){
            if (cabeca.getAnt() != null){
                T r = (T) cabeca.getAnt().getValor();
                cabeca.getAnt().setProx(cabeca);
                cabeca.setAnt(cabeca.getAnt().getAnt());
                quantidade--;
                return r;
            }
            return null;
        }

        private class Celula<T> {
            private Celula<T> ant;
            private T valor;
            private Celula<T> prox;

            public Celula () {

            }

            public Celula (T valor){
                setValor(valor);
            }

            public T getValor() {
                return valor;
            }

            public void setValor(T valor) {
                this.valor = valor;
            }

            public Celula getProx() {
                return prox;
            }

            public void setProx(Celula<T> prox) {
                this.prox = prox;
            }

            public Celula<T> getAnt() {
                return ant;
            }

            public void setAnt(Celula<T> ant) {
                this.ant = ant;
            }
        }
    }
}





