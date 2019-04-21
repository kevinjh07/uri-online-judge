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

		for (int i = 0; i < iteracoes; i++) {
			StringBuilder builder = new StringBuilder();
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
