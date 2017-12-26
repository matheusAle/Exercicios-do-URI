import java.util.Scanner;
class ex2152 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int logH;
		int logM;
		int logO;
		int vezes = entrada.nextInt();
		for (int i = 0; i < vezes; i++ ) {
			logH = entrada.nextInt();
			logM = entrada.nextInt();
			logO = entrada.nextInt();
			if (logO == 1) {
				System.out.printf("%0,2d:%0,2d - A porta abriu!\n", logH, logM);
			}else {
				System.out.printf("%0,2d:%0,2d - A porta fechou!\n", logH, logM);
			}

		}
	}
}