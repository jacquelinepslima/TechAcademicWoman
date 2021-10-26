package exercicio.uri.isabel_oliveira.util;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresCumulativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int minutosUtilizados;
        double valorPlano;
        Scanner sc=new Scanner(System.in);
        minutosUtilizados=sc.nextInt();
        sc.close();
        valorPlano=50;
        valorPlano+=(minutosUtilizados-100)*2.0;
        System.out.printf("Valor final da conta = R$ %.2f", valorPlano);
    }
}
