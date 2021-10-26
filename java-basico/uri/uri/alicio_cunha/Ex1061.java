package exercicio.uri.alicio_cunha;

import java.util.Scanner;

public class Ex1061 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int diaInicio, diaFim, horaInicio, horaFim, minInicio, minFim, segInicio, segFim, t1, t2, duracao, restoDivisao;
        int qntDias, qntHoras, qntMin, qntSeg;
        diaInicio = sc.nextInt();
        horaInicio = sc.nextInt();
        minInicio = sc.nextInt();
        segInicio = sc.nextInt();

        diaFim = sc.nextInt();
        horaFim = sc.nextInt();
        minFim= sc.nextInt();
        segFim = sc.nextInt();

        t1 = segInicio +  minInicio * 60 + horaInicio * 3600 + diaInicio * 3600 * 24;
        t2 = segFim +  minFim * 60 + horaFim * 3600 + diaFim * 3600 * 24;

        duracao = t2 - t1;

        qntDias = duracao / 86400;
        restoDivisao = duracao % 86400;

        qntHoras = restoDivisao / 3600;
        restoDivisao = restoDivisao % 3600;

        qntMin = restoDivisao / 60;
        restoDivisao = restoDivisao % 60; //qnt de segundos

        System.out.printf("%d dia(s) %n", qntDias);
        System.out.printf("%d hora(s) %n", qntHoras);
        System.out.printf("%d minuto(s) %n", qntMin);
        System.out.printf("%d segundo(s) %n", restoDivisao);




        sc.close();

    }
}
