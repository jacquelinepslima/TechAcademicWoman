package model;


//import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


//@Entity
//@Table(name = "tarefas")
public class Tarefa {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTarefa;
    //@ManyToOne
    private Colaborador colaborador;
    private String descrTarefa;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private String statusTarefa;
    private String prioridadeTarefa;

    public Integer getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(Integer idTarefa) {
        this.idTarefa = idTarefa;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public String getDescrTarefa() {
        return descrTarefa;
    }

    public void setDescrTarefa(String descrTarefa) {
        this.descrTarefa = descrTarefa;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(LocalDateTime dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public String getStatusTarefa() {
        return statusTarefa;
    }

    public void setStatusTarefa(String statusTarefa) {
        this.statusTarefa = statusTarefa;
    }

    public String getPrioridadeTarefa() {
        return prioridadeTarefa;
    }

    public void setPrioridadeTarefa(String prioridadeTarefa) {
        this.prioridadeTarefa = prioridadeTarefa;
    }

    @Override
    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        return "Tarefa{" +
                "idTarefa=" + idTarefa +
                ", colaborador=" + colaborador +
                ", descrTarefa='" + descrTarefa + '\'' +
                ", dataHoraInicio=" + dataHoraInicio.format(formatter) +
                ", dataHoraFim=" + dataHoraFim.format(formatter) +
                ", statusTarefa='" + statusTarefa + '\'' +
                ", prioridadeTarefa='" + prioridadeTarefa + '\'' +
                '}';
    }

    //    public void incluirTarefa() {
//
//    }
//
//    public void alterarTarefa() {
//
//    }
//
//    public void excluirTarefa() {
//
//    }
//
//    public void consultarTarefas() {
//
//    }
//
//    public void consultarTarefa() {
//
//    }

}
