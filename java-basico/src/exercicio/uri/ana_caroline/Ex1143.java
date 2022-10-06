package exercicio.uri.ana_caroline;

import java.util.Scanner;

public class Ex1143 {
    public static void main(String[] args) {
        Scanner exercicio = new Scanner(System.in);

        int N = exercicio.nextInt();
        int x;
        int primeiraMult;
        int mult;

        for(x = 1; x < N + 1; x++){
            primeiraMult = x*x;
            mult = primeiraMult * x;

            System.out.println(x + " " + primeiraMult + " " + mult);
        }

        exercicio.close();
    }
}
