package exercicio.uri.amanda_alves;

import java.util.Locale;
import java.util.Scanner;

public class Ex1116 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        Scanner scanner = new Scanner(System.in);

        int quantidadePares = scanner.nextInt();

        for (int i = 0; i < quantidadePares; i ++ ){

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (y == 0){
                System.out.println("divisao impossivel");
            }else{
                double resultado = (double) x / y;
                System.out.println(resultado);
            }
        }

    }
}
