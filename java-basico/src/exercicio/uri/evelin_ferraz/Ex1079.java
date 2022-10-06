package exercicio.uri.evelin_ferraz;

import java.util.Locale;
import java.util.Scanner;

public class Ex1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int N;
        float a, b, c, mediaPonderada;

        N = scanner.nextInt();

        for(int i = 0; i < N; i++){
            a = scanner.nextFloat();
            b = scanner.nextFloat();
            c = scanner.nextFloat();
            mediaPonderada = ((a*2)+(b*3)+(c*5))/10;
            System.out.printf("%.1f%n", mediaPonderada);
        }

        scanner.close();
    }
}
