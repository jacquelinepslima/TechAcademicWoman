package exercicio.uri.maressa_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double raio,volumeEsfera;
        Scanner sc=new Scanner(System.in);
        raio=sc.nextDouble();
        sc.close();
        volumeEsfera=(double)(4/3.0)*3.14159*Math.pow(raio,3);
        System.out.printf("VOLUME = %.3f",volumeEsfera);
    }
}
