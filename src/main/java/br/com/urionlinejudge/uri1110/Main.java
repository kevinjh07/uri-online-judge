package br.com.urionlinejudge.uri1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kevin URI Online Judge | 1110 Throwing Cards Away
 */
public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(stream);
        StringBuilder builder = new StringBuilder();
        String str;
        while ((str = reader.readLine()) != null) {
            int valor = Integer.parseInt(str);
            if (valor == 0) {
                break;
            }
            builder.delete(0, builder.length());
            int[] vetor = new int[valor];
            for (int i = 0; i < vetor.length; ++i) {
                vetor[i] = i + 1;
            }
            builder.append("Discarded cards: ");
            for (int i = 0; i < vetor.length - 1; ++i) {
                builder.append(vetor[i]);
                if (i < vetor.length - 2) {
                    builder.append(", ");
                }
                int proximo = i + 1;
                int atual = vetor[proximo];
                for (int j = proximo; j < vetor.length - 1; ++j) {
                    vetor[j] = vetor[j + 1];
                }
                vetor[vetor.length - 1] = atual;
            }
            builder.append("\n").append("Remaining card: ").append(vetor[vetor.length - 1]);
            System.out.println(builder.toString());
        }
    }

}
