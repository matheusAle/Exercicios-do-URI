import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class ex1580 {
    static HashMap<BigInteger, BigInteger> mapaDeResultados = new HashMap<BigInteger, BigInteger>();
    static BigInteger um = new BigInteger("1");

    public static BigInteger fatorial(BigInteger valor) {

        if (valor.intValue() == 0)
            return um;

        if (mapaDeResultados.containsKey(valor))
            return mapaDeResultados.get(valor);

        BigInteger bgtemp = valor.subtract(um);

        BigInteger fatorial = valor.multiply(fatorial(bgtemp));

        mapaDeResultados.put(valor, fatorial);

        return fatorial;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger valMod = new BigInteger("1000000007");
        while (true) {
            HashMap<Character, Integer> mapaDeRepeticao = new HashMap<>(26);

            String texto = reader.readLine();

            if (texto == null || texto.isEmpty()) break;


            BigInteger fat = fatorial(new BigInteger(String.valueOf(texto.length())));

            //mapeia as letras da frase com o seu numero de repetição
            for (char ch : texto.toCharArray()){
                if (mapaDeRepeticao.containsKey(ch)){
                    mapaDeRepeticao.put(ch, mapaDeRepeticao.get(ch)+1);
                } else {
                    mapaDeRepeticao.put(ch, 1);
                }
            }

            //pega a a qauntidade das letras que se repetiram
            Integer rp[] = (Integer[]) mapaDeRepeticao.values()
                    .stream().filter((p) -> {
                        return p > 1;
                    })
                    .toArray(Integer[]::new);


            BigInteger resultadoD = new BigInteger("1");

            // calcula o fatorial de cada repetição
            for (int i : rp) {
                resultadoD = resultadoD.multiply(fatorial(new BigInteger(String.valueOf(i))));
            }




            fat = fat.divide(resultadoD);

            System.out.println(fat.mod(valMod));
        }
    }
}