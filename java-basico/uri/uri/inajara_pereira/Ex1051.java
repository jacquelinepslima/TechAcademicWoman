package exercicio.uri.inajara_pereira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1051 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double totImposto;

        if(salario <= 2000.00){
            System.out.println("Isento");

        } else if(salario > 2000.00 && salario <= 3000.00){
            totImposto = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f", totImposto);

        } else if(salario > 3000.00 && salario <= 4500.00){
            totImposto = 1000.00 * 0.08 + (salario - 3000.00) * 0.18;
            System.out.printf("R$ %.2f", totImposto);

        } else if(salario > 4500.00){
            totImposto = 1000.00 * 0.08 + (salario - 3000.00) * 0.18 + (salario - 4500.00) * 0.28;;
            System.out.printf("R$ %.2f", totImposto);
        }

        sc.close();
    }
}
