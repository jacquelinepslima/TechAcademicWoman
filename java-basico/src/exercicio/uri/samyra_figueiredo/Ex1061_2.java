package exercicio.uri.samyra_figueiredo;

import java.util.Scanner;

public class Ex1061_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Dia Inicial ");
        int diaInicio = scan.nextInt();

        //limpando o buffer do teclado
        scan.nextLine();

        String horarioInicial = scan.nextLine();

        Scanner y = new Scanner(horarioInicial).useDelimiter("\\s*:\\s*");
        int horasInicio = y.nextInt();
        int minutosInicio = y.nextInt();
        int segundosInicio = y.nextInt();

        //String input = "1 fish 2 fish red fish blue fish";
        //Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");

        System.out.print("Dia Final ");
        int diaFinal = scan.nextInt();

        //limpando o buffer do teclado
        scan.nextLine();

        String horarioFinal = scan.nextLine();

        Scanner z = new Scanner(horarioFinal).useDelimiter("\\s*:\\s*");
        int horasFinal = z.nextInt();
        int minutosFinal = z.nextInt();
        int segundosFinal = z.nextInt();

        int totalSegundos = segundosFinal - segundosInicio;
        int totalMinutos = minutosFinal - minutosInicio;
        int totalHoras = horasFinal - horasInicio;
        int totalDias = diaFinal - diaInicio;

        if(totalHoras < 0){
            totalDias --;
            totalHoras += 24;
        }

        System.out.println("");

        System.out.println(totalDias + " dia(s)");
        System.out.println(totalHoras + " hora(s)");
        System.out.println(totalMinutos + " minuto(s)");
        System.out.println(totalSegundos + " segundo(s)");

        scan.close();

    }
}
