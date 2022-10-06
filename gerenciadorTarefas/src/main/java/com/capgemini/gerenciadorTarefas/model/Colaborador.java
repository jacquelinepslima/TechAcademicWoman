package com.capgemini.gerenciadorTarefas.model;

import javax.persistence.*;

@Entity
@Table(name = "colaboradores")
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idColaborador;
    private String nomeColaborador;

    public int getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(int idColaborador) {
        this.idColaborador = idColaborador;
    }

    public String getNomeColaborador() {
        return nomeColaborador;
    }

    public void setNomeColaborador(String nomeColaborador) {
        this.nomeColaborador = nomeColaborador;
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "idColaborador=" + idColaborador +
                ", nomeColaborador='" + nomeColaborador + '\'' +
                '}';
    }

    //        public void incluirColaborador() {
//
//        }
//
//        public void alterarColaborador() {
//
//        }
//
//        public void excluirColaborador() {
//
//        }
//
//        public void consultarColaboradores() {
//
//        }
//
//        public void consultarColaborador() {
//
//        }

}




