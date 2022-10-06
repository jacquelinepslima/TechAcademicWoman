package exercicio.uri.bruna_lima;

import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int hr, min, seg, restoDivisao = 0;

        int n = entrada.nextInt();

        hr = n / 3600;

        min = restoDivisao / 60;
        seg = restoDivisao % 60;

        entrada.close();
    }
}
