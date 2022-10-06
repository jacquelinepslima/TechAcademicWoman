package exercicio.uri.ana_caroline.util;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresCumulativos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minUtilizados = sc.nextInt();
        double conta = 50.0;

        if(minUtilizados > 100){
            conta += (minUtilizados - 100) * 2.0;
        }

        System.out.printf("Valor final da conta: R$ %.2f", conta);

        sc.close();
    }
}
