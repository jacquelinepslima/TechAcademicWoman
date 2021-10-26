package exercicio.uri.giovanna_santana;

import java.util.Locale;
import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double salarioAtual, reajuste;

        if (salario < 400.01){
            reajuste = salario * 0.15;
            salarioAtual = reajuste + salario;
            System.out.printf("Novo salario: %.2f%n", salarioAtual);
            System.out.printf("Reajuste de ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 15%");
        }else if(salario < 800.01 ){
            reajuste = salario * 0.12;
            salarioAtual = reajuste + salario;
            System.out.printf("Novo salario: %.2f%n", salarioAtual);
            System.out.printf("Reajuste de ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 12%");
        }else if (salario < 1200.01) {
            reajuste = salario * 0.10;
            salarioAtual = reajuste + salario;
            System.out.printf("Novo salario: %.2f%n", salarioAtual);
            System.out.printf("Reajuste de ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 10%");
        }else if (salario < 2000.001){
            reajuste = salario * 0.07;
            salarioAtual = reajuste + salario;
            System.out.printf("Novo salario: %.2f%n", salarioAtual);
            System.out.printf("Reajuste de ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 7%");
        } else {
            reajuste = salario * 0.04;
            salarioAtual = reajuste + salario;
            System.out.printf("Novo salario: %.2f%n", salarioAtual);
            System.out.printf("Reajuste de ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 4%");
        }
    }
}
