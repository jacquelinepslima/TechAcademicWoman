package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diaInicial, diaFinal, segInicial, segFinal;
        String horaInicial, horaFinal;
        String[] arrayHoraInicial, arrayHoraFinal;
        int calDia, calHora, calMin, calSeg;

        // Entrada inicial do evento
        System.out.print("Dia ");
        diaInicial = scanner.nextInt();
        scanner.nextLine();
        horaInicial = scanner.nextLine();
        arrayHoraInicial = horaInicial.split(" : ");

        // Entrada final do evento
        System.out.print("Dia ");
        diaFinal = scanner.nextInt();
        scanner.nextLine();
        horaFinal = scanner.nextLine();
        arrayHoraFinal = horaFinal.split(" : ");

        // Observação para tratar os espaços
        // Duas maneiras diferentes ^-^
        // .trim() e .split(" : ")

        // Tratando os segundos
        if(Integer.parseInt(arrayHoraInicial[2]) == Integer.parseInt(arrayHoraFinal[2])){
            calSeg = 0;
        } else if(Integer.parseInt(arrayHoraInicial[2]) > Integer.parseInt(arrayHoraFinal[2])) {
            calSeg = Integer.parseInt(arrayHoraInicial[2]) - Integer.parseInt(arrayHoraFinal[2]);
        } else {
            calSeg = Integer.parseInt(arrayHoraFinal[2]) - Integer.parseInt(arrayHoraInicial[2]);
        }

        // Tratando os minutos
        if(Integer.parseInt(arrayHoraInicial[1]) == Integer.parseInt(arrayHoraFinal[1])){
            calMin = 0;
        } else if(Integer.parseInt(arrayHoraInicial[1]) > Integer.parseInt(arrayHoraFinal[1])) {
            calMin = Integer.parseInt(arrayHoraInicial[1]) - Integer.parseInt(arrayHoraFinal[1]);
        } else {
            calMin = Integer.parseInt(arrayHoraFinal[1]) - Integer.parseInt(arrayHoraInicial[1]);
        }

        // Tratando os dias e as horas
        if(Integer.parseInt(arrayHoraInicial[0]) == Integer.parseInt(arrayHoraFinal[0])){
            calHora = 0;
            calDia = diaFinal - diaInicial;
        } else if(Integer.parseInt(arrayHoraInicial[0]) > Integer.parseInt(arrayHoraFinal[0])) {
            calDia = (diaFinal - diaInicial) - 1; // Não fez 24h para fechar um dia
            calHora = 24 - (Integer.parseInt(arrayHoraInicial[0]) - Integer.parseInt(arrayHoraFinal[0]));
        } else {
            calHora = Integer.parseInt(arrayHoraFinal[0]) - Integer.parseInt(arrayHoraInicial[0]);
            calDia = diaFinal - diaInicial;
        }

        // Saída dos resultados
        System.out.println(calDia + " dia(s)");
        System.out.println(calHora + " hora(s)");
        System.out.println(calMin + " minuto(s)");
        System.out.println(calSeg + " segundo(s)");

        scanner.close();
    }
}
