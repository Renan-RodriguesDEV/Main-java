package orientacao_obj.poo_i.provas;

import java.time.LocalDate;

public class Gerente extends Funcionario {
    double adicional;

    Gerente(String nome, LocalDate dataAdimin, double salario, double adicional) {
        super(nome, dataAdimin, salario);
        this.adicional = adicional;
    }
}
