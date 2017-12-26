import java.lang.Math;
import java.util.Scanner;

class Triangulo2{

	double ladoA, ladoB, ladoC, perimetro;

	Triangulo2(double a, double b, double c){
		ladoA = a;
		ladoB = b;
		ladoC = c;
	} 

	boolean verificarTrinagulo(){
		int aux = 0;
		if (ladoB+ladoC > ladoA && ladoA > Math.abs(ladoB-ladoC)){
			aux++;
		}
		if (ladoA+ladoC > ladoB && ladoB > Math.abs(ladoA-ladoC)){
			aux++;
		}
		if (ladoA+ladoB > ladoC && ladoC > Math.abs(ladoA-ladoB)){
			aux++;
		}
		if (aux == 3){ return true; }else{ return false; }
	}

	void alcularPerimetroTiangulo (){
		perimetro = ladoA+ladoB+ladoC;
	}
}

class Trapezio {
	double ladoA, ladoB, ladoC, area;

	Trapezio(double a, double b, double c){
		ladoA = a;
		ladoB = b;
		ladoC = c;
	}

	void calcularAreaTrapezio(){
		area = ((ladoA+ladoB)*ladoC)/2;
	}
}

class ex1043{
	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);

		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		double c = entrada.nextDouble();
		
		Triangulo2 triangulo = new Triangulo2(a, b, c);
		
		if (triangulo.verificarTrinagulo()){
			
			triangulo.alcularPerimetroTiangulo();
			System.out.printf("Perimetro = %.1f\n", triangulo.perimetro);

		}else{

			Trapezio trapezio = new Trapezio(a, b, c);
			trapezio.calcularAreaTrapezio();
			System.out.printf("Area = %.1f\n", trapezio.area);
		
		}
	}
}