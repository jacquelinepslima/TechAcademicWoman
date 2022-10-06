package exercicio.uri.amanda_medeiros;

import java.util.Scanner;

public class Ex1074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        String resposta = "";

        for (int i = 0; i < numero; i++){
            int newNumber = scanner.nextInt();
            if(newNumber == 0){
                resposta += "NULL\n";
            }
            else if (newNumber > 0 && newNumber % 2 == 0){
                resposta += "EVEN POSITIVE\n";
            }
            else if(newNumber > 0 && newNumber % 2 != 0){
                resposta += "ODD POSITIVE\n";
            }
            else if (newNumber < 0 && newNumber % 2 == 0){
                resposta += "EVEN NEGATIVE\n";
            }
            else if(newNumber < 0 && newNumber % 2 != 0){
                resposta += "ODD NEGATIVE\n";
            }
        }
        System.out.println(resposta);
    }
}
