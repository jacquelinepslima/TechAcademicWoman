package exercicio.uri.valquiria_matter;

import java.util.Scanner;

public class Ex1116 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int qtd = sc.nextInt();

            for (int i= 0; i< qtd; i++){
                double a = sc.nextDouble();
                double b = sc.nextDouble();

                if(b == 0)
                    System.out.println("divisao impossivel");
                else
                    System.out.printf("%.1f",(double) a/b);
            }
        }
    }


