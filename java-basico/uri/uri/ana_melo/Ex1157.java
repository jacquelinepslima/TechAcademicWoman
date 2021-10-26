package exercicio.uri.ana_melo;

import java.util.Scanner;

public class Ex1157 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in) ;

        int n = entrada.nextInt();

        for(int i = 1; i <= n; i++) {
            if(n%i == 0)
                System.out.println(i);
        }
    }
}
