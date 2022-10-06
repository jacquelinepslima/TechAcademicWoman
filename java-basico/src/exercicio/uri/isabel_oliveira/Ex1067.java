package exercicio.uri.isabel_oliveira;

import java.util.Scanner;

public class Ex1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        for (int i = 0; i < numero; i++){
            if ((numero -i) % 2 == 1){
            System.out.println(numero - i);}
        }



        scanner.close();
    }
}
