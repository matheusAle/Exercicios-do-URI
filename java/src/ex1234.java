import java.util.LinkedList;

public class ex1234{

    private static boolean isCharacterAlphabetic(char ch){
        return ('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z');
    }

    private static char[] transformarEmStringDancante(char[] texto, int index, char ultimoChar){
        if (index < texto.length){
            if (ultimoChar == '-' && !Character.isSpaceChar(texto[index])){
                ultimoChar = texto[index] = Character.toUpperCase(texto[index]);
            }else {
                if (!Character.isSpaceChar(texto[index]) && isCharacterAlphabetic(texto[index])){
                    if (Character.isUpperCase(ultimoChar)) {
                        ultimoChar = texto[index] = Character.toLowerCase(texto[index]);
                    }else {
                        ultimoChar = texto[index] = Character.toUpperCase(texto[index]);
                    }
                }
            }
            return transformarEmStringDancante(texto, index+1, ultimoChar);
        }
        return texto;
    }

    public static void main(String[] args) {
       java.util.Scanner scanner = new java.util.Scanner(System.in);
       LinkedList<String> linkedList = new LinkedList<String>();
       while (scanner.hasNextLine()){
           String palavra = scanner.nextLine();
           if (palavra.isEmpty())
               break;
           linkedList.addLast(palavra);

       }
       for (String texto : linkedList){
           char [] arrayLetras = texto.toCharArray();
           texto = new String(transformarEmStringDancante(arrayLetras, 0, '-'));
           System.out.println(texto);
       }
    }
}
