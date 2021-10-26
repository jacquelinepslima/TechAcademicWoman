package exercicio.uri.jacque_lima;

import java.util.Scanner;

public class Ex1061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        int dia1, h1, m1, s1;
        int dia2, h2, m2, s2;
        int dia = 0, h = 0, m = 0, ss = 0;

        s = scanner.next();
        dia1 = scanner.nextInt();

        h1 = scanner.nextInt();
        s = scanner.next();
        m1 = scanner.nextInt();
        s = scanner.next();
        s1 = scanner.nextInt();

        s = scanner.next();
        dia2 = scanner.nextInt();

        h2 = scanner.nextInt();
        s = scanner.next();
        m2 = scanner.nextInt();
        s = scanner.next();
        s2 = scanner.nextInt();

        if (s2 < s1) {
            s += (60 - s1) + s2;
            m--;
        } else if (s2 > s1) {
            ss += s2 - s1;
        } else {
            ss = 0;
        }

        if (m2 < m1) {
            m += (60 - m1) + m2;
            h--;
        } else if (m2 > m1) {
            m += m2 - m1;
        } else {
            m = 0;
        }

        if (h2 < h1) {
            h += (24 - h1) + h2;
            dia--;
        } else if (h2 > h1) {
            h += h2 - h1;
        } else {
            h = 0;
        }

        if (dia2 < dia1) {
            dia += (30 - dia1) + dia2;
        } else if (dia2 > dia1) {
            dia += dia2 - dia1;
        } else {
            dia = 0;
        }


        System.out.print(dia + " dia(s)\n");
        System.out.print(h + " hora(s)\n");
        System.out.print(m + " minuto(s)\n");
        System.out.print(ss + " segundo(s)\n");

    }
}
