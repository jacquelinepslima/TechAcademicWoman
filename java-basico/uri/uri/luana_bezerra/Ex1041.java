package exercicio.uri.luana_bezerra;

import java.util.Locale;
import java.util.Scanner;

public class Ex1041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double X = scanner.nextDouble();
        double Y = scanner.nextDouble();

        if (X>=0 && Y>=0){
            System.out.println("Q1");
        }
        else if (X<=0 && Y>=0){
            System.out.println("Q2");
        }
        else if (X<=0 && Y<=0){
            System.out.println("Q3");
        }
        else if (X>=0 && Y<=0) {
            System.out.println("Q4");
        }
        else if (X==0 && Y==0){
            System.out.println("Origem");
        }
        scanner.close();
    }
}
