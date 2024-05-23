package aulasmarcao.src.orientacoaobjetos.provas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Teste {

    public static void main(String[] args) {
        Gerente gr = new Gerente("carlos", LocalDate.now(), 1800, 110);
        System.out.println(gr.getDataAdimin());
        SimpleDateFormat myDate = new SimpleDateFormat("2005-02-20 13:30:00");
        System.out.println(myDate.toPattern());
        gr.setDataAdimin(LocalDate.parse("2005-02-20"));
        System.out.println(gr.getDataAdimin());
        gr.setDataAdimin(LocalDate.of(2000, 12, 20));
        System.out.println(gr.getDataAdimin());
    }

}
