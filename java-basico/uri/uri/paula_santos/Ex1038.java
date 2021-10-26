package exercicio.uri.paula_santos;

import java.util.Locale;
import java.util.Scanner;

public class Ex1038 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner lanche = new Scanner(System.in);

        int cod = lanche.nextInt();
        int quant = lanche.nextInt();
        double preco = 0;

        switch(cod){

            case 1: preco = 4.00;
                break;

            case 2: preco = 4.50;
                break;

            case 3: preco = 5.00;
                break;

            case 4: preco = 2.00;
                break;

            case 5: preco = 1.50;
                break;

            default: {
                System.out.println("Opção inválida");
            }
        }
        double total = preco * quant;
        System.out.printf("Total: R$ %.2f", total);

        lanche.close();
    }
}
