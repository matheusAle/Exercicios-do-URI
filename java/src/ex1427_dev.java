import java.util.Scanner;

public class ex1427_dev {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int numeroDeJogadores = scanner.nextInt(); //lê n
            int numeroDeAcoes = scanner.nextInt(); // lê m
            if (numeroDeAcoes == 0 && numeroDeJogadores == 0) break; // fim dos casos de teste

            Disjoint_Set disjoint_set = new Disjoint_Set(numeroDeJogadores);

            for (int iJogador = 0; iJogador < numeroDeJogadores; iJogador++){ // le os postos dos jogadores
                disjoint_set.add(scanner.nextInt());
            }
            int vezesQueORafaelGanhou = 0;
            for (int iAcao = 0; iAcao < numeroDeAcoes; iAcao++){
                int tipoDeAcao = scanner.nextInt(); //lê q
                int guildaA = scanner.nextInt(); //lê a
                int guildaB = scanner.nextInt(); //lê b
                switch (tipoDeAcao){
                    case 1 :
                        disjoint_set.unionSet(guildaA, guildaB);
                        System.out.println("depois=" + disjoint_set);
                        break;
                    case 2 :
                        int pontosGuildaA = disjoint_set.contaPontos(guildaA);
                        int pontosGuildaB = disjoint_set.contaPontos(guildaB);
                        String guildadoRafael = disjoint_set.getGuldaRafael();
                        System.out.printf("pts %d = %d, pts %d = %d, gdRaf = %s\n",guildaA, pontosGuildaA, guildaB, pontosGuildaB, guildadoRafael);
                        if (guildadoRafael.contains(String.valueOf(guildaA)) && pontosGuildaA > pontosGuildaB){
                            vezesQueORafaelGanhou++;
                        }
                        if (guildadoRafael.contains(String.valueOf(guildaB)) && pontosGuildaA < pontosGuildaB) {
                            vezesQueORafaelGanhou++;
                        }
                        break;
                }
            }
            System.out.println(vezesQueORafaelGanhou);
        }
    }


    /**
     *
     *
     *ref : http://mattleao.blogspot.com.br/2015/03/conjuntos-disjuntos-disjoint-set.html
     */
    private static class Disjoint_Set {
        Celula conjunto[];
        int index;

        Disjoint_Set(int tamanho) {
            conjunto = new Celula[tamanho+1];
            index = 1;
        }

        public void add(int valor) {
            conjunto[index] = new Celula(index, valor);
            index++;
        }

        /** Retorna em que conjunto um nó está inserido.
         * @param celula nó que se deseja saber o conjunto.
         * @return nó pai do no passado como parametro.
         */
        public int find(int celula){
            while (conjunto[celula].pai != celula){
                celula = conjunto[celula].pai;
            }
            return conjunto[celula].node;
        }

        public void unionSet (int filho, int pai){
            int pai_Flho = find(filho);
            int pai_Pai = find(pai);

            if (pai_Flho == pai_Pai) return; // se tem o mesmo pai estão ligados e fim.

            //Para todos os N nos, atualiza os que apontavam para pai
            //agora devem apontar para filho
            conjunto[pai_Pai].pai = pai_Flho;
            for (int i = 1; i < index; i++){
                if (conjunto[i].pai == pai_Pai){
                    conjunto[i].pai = filho;
                }
            }
        }

        public String getGuldaRafael(){
            String guldaRafael = "1";
            for (int i = 2; i < index; i++){
                if (conjunto[i].pai == 1 ) guldaRafael += ", "+i;
            }
            return guldaRafael;
        }

        @Override
        public String toString() {
            String s = "[ ";
            for (int i = 1; i < index; i++){
                s +=  conjunto[i]+", ";
            }
            return s+"]";
        }

        public int contaPontos (int guilda){
            int pontos = 0;
            for (int i = 1; i <index; i++){
                if (conjunto[i].pai == guilda ||conjunto[i].node == guilda) pontos += conjunto[i].pontos;
            }
            return pontos;
        }

        class Celula<T> {
            int pai; // node pai de this
            int node; // node
            int  pontos; // pontos do node (jogador)

            Celula() {
            }

            Celula(int node, int pontos) {
                this.node = node;
                this.pai = node;
                this.pontos = pontos;
            }

            public String toString (){
                return "node{p="+pai+", n="+node+", pts="+pontos+"}";
            }
        }
    }

}
