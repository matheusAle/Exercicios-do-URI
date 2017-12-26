import java.util.Scanner;
import java.util.Arrays;
class Triangulo{

	double ladoA, ladoB, ladoC, perimetro;

	Triangulo (double a, double b, double c){
		ladoA = a;
		ladoB = b;
		ladoC = c;
	} 

	void tipoTriangulo (){
		if (ladoA >= (ladoB+ladoC)){
			System.out.printf("NAO FORMA TRIANGULO\n");
		}else {
			if ((ladoA*ladoA) == (ladoB*ladoB)+(ladoC*ladoC)){
				System.out.printf("TRIANGULO RETANGULO\n");
			}
			if ((ladoA*ladoA) > (ladoB*ladoB)+(ladoC*ladoC)){
				System.out.printf("TRIANGULO OBTUSANGULO\n");
			}
			if ((ladoA*ladoA) < (ladoB*ladoB)+(ladoC*ladoC)){
				System.out.printf("TRIANGULO ACUTANGULO\n");
			}
			if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC){
				System.out.printf("TRIANGULO EQUILATERO\n");
			}
			if (ladoA == ladoB && ladoA != ladoC){
				System.out.printf("TRIANGULO ISOSCELES\n");
			}
			if (ladoA == ladoC && ladoA != ladoB){
				System.out.printf("TRIANGULO ISOSCELES\n");
			}
			if (ladoB == ladoC &&ladoB != ladoA){
				System.out.printf("TRIANGULO ISOSCELES\n");
			}
		}
	}

}

class ex1045{
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double abc[] = new double[3];

		abc[0] = entrada.nextDouble();
		abc[1] = entrada.nextDouble();
		abc[2] = entrada.nextDouble();

		// ordena os valores do vetor en ordem crescente.
		Arrays.sort(abc);

		Triangulo triangulo = new Triangulo (abc[2], abc[1], abc[0]);
	
		triangulo.tipoTriangulo();
	}
}