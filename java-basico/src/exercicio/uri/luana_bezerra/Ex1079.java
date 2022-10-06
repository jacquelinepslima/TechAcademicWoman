package exercicio.uri.luana_bezerra;

import java.util.Locale;
import java.util.Scanner;

public class Ex1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner exercicio = new Scanner(System.in);

        int n = exercicio.nextInt();
        int x;
        float n1 = 0, n2 = 0, n3 = 0, media;

        for(x = 0; x < n+1; x++){
            n1 = exercicio.nextFloat();
            n2 = exercicio.nextFloat();
            n3 = exercicio.nextFloat();
            media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;

            System.out.printf("%.1f%n", media);
        }

        exercicio.close();
    }
}
