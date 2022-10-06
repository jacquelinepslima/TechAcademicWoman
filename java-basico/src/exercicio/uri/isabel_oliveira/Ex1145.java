package exercicio.uri.isabel_oliveira;

import java.util.Scanner;

public class Ex1145 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtd = scanner.nextInt();
        int numeroFinal = scanner.nextInt();
        String resultado = "";

        for(int i = 1; i <= numeroFinal; i++){
            if (i != numeroFinal){
            resultado += i + " ";}
            else{
                resultado += i;
            }


            if (i % qtd == 0){
                resultado += "\n";
            }
        }

        System.out.println(resultado);


    }
}
