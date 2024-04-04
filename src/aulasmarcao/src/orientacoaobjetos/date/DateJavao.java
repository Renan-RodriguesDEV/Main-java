package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateJavao {
    public static void main(String[] args) {
        Date data = new Date();

        System.out.println(data);

        Calendar calendario = new GregorianCalendar();

        SimpleDateFormat sf = new SimpleDateFormat("dd/MMM/yyyy");
        System.out.println(sf.format(calendario.getTime()));

        int dia = calendario.get(Calendar.DAY_OF_WEEK);
        int mes = calendario.get(Calendar.MONTH);
        int ano = calendario.get(Calendar.YEAR);
        int hora = calendario.get(Calendar.HOUR);
        int mm = calendario.get(Calendar.MINUTE);

        String[] diaNome = { "", "seg", "ter", "qua", "qui", "sex", "sab" };
        String[] mesNome = { "", "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" };

        if (hora < 12) {
            System.out.println(
                    "Bom dia, " + diaNome[dia] + " / " + mesNome[mes] + " " + ano + "  "
                            + hora + ":" + mm);
        }
        if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde, " + diaNome[dia] + " / " + mesNome[mes] + " " + ano + "  " + hora);
        } else if (hora >= 18) {
            System.out.println("Boa noite, " + diaNome[dia] + " / " + mesNome[mes] + " " + ano + "  " + hora);
        }

    }
}
