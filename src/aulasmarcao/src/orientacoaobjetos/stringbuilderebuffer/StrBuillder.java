package stringbuilderebuffer;

public class StrBuillder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String plv = "renan trem bala";
        sb = new StringBuilder(plv);
        System.out.println(sb.append(" do rio"));
        System.out.println(sb.capacity());

    }

}