
public class ex1094 {
	public static void main (String []args){
		java.util.Scanner entrada = new java.util.Scanner (System.in);
		char animal;
		int  totalCobaias = 0, totalRato = 0, totalSapo = 0, totalCoelho = 0;
		int N = entrada.nextInt();
		for (int i = 0; i < N; i++){
			int quantidade = entrada.nextInt();
			animal = entrada.next().charAt(0);
			switch (animal) {
				case 'C' : totalCoelho += quantidade; break;
				case 'R' : totalRato +=quantidade; break;
				case 'S' : totalSapo += quantidade; break;
			}
			totalCobaias += quantidade;
		}
		float tC = (100/totalCobaias)*totalCoelho;
		float tR = (100/totalCobaias)*totalRato;
		float tS = (100/totalCobaias)*totalSapo;
		System.out.printf("Total: %d cobaias\n", totalCobaias);
		System.out.printf("Total de coelhos: %d\n", totalCoelho);
		System.out.printf("Total de ratos: %d\n", totalRato);
		System.out.printf("Total de sapos: %d\n", totalSapo);
		System.out.printf("Percentual de coelhos: %.2f %%\n", tC);
		System.out.printf("Percentual de ratos: %.2f %%\n", tR);
		System.out.printf("Percentual de sapos: %.2f %%\n", tS);
	}
}