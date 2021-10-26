package com.br.orientacaooo.desafio.atividade_hotel.model;

import com.br.orientacaooo.desafio.atividade_hotel.exceptions.ReservationException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        if (!checkOut.after(checkIn)){
            throw new ReservationException("Data de Check-out deve ser maior do que a data de Check-in");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public void updateDates(Date checkIn, Date checkOut) {
        Date now = new Date();// data de hoje para comparação com a regra de datas futuras

        if (checkIn.before(now) || checkOut.before(now)) {
            new ReservationException("As datas para atualização da reserva deverão ser futuras!");
        } else if (!checkOut.after(checkIn)) {
            new ReservationException("Data de Check-out deve ser maior do que a data de Check-in");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    private long duration() {
        long diferencaEntreDatas = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diferencaEntreDatas, TimeUnit.MILLISECONDS);
    }

    @Override
    public String toString() {
        return "Quarto " + roomNumber +
                ", checkIn: " + sdf.format(checkIn) +
                ", checkOut: " + sdf.format(checkOut) +
                ", duração da reserva:  " + duration() + " noite(s)";
    }
}