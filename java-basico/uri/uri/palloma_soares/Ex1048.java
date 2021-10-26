package exercicio.uri.palloma_soares;

import java.util.Locale;
import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, novoSalario, reajuste;
        int percentual;

        salario = sc.nextDouble();

        if(salario <= 400.00){
            percentual = 15;
        } else if (salario <= 800.00){
            percentual = 12;
        } else if (salario <= 1200.00){
            percentual = 10;
        } else if (salario <= 2000.00){
            percentual = 7;
        } else {
            percentual = 4;
        }

        reajuste = salario * percentual/100;
        novoSalario = salario + reajuste;

        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.printf("Em percentual: %d%%%n", percentual);

        sc.close();
    }
}
