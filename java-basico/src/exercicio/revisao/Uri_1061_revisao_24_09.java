package exercicio.revisao;

/*
Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril, iniciando e
terminando dentro do mês. O problema é que Pedrinho quer calcular o tempo que o evento vai durar, uma vez
que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a calcular
a duração deste evento.

Entrada
Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no qual
o evento vai começar. Na linha seguinte, será informado o momento no qual o evento vai iniciar,
no formato hh : mm : ss. Na terceira e quarta linha de entrada haverá outra informação no mesmo formato
das duas primeiras linhas, indicando o término do evento.

Entrtada:
Dia 5
08 : 12 : 23
Dia 9
06 : 13 : 23

Saída:
3 dia(s)
22 hora(s)
1 minuto(s)
0 segundo(s)

* */

import java.util.Scanner;

public class Uri_1061_revisao_24_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia1, dia2, hora1, hora2, min1, min2, seg1, seg2, dia = 0, hora = 0, min = 0, seg = 0;
        String entrada;

        entrada = scanner.next();
        dia1 = scanner.nextInt();

        hora1 = scanner.nextInt();
        entrada = scanner.next();
        min1 = scanner.nextInt();
        entrada = scanner.next();
        seg1 = scanner.nextInt();

        entrada = scanner.next();
        dia2 = scanner.nextInt();

        hora2 = scanner.nextInt();
        entrada = scanner.next();
        min2 = scanner.nextInt();
        entrada = scanner.next();
        seg2 = scanner.nextInt();


        if (seg2 < seg1) {  //
            seg += (60 - seg1) + seg2;
            min--;
        } else if (seg2 > seg1) {
            seg += seg2 - seg1;
        } else {
            seg = 0;
        }

        if (min2 < min1) {
            min += (60 - min1) + min2;
            hora--;
        } else if (min2 > min1) {
            min += min2 - min1;
        } else {
            min = 0;
        }

        if (hora2 < hora1) {
            hora += (24 - hora1) + hora2;
            dia--;
        } else if (hora2 > hora1) {
            hora += hora2 - hora1;
        } else {
            hora = 0;
        }

        if (dia2 == dia1) {
            dia = 0;
        } else {
            dia += dia2 - dia1;
        }

        System.out.println(dia + " dia(s)");
        System.out.println(hora + " hora(s)");
        System.out.println(min + " minuto(s)");
        System.out.println(seg + " segundo(s)");


        scanner.close();
    }
}
