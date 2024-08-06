package orientacao_obj.poo_i.strings;

public class InverteStr2 {
    public static void main(String[] args) {
        String plv = "renan rodrigues";
        String invertplv = "";

        for (int i = plv.length() - 1; i >= 0; i--) {
            invertplv += plv.charAt(i);
        }
        System.out.println(invertplv);
    }
}