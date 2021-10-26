package exercicio.uri.paula_santos;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ex1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        double a, b, c;
         ArrayList<Double> mediaP = new ArrayList<Double>();

        for (int i = 0; i < N; i++) {
            a = scan.nextDouble();
            b = scan.nextDouble();
            c = scan.nextDouble();

            mediaP.add(((a * 2) + (b * 3) + (c * 5)) / 10);
        }

        for (int i = 0; i < mediaP.size(); i++) {
            System.out.printf("%.1f%n", mediaP.get(i));
        }
        scan.close();
    }
}
