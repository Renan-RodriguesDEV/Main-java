package strings;

public class IsEmail {
    public static void main(String[] args) {
        String email = "renanS@gmail.com";
        if (isEmail(email)) {
            System.out.println("e um email");
        } else {
            System.out.println("nao e um email");
        }
    }

    static boolean isEmail(String email) {
        if (email.indexOf("@") != -1 && email.indexOf(".com") != -1) {
            // garante q antes do @ tem 6 caracteres
            if (email.indexOf("@") > 5) {
                return true;
            }
        }
        return false;
    }
}
