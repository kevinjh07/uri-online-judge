package br.com.urionlinejudge.uri2807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * URI Online Judge | 2807 Iccanobif
 */
public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(stream);
        int value = Integer.parseInt(reader.readLine());
        int[] array = new int[value];
        array[0] = 1;
        int a = 1;
        int b = 1;
        int sum;
        for (int i = 1; i < value; ++i) {
            array[i] = b;
            sum = a + b;
            a = b;
            b = sum;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = --value; i > 0; --i) {
            builder.append(array[i]).append(" ");
        }
        builder.append(array[0]);
        System.out.println(builder.toString());
    }

}
