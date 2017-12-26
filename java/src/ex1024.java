import java.util.Scanner;
class ex1024 {

    public static boolean ehLetra (char a) {
        return (a > 64 && a < 91) || (a > 96 && a < 123);
    }
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		entrada.nextLine();
		String txt, txt2 = "";
		for (int i = 0; i < n; i++ ) {
			char [] letras = entrada.nextLine().toCharArray();

			for (int j = 0; j < letras.length; j++ ) { // etapa 1
                letras[j] += (ehLetra(letras[j]) ? 3 : 0);
			}

			for (int s = 0, l = letras.length-1; s < (int)letras.length/2; s++){ // etapa 2
			    char aux = letras[s];
			    letras[s] = letras[l];
			    letras[l] = aux;
			    l--;
			}

			for (int j = (int)letras.length/2; j < letras.length; j++ ) { // etapa 3
				letras[j]--;
			}
			System.out.println(new String(letras));
		}
	}
}