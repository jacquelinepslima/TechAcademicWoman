package exercicio.uri.isabel_oliveira;

import java.util.Scanner;

public class Ex1143 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        
        for(int i = 0; i < numero; i++){
            int numeroAtual = i + 1;
            int segundoNumero = numeroAtual * numeroAtual;
            int terceiroNumero = segundoNumero * numeroAtual;

            System.out.println(numeroAtual + " " + segundoNumero + " " + terceiroNumero);
        }
    }
}
