package exercicio.uri.ana_cruz;

import java.util.Locale;
import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        double salFun, novoSalario, ganhoReajuste;
        int percentual;

        salFun = scanner.nextDouble();

        if ((salFun >= 0) && (salFun <= 400.00)){
            percentual = 15;
            ganhoReajuste = salFun * 0.15;
            novoSalario = salFun + ganhoReajuste;
        } else if ((salFun >= 400.01) && (salFun <= 800.00)) {
            percentual = 12;
            ganhoReajuste = salFun * 0.12;
            novoSalario = salFun + ganhoReajuste;
        } else if ((salFun >= 800.01) && (salFun <= 1200.00)) {
            percentual = 10;
            ganhoReajuste = salFun * 0.10;
            novoSalario = salFun + ganhoReajuste;
        } else if ((salFun >= 1200.01) && (salFun <= 2000.00)) {
            percentual = 7;
            ganhoReajuste = salFun * 0.07;
            novoSalario = salFun + ganhoReajuste;
        } else {
            percentual = 4;
            ganhoReajuste = salFun * 0.04;
            novoSalario = salFun + ganhoReajuste;
        }

        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", ganhoReajuste);
        System.out.printf("Em percentual: %d %%", percentual);

        scanner.close();
    }
}
