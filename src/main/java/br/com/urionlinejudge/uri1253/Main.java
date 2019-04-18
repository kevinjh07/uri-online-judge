package br.com.urionlinejudge.uri1253;

import java.util.Scanner;

/**
 * 
 * @author kevin URI Online Judge | 1253 Caesar Cipher
 *
 */
public class Main {
	private static final int INICIO_LETRAS_TABELA_ASC = 65;
	private static final int TAMANHO_ALFABETO = 26;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iteracoes = sc.nextInt();

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < iteracoes; i++) {
			builder.delete(0, builder.length());
			char[] texto = sc.next().toCharArray();
			int deslocamentos = sc.nextInt();
			for (int j = 0; j < texto.length; j++) {
				if ((texto[j] - deslocamentos) < INICIO_LETRAS_TABELA_ASC) {
					texto[j] += (TAMANHO_ALFABETO - deslocamentos);
				} else {
					texto[j] -= deslocamentos;
				}
				builder.append(texto[j]);
			}
			System.out.println(builder.toString());
		}
		sc.close();
	}

}
