package exercicio.uri.isabel_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int distanciaTotal;
        double totalCombustivel;
        Scanner sc=new Scanner(System.in);
        distanciaTotal=sc.nextInt();
        totalCombustivel=sc.nextDouble();
        sc.close();
        System.out.printf("%.3f km/l %n",distanciaTotal/totalCombustivel);
    }
}
