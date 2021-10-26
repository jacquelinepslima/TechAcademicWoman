package exercicio.uri.jacque_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double reajuste;

        if(salario <= 400.0){
            reajuste = 15.0;
        }else if(salario <= 800.0){
            reajuste = 12.0;
        }else if(salario <= 1200.0){
            reajuste = 10.0;
        }else if(salario <= 2000.0){
            reajuste = 7.0;
        }else{
            reajuste = 4.0;
        }
        double reajusteSalarial = salario * reajuste / 100.0;
        double novoSalario = salario + reajuste;


        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajusteSalarial);
        System.out.printf("Em percentual: %.2f", reajuste);


        sc.close();
    }
}

