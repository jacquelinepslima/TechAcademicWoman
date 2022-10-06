package exercicio.uri.maressa_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String nomeFuncionario;
        double salarioFixo,MontanteVendas,totalSalario;
        Scanner sc=new Scanner(System.in);
        nomeFuncionario=sc.next();
        salarioFixo=sc.nextDouble();
        MontanteVendas=sc.nextDouble();
        sc.close();
        totalSalario=salarioFixo +(MontanteVendas*0.15);
        System.out.printf("TOTAL = R$ %.2f%n",totalSalario);
    }
}
