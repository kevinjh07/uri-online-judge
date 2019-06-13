package br.com.urionlinejudge.uri2807.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * URI Online Judge | 2807 Iccanobif
 */
public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(stream);
        int value = Integer.parseInt(reader.readLine());
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        int a = 1;
        int b = 1;
        int soma = 0;
        for (int i = 0; i < value - 1; ++i) {
            stack.push(b);
            soma = a + b;
            a = b;
            b = soma;
        }
        StringBuilder builder = new StringBuilder();
        while (stack.size() > 1) {
            builder.append(stack.pop()).append(" ");
        }
        builder.append(stack.pop());
        System.out.println(builder.toString());
    }

}
