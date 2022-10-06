package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args){
        int distancia;
        float totalCombustivel, distanciaMedia;

        Scanner scanner = new Scanner(System.in);

        distancia = scanner.nextInt();
        totalCombustivel = scanner.nextFloat();

        distanciaMedia = distancia/totalCombustivel;

        System.out.printf("%.3f km/l", distanciaMedia);

        scanner.close();
    }
}
