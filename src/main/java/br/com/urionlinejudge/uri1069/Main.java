package br.com.urionlinejudge.uri1069;

import java.util.Scanner;

/**
 * 
 * @author kevin URI Online Judge | 1069 Diamonds and Sand
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		for (int i = 0; i < cases; ++i) {
			int openings = 0;
			int count = 0;
			char[] text = sc.next().toCharArray();
			for (int j = 0; j < text.length; ++j) {
				int current = text[j];
				if (current != '.') {
					if (current == '<') {
						++openings;
					} else if (current == '>' && openings > 0) {
						--openings;
						++count;
					}
				}
			}
			System.out.println(count);
		}
		sc.close();
	}

}
