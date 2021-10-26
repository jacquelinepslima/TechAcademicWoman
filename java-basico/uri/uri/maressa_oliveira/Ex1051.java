package exercicio.uri.maressa_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1051 {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner scanner = new Scanner(System.in);

            double franquia1 = 2000.00;
            double franquia2 = 3000.00;
            double franquia3 = 4500.00;

            double salario = 0, imposto = 0;
            salario=scanner.nextDouble();

            if(salario<=2000.00){
                System.out.println("Isento");

            }else if((salario>=2000.01) && (salario<=3000.00)){

                imposto = (salario - 2000.00) * 0.08;
                System.out.printf("R$: %.2f%n", imposto);

            }else if((salario>=3000.01)&&(salario<=4500.00)){

                imposto = (1000.00 * 0.08) + ((salario - 3000.00) * 0.18);
                System.out.printf("R$: %.2f%n", imposto);

            }else if(salario>4500.00){

                imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salario - 4500.00) * 0.28);
                System.out.printf("R$: %.2f%n", imposto);
            }



    }

}
