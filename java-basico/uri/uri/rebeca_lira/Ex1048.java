package exercicio.uri.rebeca_lira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();

        double percentual = 0.0;
        double salarioNovo;
        double reajuste = 0.0;
        double valorReajuste;

        if (salario <= 400.00){
            percentual = 15;
            reajuste = 0.15;
        }
        else if (salario >400.00 && salario <= 800.00){
            percentual= 12;
            reajuste = 0.12;
        }
        else if (salario > 800.00 && salario <= 1200.00){
            percentual= 10;
            reajuste = 0.10;
        }
        else if (salario >1200.00 && salario <= 2000.00){
            percentual= 7;
            reajuste = 0.07;
        }
        else if (salario >2000.00){
            percentual= 4;
            reajuste = 0.04;
        }

        valorReajuste = reajuste*salario;
        salarioNovo = valorReajuste+salario;



        System.out.printf("Novo salario: %.2f%n", salarioNovo);
        System.out.printf("Reajuste ganho: %.2f%n", valorReajuste);
        System.out.printf("Em percentual: %n",percentual, "%%");

        sc.close();
    }
}
