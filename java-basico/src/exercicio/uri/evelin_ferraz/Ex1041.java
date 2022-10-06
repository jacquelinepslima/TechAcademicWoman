package exercicio.uri.evelin_ferraz;

import java.util.Locale;
import java.util.Scanner;

public class Ex1041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        float x, y, res;

        x = scanner.nextFloat();
        y = scanner.nextFloat();

        if (x > 0.0 && y > 0.0){
            System.out.println("Q1");
        } else if (x > 0.0 && y < 0.0){
            System.out.println("Q4");
        } else if (x < 0.0 && y < 0.0){
            System.out.println("Q3");
        } else if (x < 0.0 && y > 0.0){
            System.out.println("Q2");
        } else {
            System.out.println("Origem");
        }

        scanner.close();
    }
}
