package exercicio.uri.inajara_pereira;

import java.util.Scanner;

public class Ex1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String descricao1 = sc.next();
        int dia1 = sc.nextInt();
        int hora1 = sc.nextInt();
        String entrada1 = sc.next();
        int minuto1 = sc.nextInt();
        String entrada2 = sc.next();
        int segundo1 = sc.nextInt();

        String descricao2 = sc.next();
        int dia2 = sc.nextInt();
        int hora2 = sc.nextInt();
        String entrada3 = sc.next();
        int minuto2 = sc.nextInt();
        String entrada4 = sc.next();
        int segundo2 = sc.nextInt();

        int inicio = (dia1 - 1) * 24 * 60 * 60 + hora1 * 60 * 60 + minuto1 * 60 + segundo1;
        int fim = (dia2 - 1) * 24 * 60 * 60 + hora2 * 60 * 60 + minuto2 * 60 + segundo2;
        int duracao = fim - inicio;

        int w = duracao / (24 * 60 * 60);
        int resto = duracao % (24 * 60 * 60);
        int x = resto / (60 * 60);
        resto = resto % (60 * 60);
        int y = resto / 60;
        int z = resto % 60;

        System.out.println(w + " dia(s)");
        System.out.println(x + " hora(s)");
        System.out.println(y + " minuto(s)");
        System.out.println(z + " segundo(s)");

        sc.close();

    }
}
