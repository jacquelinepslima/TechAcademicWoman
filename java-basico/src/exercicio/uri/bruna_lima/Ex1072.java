package exercicio.uri.bruna_lima;

import java.util.Scanner;

public class Ex1072 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int x, in = 0, out = 0;

        for (int i = 0; i < n; i++) {
            x = entrada.nextInt();

            if(x >= 10 && x <= 20)
                in += 1;
            else
                out += 1;
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
