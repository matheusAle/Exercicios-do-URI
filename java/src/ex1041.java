
import java.util.Scanner;
public class ex1041 {

	static float x;
	static float y;
	static String quandrante;

	static void verificaQuadrante (){
		if ( x > 0.0 && y > 0.0){
			quandrante = "Q1";
		}else if (x < 0.0 && y > 0.0){
			quandrante = "Q2";
		}else if (x < 0.0 && y < 0.0){
			quandrante = "Q3";
		}else if (x > 0.0 && y < 0.0){
			quandrante = "Q4";
		}else if (x == 0.0 && y == 0.0){
			quandrante = "Origem";
		}else if (x == 0.0 && y != 0.0){
			quandrante = "Eixo Y";
		}else if (x != 0.0 && y == 0.0){
			quandrante = "Eixo X";
		}
	}

	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);

		x = entrada.nextFloat();
		y = entrada.nextFloat();

		verificaQuadrante();

		System.out.printf("%s\n", quandrante);
	}	
}