package exercicio.uri.paula_santos;

import java.util.Locale;
import java.util.Scanner;

public class Ex1051 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner imposto = new Scanner(System.in);

        double sal = imposto.nextDouble();
        double impostoTotal = 0;
        double imposto2 = 0.08;
        double imposto3 = 0.18;
        double imposto4 = 0.28;

        if(sal >= 0.00 && sal <= 2000.00){
            System.out.println("Isento");
        }

        else if(sal >= 2000.01 && sal <= 3000.00){
            impostoTotal = (sal - 2000.00) * imposto2;
            System.out.printf("R$ %.2f", impostoTotal);
        }

        else if(sal >= 3000.01 && sal <= 4500.00){
            impostoTotal = (1000.00 * imposto2) + ((sal - 3000.00) * imposto3);
            System.out.printf("R$ %.2f", impostoTotal);
        }

        else if(sal > 4500.00){
            impostoTotal = (1000.00*imposto2) + (1500.00*imposto3) + ((sal - 4500.00) * imposto4);
            System.out.printf("R$ %.2f", impostoTotal);
        }

        imposto.close();
    }
}
