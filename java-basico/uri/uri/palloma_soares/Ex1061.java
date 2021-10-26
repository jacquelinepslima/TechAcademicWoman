package exercicio.uri.palloma_soares;

import java.util.Scanner;

public class Ex1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diaInicio, diaFinal;
        int hhInicio, mmInicio, ssInicio, hhFinal, mmFinal, ssFinal;
        int qntDia, qntHora, qntMinuto, qntSegundo;
        double restoDiv, total;

        diaInicio = sc.nextInt();
        hhInicio = sc.nextInt();
        mmInicio = sc.nextInt();
        ssInicio = sc.nextInt();

        diaFinal = sc.nextInt();
        hhFinal = sc.nextInt();
        mmFinal = sc.nextInt();
        ssFinal = sc.nextInt();

        int totalD = diaFinal-diaInicio;
        int totalH = hhFinal+hhInicio + (totalD*24);
        int totalM = mmFinal+mmInicio + (totalH*60);
        int totalS = ssFinal+ssInicio + (totalM*60);

        qntDia = totalS / 2592000;
        restoDiv = totalS % 2592000;

        qntHora = (int)(restoDiv / 43200);
        restoDiv = (int)(restoDiv % 43200);

       // qntDia = (qntDia-qntHora);

        qntMinuto = (int)(restoDiv / 60);
        qntSegundo = (int)(restoDiv % 60);

       // total = (diaFinal+diaInicio) + (hhFinal+);
        //qntDia = diaFinal - diaInicio - Math.abs(hhFinal-hhInicio);
        //restoDiv = ;


        System.out.println(qntDia+" dia(s)");
        System.out.println(qntHora+" hora(s)");
        System.out.println(qntMinuto+" minuto(s)");
        System.out.println(qntSegundo+" segundo(s)");

        System.out.println(totalD);
        System.out.println(totalH);
        System.out.println(totalM);
        System.out.println(totalS);


        sc.close();
    }
}
