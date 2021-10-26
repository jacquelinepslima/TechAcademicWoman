package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex1061 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dia ");
        int diaInicio = scan.nextInt();
        double hInicio = (double)scan.nextInt();
        char ponto = scan.next().charAt(0);
        double mInicio = (double)scan.nextInt();
        ponto = scan.next().charAt(0);
        double sInicio = (double)scan.nextInt();
        System.out.print("Dia ");
        int diaFinal = scan.nextInt();
        double hFinal = (double)scan.nextInt();
        ponto = scan.next().charAt(0);
        double mFinal = (double)scan.nextInt();
        ponto = scan.next().charAt(0);
        double sFinal = (double)scan.nextInt();
        int dias = diaFinal - diaInicio;
        double horas = (hFinal - hInicio) / 24.0D;
        double minutos = (mFinal - mInicio) / 1440.0D;
        double segundos = (sFinal - sInicio) / 86400.0D;
        double duracao = (double)dias + horas + minutos + segundos;
        int rDia = (int)duracao;
        double resto = duracao - (double)rDia;
        int rHora = (int)(resto * 24.0D);
        resto -= (double)rHora / 24.0D;
        int rMinuto = (int)Math.round(resto * 1440.0D);
        resto -= (double)rMinuto / 1440.0D;
        int rSegundo = (int)(resto * 86400.0D);
        System.out.println(rDia + " dia(s)");
        System.out.println(rHora + " hora(s)");
        System.out.println(rMinuto + " minuto(s)");
        System.out.println(rSegundo + " segundo(s)");
        scan.close();
    }

}
