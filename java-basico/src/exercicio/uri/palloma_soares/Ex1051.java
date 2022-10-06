package exercicio.uri.palloma_soares;

import java.util.Locale;
import java.util.Scanner;

public class Ex1051 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, calcIR=0.0;
        salario = sc.nextDouble();

        if(salario<=2000.00){
            System.out.println("Isento");
        }
        else if(salario<=3000.00){
            calcIR = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f%n",calcIR);
        }
        else if(salario<=4500.00){
            calcIR = ((salario - 3000.00) * 0.18) + (1000.00 * 0.08);
            System.out.printf("R$ %.2f%n",calcIR);
        }
        else{
            calcIR = ((salario - 4500.00) * 0.28) + (1500.00 * 0.18) + (1000.00 * 0.08);
            System.out.printf("R$ %.2f%n",calcIR);
        }

        sc.close();
    }
}
