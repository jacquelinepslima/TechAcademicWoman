package com.br.orientacaooo.desafio.consultorio_dentista.server;

import com.br.orientacaooo.desafio.consultorio_dentista.dao.DentistaDAO;
import com.br.orientacaooo.desafio.consultorio_dentista.model.Dentista;

import java.util.Date;
import java.util.Scanner;

public class PrincipalConsultorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        Dentista a = new Dentista("João", "Alves", "Ortodontia", 1, true);
        Dentista b = new Dentista("Aline", "Souza", "Periontodontia", 1, true);
        Dentista c = new Dentista("Afonso", "Antunes", "Cirurgia", 1, false);
        Dentista d = new Dentista("Joana", "Lima", "Ortodontia", 1, true);


        /* DentistaDAO dDAO = new DentistaDAO();
        dDAO.marcarConsultaPaciente(a);
        dDAO.marcarConsultaPaciente(b);
        dDAO.marcarConsultaPaciente(c);
        dDAO.marcarConsultaPaciente(d);

        dDAO.atenderPaciente();

        System.out.println();

        System.out.println("Qual consulta será remarcada: ");

        dDAO.remarcarConsultaPaciente(new Date(), a);

        System.out.println();

        System.out.println("Qual consulta será cancelada:");
        int codigo = sc.nextInt();
        dDAO.cancelarConsultaPaciente(codigo);

        dDAO.atenderPaciente();*/

        sc.close();
    }
}
