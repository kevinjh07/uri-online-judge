package br.com.urionlinejudge.uri1451;

import java.util.Scanner;

/**
 * 
 * @author kevin URI Online Judge | 1451 Broken Keyboard
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			char[] texto = sc.next().toCharArray();
			StringBuilder builder = new StringBuilder();
			boolean beiju = false;
			int indice = 0;
			for (int i = 0; i < texto.length; i++) {
				switch (texto[i]) {
				case '[':
					beiju = true;
					indice = 0;
					break;
				case ']':
					beiju = false;
					break;
				default:
					if (beiju) {
						builder.insert(indice++, texto[i]);
					} else {
						builder.append(texto[i]);
					}
					break;
				}
			}
			System.out.println(builder.toString());
		}
		sc.close();
	}

}
