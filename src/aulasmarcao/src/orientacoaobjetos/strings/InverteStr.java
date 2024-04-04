package strings;

public class InverteStr {
    public static void main(String[] args) {
        String texto = "Renan";
        System.out.println(inverter(texto));
    }

    static String inverter(String plv) {
        char[] carac = plv.toCharArray();
        int ini = 0;
        int fim = carac.length - 1;
        while (ini > fim) {
            char aux = carac[ini];
            carac[ini] = carac[fim];
            carac[fim] = aux;
            ini++;
            fim--;
        }

        return new String(carac);
    }
}
