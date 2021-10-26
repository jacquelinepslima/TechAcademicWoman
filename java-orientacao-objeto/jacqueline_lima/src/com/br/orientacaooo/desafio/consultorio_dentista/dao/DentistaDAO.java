package com.br.orientacaooo.desafio.consultorio_dentista.dao;

import com.br.orientacaooo.desafio.consultorio_dentista.model.Consulta;
import com.br.orientacaooo.desafio.consultorio_dentista.model.Dentista;

import java.util.ArrayList;
import java.util.Date;

public class DentistaDAO {
    ArrayList<Consulta> consultas = new ArrayList<Consulta>();

    public void atenderPaciente(){
        // TODO: 21/09/2021 implementar metodo do

        System.out.println("Agenda: ");
        for (Consulta consulta : consultas) {
            System.out.print(consulta.getData() + " ");
            System.out.print(consulta.getCodigo() + " ");
            System.out.print(consulta.getDentista() + " ");
            System.out.print(consulta.getPaciente() + " ");
            System.out.println();
        }
    }


    /* public void marcarConsultaPaciente(Consulta consulta){
        // TODO: 21/09/2021 implementar metodo do
        this.consultas.add(consulta);
    }
    public void remarcarConsultaPaciente(Date dataNova, Dentista dentista){
        // TODO: 21/09/2021 implementar metodo do

        dentista.setData(dataNova);
    }

    public void cancelarConsultaPaciente(int numeroRegistro){
        // TODO: 21/09/2021 implementar metodo do

        for (Dentista dentista: consultas) {
            if (dentista.getNumeroRegistro() == numeroRegistro) {
                consultas.remove(dentista);
                break;
            }
        }
    }

    public String verificarDisponibilidade(){
        // TODO: 21/09/2021 implementar metodo do

        return "Em congresso";
    } */
}
