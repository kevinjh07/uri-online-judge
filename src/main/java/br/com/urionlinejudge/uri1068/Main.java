package br.com.urionlinejudge.uri1068;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kevin URI Online Judge | 1068 Parenthesis Balance I
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader stream = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(stream);
		String str;
		while ((str = reader.readLine()) != null) {
			int opening = 0;
			int closing = 0;
			for (int i = 0; i < str.length(); ++i) {
				char current = str.charAt(i);
				if (current == '(') {
					++opening;
				} else if (current == ')') {
					++closing;
					if (closing > opening) {
						break;
					}
				}
			}
			if (opening == closing) {
				System.out.println("correct");
			} else {
				System.out.println("incorrect");
			}
		}
	}

}
