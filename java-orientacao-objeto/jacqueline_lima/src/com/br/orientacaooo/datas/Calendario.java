package com.br.orientacaooo.datas;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendario {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date data =  Date.from(Instant.parse("2021-06-18T15:52:09Z"));


        System.out.println(sdf.format(data));

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        calendar.setTime(data);
        int minuto = calendar.get(Calendar.MINUTE);
        int mes = 1 + calendar.get(Calendar.MONTH);

        System.out.println("Minutos " + minuto);
        System.out.println("Mes " + mes);
        System.out.println("------------------------------------------------------");

        calendar.add(Calendar.HOUR_OF_DAY, 3);

        data = calendar.getTime();
        System.out.println("Data formatada2 => " + sdf.format(data));
    }
}
