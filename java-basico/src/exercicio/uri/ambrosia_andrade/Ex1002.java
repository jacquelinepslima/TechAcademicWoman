package exercicio.uri.ambrosia_andrade;

import java.util.Locale;
import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // double pi = 3.14159;

        System.out.print("Digite o valor do raio (Duas casas decimais): ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        // Obs: A documentação recomenda para que uma nova linha seja %n ao invés do \n
        System.out.printf("A=%.4f%n", area);

        scanner.close();
    }
}
