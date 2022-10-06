package exercicio.uri.evelin_ferraz;
import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Distância em Km: ");
        int distancia = sc.nextInt();

        int minutos = distancia * 2;

        System.out.printf("%d minutos.", minutos);

        sc.close();
    }
}
