package app.Model;

import java.time.LocalDate;

public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private String status;
    private LocalDate dataCriacao;
    private LocalDate dataEntrega;
    private int idUsuarioResponsavel;

    public Tarefa(int id, String titulo, String descricao, String status,
                  LocalDate dataCriacao, LocalDate dataEntrega, int idUsuarioResponsavel) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.dataCriacao = dataCriacao;
        this.dataEntrega = dataEntrega;
        this.idUsuarioResponsavel = idUsuarioResponsavel;
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public int getIdUsuarioResponsavel() {
        return idUsuarioResponsavel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    @Override
    public String toString() {
        return "Tarefa: " + titulo + " | Status: " + status + " | Entrega: " + dataEntrega;
    }
}
