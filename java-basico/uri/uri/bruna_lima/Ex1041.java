package exercicio.uri.bruna_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex1041 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double x = entrada.nextDouble();
        double y = entrada.nextDouble();

        if(x == 0 && y == 0)
            System.out.println("Origem");
        else if(y == 0 && x != 0)
            System.out.println("Eixo X");
        else if(x == 0 && y != 0)
            System.out.println("Eixo Y");
        else if(x > 0 && y > 0)
            System.out.println("Q1");
        else if(x < 0 && y > 0)
            System.out.println("Q2");
        else if(x < 0 && y < 0)
            System.out.println("Q3");
        else if(x > 0 && y < 0)
            System.out.println("Q4");
    }
}
