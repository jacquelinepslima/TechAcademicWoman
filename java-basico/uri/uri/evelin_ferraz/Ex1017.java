package exercicio.uri.evelin_ferraz;
import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Tempo gasto na viagem: H");
        int tempo = sc.nextInt();

        System.out.println("Velocidade média atingida: Km");
        int vel = sc.nextInt();

        float valorFinal = (float) tempo * vel / 12;

        System.out.printf("%.3f", valorFinal);
        sc.close();
    }
}
