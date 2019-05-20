package br.com.urionlinejudge.uri1068;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

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
			Stack<String> stack = new Stack<>();
			for (int i = 0; i < str.length(); i++) {
				String current = String.valueOf(str.charAt(i));
				if (current.equals("(")) {
					stack.push(current);
				} else if (current.equals(")")) {
					if (stack.isEmpty()) {
						stack.push(current);
						break;
					}
					stack.pop();
				}
			}
			if (stack.isEmpty()) {
				System.out.println("correct");
			} else {
				System.out.println("incorrect");
			}
		}
	}

}
