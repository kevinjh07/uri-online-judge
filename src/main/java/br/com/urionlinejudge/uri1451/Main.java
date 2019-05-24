package br.com.urionlinejudge.uri1451;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kevin URI Online Judge | 1451 Broken Keyboard
 *
 */
public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(stream);
        String str;
        while ((str = reader.readLine()) != null) {
            StringBuilder builder = new StringBuilder();
            boolean beiju = false;
            int indice = 0;
            for (int i = 0; i < str.length(); ++i) {
                char texto = str.charAt(i);
                switch (texto) {
                    case '[':
                        beiju = true;
                        indice = 0;
                        break;
                    case ']':
                        beiju = false;
                        break;
                    default:
                        if (beiju) {
                            builder.insert(indice++, texto);
                        } else {
                            builder.append(texto);
                        }
                        break;
                }
            }
            System.out.println(builder.toString());
        }
    }

}
