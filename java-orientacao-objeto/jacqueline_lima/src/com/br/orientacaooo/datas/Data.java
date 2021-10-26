package com.br.orientacaooo.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Data {
    /*
    Doc do java sobre o objeto Date
    https://docs.oracle.com/javase/10/docs/api/java/util/Date.html
    O objeto armazena em milissegundos a meia noite do dia 1 de janeiro de 1970 GMT (UTC)
    UTC - Coordinated Universal Time(time standard)
    GMT - Greenwich Mean Time (time zone)

    Brasil está na zona -3

    https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html

    Define o formata da data ou de um texto
    dd/MM/yyyy -> 07/10/2021
    dd/MM/yyyy HH:mm:ss -> 07/10/2021 14:52:10
     */

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        SimpleDateFormat format3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        format3.setTimeZone(TimeZone.getTimeZone("GTM"));

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis()); //data atual do sistema
        Date x3 = new Date(0L);

        System.out.println("Sem formatação " + x2); //apresento a data com formatacao do java
        System.out.println("Data formatada com padrao dd/M/yyyy HH:mm:ss => " + format3.format(x2)); //com o meu padrao

        System.out.println("---------------------------------------------------");
        System.out.println("x1 " + x1);
        System.out.println("x2 " + x2);
        System.out.println("x3 " + x3);
        System.out.println("---------------------------------------------------");

        Date y1 = format1.parse("18/01/2021");
        Date y2 = format2.parse("18/01/2021 15:52:09");
        Date y3 = Date.from(Instant.parse("2021-06-18T15:52:09Z"));
        System.out.println("y1 " + y1);
        System.out.println("y2 " + y2);
        System.out.println("y3 " + y3);
        System.out.println("---------------------------------------------------");
    }
}
