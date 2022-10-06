package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1003 {
    public static void main(String[] args) {

        Scanner calculo = new Scanner (System.in);

        int A = calculo.nextInt();
        int B = calculo.nextInt();
        int soma = A + B;

        System.out.println("SOMA = " + soma);


        calculo.close();

    }
}
