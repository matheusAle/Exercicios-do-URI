import java.util.Scanner;

public class ex1062N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int quantidadeDeVagoes = scanner.nextInt();
            if (quantidadeDeVagoes == 0) {
                System.exit(0);
            }
            while (true){
                Pilha<Integer> vagoesQueChegamDeA = new Pilha<Integer>();
                Pilha<Integer> vagoesQueVaoParaB = new Pilha<Integer>();
                boolean ehPossivelInverter = true;
                for (int index = 1; index <= quantidadeDeVagoes; index++){
                    vagoesQueChegamDeA.empilhar(scanner.nextInt());
                    if (vagoesQueChegamDeA.elementoNoTopo() == 0){
                        break;
                    }
                    try {
                        int a = vagoesQueChegamDeA.elementoNoTopo();
                        int b = vagoesQueVaoParaB.elementoNoTopo();
                        if (!diferencaDeDois(a, b)){
                            ehPossivelInverter = false;
                        }
                    }catch (NullPointerException e) {}
                    vagoesQueVaoParaB.empilhar(vagoesQueChegamDeA.desempilhar());
                }
                System.out.println(ehPossivelInverter ? "Yes" : "No");
            }
        }
    }

    private static boolean diferencaDeDois (int a, int b){
        return (a == b+2) || (a == b-2) ||
                (a == b+1) || (a == b-1) ||
                (a+2 == b) || (a-2 == b) ||
                (a+1 == b) || (a-1 == b);
    }
}
class Pilha<T> {

    private CCelula<T> cabeca;

    Pilha (){
        cabeca = new CCelula<T>();
    }
    void empilhar(T elemento) {
        CCelula<T> c = new CCelula<T>(elemento);
        c.prox = cabeca.prox;
        cabeca.prox = c;
    }
    T desempilhar() {
        T valor = null;
        if (cabeca.prox != null){
            valor = cabeca.prox.elemento;
            cabeca.prox = cabeca.prox.prox;
        }
        return valor;
    }
    boolean temElementos(){
        return cabeca.prox != null;
    }

    T elementoNoTopo (){
        if (cabeca.prox != null)
            return cabeca.prox.elemento;
        return null;
    }

    void limpar(){
        cabeca.prox = null;
    }

}

class CCelula<T> {
    T elemento;
    CCelula<T> prox;

    CCelula() {
    }
    CCelula(T elemento) {
        this.elemento = elemento;
    }
}
