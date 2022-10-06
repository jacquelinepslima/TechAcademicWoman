package exercicio.uri.luana_bezerra;

import java.util.Locale;
import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner aumento = new Scanner(System.in);

        double sal = aumento.nextDouble();
        int percent = 0;

        if(sal >= 0 && sal <= 400){
            percent = 15;
        }
        else if(sal > 400 && sal <= 800){
            percent = 12;
        }
        else if(sal > 800 && sal <= 1200){
            percent = 10;
        }
        else if(sal > 1200 && sal <= 2000){
            percent = 7;
        }
        else {
            percent = 4;
        }

        double reajuste = sal * percent / 100;
        double novoSal = reajuste + sal;

        System.out.printf("Novo salario: %.2f%n", novoSal);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.printf("Em percentual: %d %%", percent);

        aumento.close();
    }
}
