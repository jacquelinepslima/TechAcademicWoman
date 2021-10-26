package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {

        Scanner calculo = new Scanner (System.in);

        int A = calculo.nextInt();
        int B = calculo.nextInt();
        int C = calculo.nextInt();
        int D = calculo.nextInt();
        int DIFERENCA = (A * B)-(C * D);

        System.out.println("DIFERENCA = " + DIFERENCA);


        calculo.close();

    }
}
