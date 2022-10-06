package exercicio.uri.maressa_oliveira;

import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) {
        int km,min;
        Scanner carros = new Scanner(System.in);
        km=carros.nextInt();
        min=km*2;
        System.out.printf("%d minutos%n",min);
        carros.close();
    }
}
