package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) {

        Scanner carro = new Scanner(System.in);

        int distancia = carro.nextInt();

        //1 km a cada 2 minutos
        int tempo = distancia*2;

        System.out.println(tempo + " minutos");

        carro.close();
    }
}
