package exercicio.uri.valquiria_matter;

import java.util.Scanner;

public class Ex1007 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número 1");
        int a = scan.nextInt();

        System.out.println("Digite o número 2");
        int b = scan.nextInt();

        System.out.println("Digite o número 3");
        int c = scan.nextInt();

        System.out.println("Digite o número 4");
        int d = scan.nextInt();

        double diferenca = (a * b - c * d);

        System.out.println("DIFERENÇA: " + diferenca);

        scan.close();


    }

}
