package exercicio.uri.ambrosia_andrade;

import java.util.Locale;
import java.util.Scanner;

public class Ex1051 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();

        if(salario <= 2000)
            System.out.println("Isento");
        else if (salario > 2000.0 && salario <= 3000.0)
            System.out.println("R$ " + ((salario-2000.0)*0.08));
        else if (salario > 3000.0 && salario <= 4500.0)
            System.out.println("R$ " + ((1000.0*0.08)+((salario-3000.0)*0.18)));
        else
            System.out.println("R$ " + ((1000.0*0.08)+(1500.0*0.18)+((salario-4500.0)*0.28)));

        scanner.close();
    }
}
