package exercicio.uri.ana_caroline;

import java.util.Locale;
import java.util.Scanner;

public class Ex1038 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod = sc.nextInt();
        int qnt = sc.nextInt();

        //preços
        double cachorroQuente = 4.0; //cod 1
        double xSalada = 4.50; //cod 2
        double xBacon = 5.0;  //cod 3
        double torrada = 2.0; //cod 4
        double refri = 1.5;  //5

        double total;
        switch (cod){
            case 1:
                total = qnt * cachorroQuente;
                break;
            case 2:
                total = qnt * xSalada;
                break;
            case 3:
                total = qnt * xBacon;
                break;
            case 4:
                total = qnt * torrada;
                break;
            case 5:
                total = qnt * refri;
                break;
            default:
               total = 0;
        }

        System.out.printf("Total: R$ %.2f", total);


        sc.close();
    }
}
