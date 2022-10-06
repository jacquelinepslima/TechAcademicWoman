package exercicio.uri.valquiria_matter;

import java.util.Scanner;

public class Ex1061 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Dia Inicial ");
        int diaInicio = scan.nextInt();

        //limpando o buffer do teclado
        scan.nextLine();

        String horarioInicial = scan.nextLine();

        System.out.print("Dia Final ");
        int diaFinal = scan.nextInt();

        //limpando o buffer do teclado
        scan.nextLine();

        String horarioFinal = scan.nextLine();

        int horasInicio = Integer.parseInt(horarioInicial.substring(0,2));
        int minutosInicio = Integer.parseInt(horarioInicial.substring(5,7));
        int segundosInicio = Integer.parseInt(horarioInicial.substring(10,12));

        int horasFinal = Integer.parseInt(horarioFinal.substring(0,2));
        int minutosFinal = Integer.parseInt(horarioFinal.substring(5,7));
        int segundosFinal = Integer.parseInt(horarioFinal.substring(10,12));

        int totalSegundos = segundosFinal - segundosInicio;
        int totalMinutos = minutosFinal - minutosInicio;
        int totalHoras = horasFinal - horasInicio;
        int totalDias = diaFinal - diaInicio;

        if(totalHoras < 0){
            totalDias --;
            totalHoras += 24;
        }

        System.out.println(totalDias + " dia(s)");
        System.out.println(totalHoras + " hora(s)");
        System.out.println(totalMinutos + " minuto(s)");
        System.out.println(totalSegundos + " segundo(s)");

        scan.close();





    }
}
