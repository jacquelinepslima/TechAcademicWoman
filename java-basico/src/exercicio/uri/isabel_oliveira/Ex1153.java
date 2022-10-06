package exercicio.uri.isabel_oliveira;

import java.util.Scanner;

public class Ex1153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int resultado = 1;

        for (int i = 0; i < numero; i++){
            resultado *= (numero - i) ;
        }
        System.out.println(resultado);
    }
}
