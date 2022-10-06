package exercicio.uri.isabel_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1116 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int [] valores = new int[2];

        String resultado = "";


        for (int i = 0; i < numero; i++){
            valores[0] = scanner.nextInt();
            valores[1] = scanner.nextInt();

            double divisao = (double) valores[0] / valores[1];
            if(valores[1] == 0){
                resultado += "divisao impossivel \n";
            }
            else{
            resultado += divisao + "\n";}


        }
        System.out.println(resultado);
    }

}
