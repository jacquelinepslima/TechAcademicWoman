package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1061 {
    public static void main(String[] args) {

        /*int dia1, hora1, min1, seg1, dia2, hora2, min2, seg2;
        int diasTot = 0;
        int horasTot = 0;
        int minutosTot = 0;
        int segundosTot = 0;
        String entrada;

        Scanner scan = new Scanner(System.in);

        entrada = scan.next();
        dia1 = scan.nextInt();
        hora1 = scan.nextInt();
        entrada = scan.next();
        min1 = scan.nextInt();
        entrada = scan.next();
        seg1 = scan.nextInt();


        entrada = scan.next();
        dia2 = scan.nextInt();
        hora2 = scan.nextInt();
        entrada = scan.next();
        min2 = scan.nextInt();
        entrada = scan.next();
        seg2 = scan.nextInt();


        if(seg2 < seg1){
            segundosTot = (60 - seg2) + seg1;
            minutosTot--;
        } if else(seg2 > seg1){
            segundosTot = seg2 - seg1;
        }
        else{
            segundosTot = 0;
        }

        if(min2 < min1){
            minutosTot = (60 - min2) + min1;
            horasTot--;
        } if else(min2 > min1){
            minutosTot = min2 - min1;
        }
        else{
            minutosTot = 0;
        }

        System.out.println(diasTot + " dias(s)");
        System.out.println(horasTot + " hora(s)");
        System.out.println(minutosTot + " minuto(s)");
        System.out.println(segundosTot + " segundo(s)");

        scan.close();
    }*/

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

        Scanner sc = new Scanner(System.in);

        int dia1, hora1, minuto1, segundo1, dia2, hora2, minuto2, segundo2, diaTot, horaTot, minutoTot, segundoTot, inicio, fim, duracao, resto;
        String entrada;
        entrada = sc.next();
        dia1 = sc.nextInt();
        hora1 = sc.nextInt();
        entrada = sc.next();
        minuto1 = sc.nextInt();
        entrada = sc.next();
        segundo1 = sc.nextInt();
        entrada = sc.next();
        dia2 = sc.nextInt();
        hora2 = sc.nextInt();
        entrada = sc.next();
        minuto2 = sc.nextInt();
        entrada = sc.next();
        segundo2 = sc.nextInt();

        /* w1 * hora * min * seg + x1 * min * seg + y1 * seg + z1
            realizamos a multiplicacao por 24(qtd de horas em um dia),
            multiplicado por 60(qtd de minutos de uma hora),
            multiplicado por 60(qtd de segundos de um minuto).
            As demais variáveis não necessitam de multiplicação por
            quantidade de horas, e assim por diante.

        */
        inicio = dia1*24*60*60 + hora1*60*60 + minuto1*60 + segundo1;
        fim = dia2*24*60*60 + hora2*60*60 + minuto2*60 + segundo2;
        duracao = fim - inicio;
        diaTot = duracao / (24*60*60);
        resto = duracao % (24*60*60);
        horaTot = resto / (60*60);
        resto = resto % (60*60);
        minutoTot = resto / 60;
        segundoTot = resto % 60;
        System.out.println(diaTot + " dia(s)");
        System.out.println(horaTot + " hora(s)");
        System.out.println(minutoTot + " minuto(s)");
        System.out.println(segundoTot + " segundo(s)");


//        int valorEmSegundosDiferencaDias,valorEmSegundosDiferencaHoras,valorEmSegundosDiferencaMinutos,valorDiferencaSegundos;
//        dia1 = scanner.nextLine();
//        dia2 = scanner.nextLine();
//        hora1 = scanner.nextLine();
//        hora2 = scanner.nextLine();
//        //Dia 5
//        valorEmSegundosDiferencaDias=(int) dia1.substring(4,5);

    }
}
