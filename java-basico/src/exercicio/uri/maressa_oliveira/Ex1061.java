package exercicio.uri.maressa_oliveira;

import java.util.Scanner;

public class Ex1061 {
    public static void main(String[] args) {
        String textoDiaUm,textoHorasDiaUm,textoDiaDois,textoHorasDiaDois;
        int primeiroDia,horaPrimeiroDia,minutosPrimeiroDia,segundosPrimeiroDia,segundoDia,horaSegundoDia,minutosSegundoDia,
                segundosSegundoDia, totalSegundos,duracaoDias, duracaoHoras, duracaoMinutos, duracaoSegundos, restoDivisao;
        Scanner scanner = new Scanner(System.in);
        textoDiaUm=scanner.nextLine();
        textoHorasDiaUm=scanner.nextLine();
        textoDiaDois= scanner.nextLine();
        textoHorasDiaDois= scanner.nextLine();
        primeiroDia= Integer.parseInt(textoDiaUm.substring(4,textoDiaUm.length()));
        horaPrimeiroDia=Integer.parseInt(textoHorasDiaUm.substring(0,2));
        minutosPrimeiroDia=Integer.parseInt(textoHorasDiaUm.substring(5,7));
        segundosPrimeiroDia=Integer.parseInt(textoHorasDiaUm.substring(10,12));
        segundoDia=Integer.parseInt(textoDiaDois.substring(4,textoDiaUm.length()));
        horaSegundoDia=Integer.parseInt(textoHorasDiaDois.substring(0,2));
        minutosSegundoDia=Integer.parseInt(textoHorasDiaDois.substring(5,7));
        segundosSegundoDia=Integer.parseInt(textoHorasDiaDois.substring(10,12));
        totalSegundos=(segundoDia-primeiroDia)*86400+(horaSegundoDia-horaPrimeiroDia)*3600+(minutosSegundoDia-minutosPrimeiroDia)*60+(segundosSegundoDia-segundosPrimeiroDia);
        restoDivisao=totalSegundos;
        duracaoDias=restoDivisao/86400;
        restoDivisao=restoDivisao%86400;
        duracaoHoras=restoDivisao/3600;
        restoDivisao=restoDivisao%3600;
        duracaoMinutos=restoDivisao/60;
        duracaoSegundos=restoDivisao%60;
        System.out.println(duracaoDias+" dia(s)");
        System.out.println(duracaoHoras+" hora(s)");
        System.out.println(duracaoMinutos+" minuto(s)");
        System.out.println(duracaoSegundos+" segundo(s)");
        scanner.close();
    }
}
