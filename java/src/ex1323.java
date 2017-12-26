import java.util.HashMap;
import java.util.Scanner;

public class ex1323 {
	static HashMap<Integer, Integer> mapa = new HashMap<>(100);
	
	public static int contaQuandrados(int qtLados) {
		if (qtLados != 1){
			if (mapa.containsKey(qtLados)) {
				return mapa.get(qtLados) + contaQuandrados(qtLados-1);
			}else {
				int qtQuadrados = qtLados * qtLados;
				mapa.put(qtLados, qtQuadrados);
				return qtQuadrados + contaQuandrados(qtLados-1);
			}
		}else {	
			return 1;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int entrada = scanner.nextInt();
			if (entrada == 0) break;
			System.out.println(contaQuandrados(entrada));
		}	
	}
	
}