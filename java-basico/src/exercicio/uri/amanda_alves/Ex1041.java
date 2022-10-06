package exercicio.uri.amanda_alves;

import java.util.Locale;
import java.util.Scanner;

public class Ex1041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);

        double valorX = scanner.nextDouble();
        double valorY = scanner.nextDouble();

        if (valorX == 0 && valorY == 0){
            System.out.println("ORIGEM");
        }else if (valorX == 0){
            System.out.println("Eixo X");
        }else if (valorY == 0){
            System.out.println("Eixo Y");
        }else if (valorX > 0 && valorY > 0){
            System.out.println("Q1");
        }else if (valorX < 0 && valorY > 0){
            System.out.println("Q2");
        }else if (valorX < 0 && valorY < 0){
            System.out.println("Q3");
        }else if (valorX > 0 && valorY < 0){
            System.out.println("Q4");
        }
    }
}
