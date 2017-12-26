

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class ex1851 {

    private static long multa = 0;

    private static PriorityQueue<Dragao> acampamento = new PriorityQueue<Dragao>(Dragao::compareTo);
    private static Dragao dragaoTreinando = null;

    private static class Dragao implements Comparable<Dragao>{
        int dias;
        int multaDiaria;
        double prioridade;

        Dragao(int dias, int multaDiaria1) {
            this.dias = dias;
            this.multaDiaria = multaDiaria1;
            this.prioridade = multaDiaria*1d/dias;
        }

        void treinar(){
            dias--;
        }

        boolean treinamentoConcluiodo(){
            return dias == 0;
        }
        @Override
        public int compareTo(Dragao o) { // escala pela prioridade
            if (this.prioridade < o.prioridade)
                return 1;
            if (this.prioridade > o.prioridade)
                return -1;
            return 0;
        }

        @Override
        public String toString() {
            return new String().format("d{%d, %d, %.2f]", dias, multaDiaria, prioridade);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int acumuladorDeMultaDiario = 0;
        while (true){
            String dragaoEnviado = bufferedReader.readLine();
            if (dragaoEnviado == null || dragaoEnviado.isEmpty()){
                break;
            }else {
                String [] valores = dragaoEnviado.split(" ");
                Dragao novoDragao = new Dragao(Integer.parseInt(valores[0]), Integer.parseInt(valores[1]));
                acumuladorDeMultaDiario += novoDragao.multaDiaria;
                acampamento.offer(novoDragao);
            }
            if (dragaoTreinando == null || dragaoTreinando.treinamentoConcluiodo()) {
                dragaoTreinando = acampamento.poll();
                acumuladorDeMultaDiario -= dragaoTreinando.multaDiaria;
            }
            multa += acumuladorDeMultaDiario;
            /*debug*/System.out.printf("treinou %s, tem %d de multa. Dormiram os %s\n", dragaoTreinando, multa, acampamento);
            dragaoTreinando.treinar();
        };
        while (!acampamento.isEmpty()){
            acumuladorDeMultaDiario -= acampamento.peek().multaDiaria;
            /*debug*/System.out.printf("treinou %s, tem %d de multa. Dormiram os %s\n", acampamento.peek(), multa, acampamento);
            multa += acumuladorDeMultaDiario*acampamento.peek().dias;
            acampamento.remove();
        }
        System.out.println(multa);
    }
}