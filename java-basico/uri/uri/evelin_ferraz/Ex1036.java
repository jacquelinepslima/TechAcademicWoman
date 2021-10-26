package exercicio.uri.evelin_ferraz;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, C, D, R1, R2;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        D = Math.pow(B, 2) - 4 * A * C;
        R1 = (-B + Math.sqrt(D)) / (2 * A);
        R2 = (-B - Math.sqrt(D)) / (2 * A);

        if (A <= 0.0 || B <= 0.0 || C <= 0.0 || D <= 0.0) {
            System.out.println("Impossível calcular!");
        }else {
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f", R2);
        }

        sc.close();
    }
}
