package exercicio.revisao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_resolvido_04 {

    // Criar algoritmo que leia 3 numeros inteiros
    // apresentar o menor entre os digitados
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt(); // 1
        int numero2 = scanner.nextInt(); // 2
        int numero3 = scanner.nextInt(); // 3

        //     1        2          1         3
        if (numero1 < numero2 && numero1 < numero3) {
            System.out.printf("O menor numero é:  %d", numero1);
        }else if(numero2 < numero3) {
            System.out.printf("O menor numero é:  %d", numero2);
        }else{
            System.out.printf("O menor numero é:  %d", numero3);
        }

        scanner.close();
    }
}

