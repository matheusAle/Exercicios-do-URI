import java.util.Scanner;
public class ex1012 {
	public static void main (String []args){
		Scanner entrada = new Scanner(System.in);
		Double A = entrada.nextDouble();
		Double B = entrada.nextDouble();
		Double C = entrada.nextDouble();
		System.out.printf("TRIANGULO: %.3f\n", (A*C)/2); //a área do triângulo retângulo que tem A por base e C por altura
		System.out.printf("CIRCULO: %.3f\n", 3.14159*(C*C)); //a área do círculo de raio C.  pi*c^2(pi = 3.14159) 
		System.out.printf("TRAPEZIO: %.3f\n", ((A+B)*C)/2); //área do trapézio que tem A e B por bases e C por altura 
		System.out.printf("QUADRADO: %.3f\n", B*B); //a área do quadrado que tem lado B. 
		System.out.printf("RETANGULO: %.3f\n", A*B); //a área do retângulo que tem lados A e B. 
	}
}
