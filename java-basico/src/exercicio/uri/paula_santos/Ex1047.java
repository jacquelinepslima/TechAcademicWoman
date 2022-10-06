package exercicio.uri.paula_santos;

import java.util.Scanner;

public class Ex1047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int minutoInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int minutoFinal = scanner.nextInt();

        int totalMinutosIncial = (60 * horaInicial) + minutoInicial;
        int totalMinutosFinal = (60 * horaFinal) + minutoFinal;
        int duracao = 0;
        int horaDuracao = 0;
        int minutoDuracao = 0;

        if (totalMinutosIncial < totalMinutosFinal){
            duracao = totalMinutosFinal - totalMinutosIncial;
            horaDuracao = duracao/60;
            minutoDuracao = duracao%60;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", horaDuracao, minutoDuracao);
        }
        else{
            duracao = ((totalMinutosIncial - totalMinutosFinal) + 1440);
            horaDuracao = duracao/60;
            minutoDuracao = duracao%60;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", horaDuracao, minutoDuracao);
        }
        scanner.close();
    }
}