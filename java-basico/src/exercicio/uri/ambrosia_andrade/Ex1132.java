package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X, Y, calc = 0, maior, menor;

        X = scanner.nextInt();
        Y = scanner.nextInt();

        maior = X > Y ? X : Y;
        menor = X < Y ? X : Y;

        for(int i = menor; i <= maior; i++){
            if (i % 13 != 0) {
                calc += i;
            }
        }

        System.out.println(calc);

        scanner.close();
    }
}
