package exercicio.uri.paula_santos;

import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        double R1 = (-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
        double R2 = (-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a);

        if (a == 0 || R1 <= 0 || R2 <= 0){
        System.out.println("Impossivel calcular");}
        else {
        System.out.printf("R1 = %.5f %n", R1);
        System.out.printf("R2 = %.5f %n", R2);}
        sc.close();
    }
}
