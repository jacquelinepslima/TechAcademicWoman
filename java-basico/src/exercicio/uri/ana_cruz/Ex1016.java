package exercicio.uri.ana_cruz;

import java.util.Scanner;

public class Ex1016 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();

        int tempo = 2*distancia; // 1km - 2min, assim o tempo, em minutos, é o dobro da distancia

        System.out.println(tempo + " minutos");

        scanner.close();
    }
}
