import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;


public class ex1068 {

    public static boolean validarExpressao(String texto, Stack pilha, int index){
        if (index == texto.length()){
            return pilha.empty();
        }
        if(texto.charAt(index) == '('){
            pilha.addElement('(');
        }else if (texto.charAt(index) == ')') {
            try {
                pilha.pop();
            }catch (EmptyStackException e){
                return false;
            }
        }
        return validarExpressao(texto, pilha, index+1);
    }

    public static void verificar(String s){
        System.out.println((validarExpressao(s, new Stack<Character>(), 0) ? "correct" : "incorrect"));

    }

    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(
                new InputStreamReader(System.in)
        );
        LinkedList<String> linkedList = new LinkedList<String>();
        do{
            linkedList.add(scanner.readLine());
        }while(scanner.ready());
        linkedList.forEach(action -> {verificar(action);});
    }
}
