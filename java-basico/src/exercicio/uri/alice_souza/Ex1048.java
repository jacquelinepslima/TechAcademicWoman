package exercicio.uri.alice_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double salario = scan.nextDouble();
        double reajuste, percentual, novoSalario;

        if(salario<=400.00){
            percentual = 15;
        }else if (salario<=800.00){
            percentual = 12;
        }else if (salario<=1200.00){
            percentual = 10;
        }else if (salario<=2000.00){
            percentual = 7;
        }else {
            percentual = 4;
        }
        novoSalario = salario + salario*percentual/100;
        reajuste = novoSalario - salario;
        System.out.printf("Novo salario: %.2f%n",novoSalario );
        System.out.printf("Reajuste ganho: %.2f%n",reajuste );
        System.out.printf("Em percentual: %.0f %% %n",percentual );
        scan.close();
    }
}
