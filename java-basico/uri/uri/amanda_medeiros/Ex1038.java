package exercicio.uri.amanda_medeiros;

import java.util.Locale;
import java.util.Scanner;

public class Ex1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();
        double valor = 0;

        if (codigo <= 0 || codigo > 5){
            System.out.println("Código inválido");
        }
        else if (codigo == 1){
            valor = 4.00;
        }
        else if (codigo == 2){
            valor = 4.50;
        }
        else if (codigo == 3){
            valor = 5.0;
        }
        else if( codigo == 4){
            valor = 2;
        }
        else{
            valor = 1.50;
        }

        System.out.printf("Total: R$ %.2f", valor * quantidade);


        scanner.close();
    }
}
