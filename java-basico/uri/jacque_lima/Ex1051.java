package exercicio.uri.jacque_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex1051 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double din = sc.nextDouble();

        if(din <= 2000.0){
            System.out.printf("Isento");
        }else if(din <= 3000.0){
            System.out.printf("R$ %.2f", (din - 2000) * 0.08);
        }else if(din <= 4500.0){
            System.out.printf("R$ %.2f", (1000 * 0.08) + (din - 3000) * 0.18);
        }else{
            System.out.printf("R$ %.2f ", (1000 * 0.08) + (1500 * 0.18) + (din - 4500) * 0.28);
        }

        sc.close();
    }
}