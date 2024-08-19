package main.orientacao_obj.poo_i.provas;

import java.time.LocalDate;

public class Funcionario {
    private String nome;

    public String getNome() {
        return nome;
    }

    public LocalDate dataAdimin;
    public double salario;

    public Funcionario(String nome, LocalDate dataAdimin, double salario) {
        this.nome = nome;
        this.dataAdimin = dataAdimin;
        this.salario = salario;
    }

    public LocalDate getDataAdimin() {
        return dataAdimin;
    }

    public void setDataAdimin(LocalDate dataAdimin) {
        this.dataAdimin = dataAdimin;
    }
}
