package br.com.urionlinejudge.uri1110;

import java.util.Scanner;

/**
 * 
 * @author kevin URI Online Judge | 1110 Throwing Cards Away
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int valor = sc.nextInt();
			if (valor == 0) {
				break;
			}
			StringBuilder builder = new StringBuilder();
			builder.delete(0, builder.length());
			int[] vetor = new int[valor];
			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = i + 1;
			}
			builder.append("Discarded cards: ");
			for (int i = 0; i < vetor.length - 1; i++) {
				builder.append(vetor[i]);
				if (i < vetor.length - 2) {
					builder.append(", ");
				}
				int proximo = i + 1;
				int atual = vetor[proximo];
				for (int j = proximo; j < vetor.length - 1; j++) {
					vetor[j] = vetor[j + 1];
				}
				vetor[vetor.length - 1] = atual;
			}
			builder.append("\n")
				.append("Remaining card: ")
				.append(vetor[vetor.length - 1]);
			System.out.println(builder.toString());
		}
		sc.close();
	}

}
