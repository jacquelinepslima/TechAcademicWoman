package exercicio.uri.inajara_pereira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1041 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if(x > 0 && y > 0){
            System.out.println("Q1");

        } else if (x < 0 && y > 0){
            System.out.println("Q2");

        } else if (x < 0 && y < 0){
            System.out.println("Q3");

        } else if (x > 0 && y <0){
            System.out.println("Q4");

        } else if (x == 0){
            System.out.println("Eixo Y");

        } else if (y == 0){
            System.out.println("Eixo X");

        } else if (x == 0.0 && y == 0.0){
            System.out.println("Origem");
        }
        sc.close();
    }
}
