package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "colaboradores")
public class Colaborador {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idColaborador;
    private String nomeColaborador;
    private Date dataNascimento = new Date();
    
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

    public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
    public String toString() {
        return "Colaborador{" +
                "idColaborador=" + idColaborador +
                ", nomeColaborador='" + nomeColaborador + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }

 
}




