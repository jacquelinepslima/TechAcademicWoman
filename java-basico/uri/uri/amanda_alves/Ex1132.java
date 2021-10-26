package exercicio.uri.amanda_alves;

import java.util.Scanner;

public class Ex1132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();;
        int y = scanner.nextInt();

        int resultado = 0;

        for (int i = x; i < y+1  ; i++){
            if (i % 13 != 0){
                resultado = resultado + i;
            }
        }
        System.out.println(resultado);
    }
}
