package strings;

public class ContarVogais {
    public static void main(String[] args) {
        String palavra = "renan";
        System.out.println("A palavra tem: " + contVogais(palavra) + " vogais ");
    }

    static int contVogais(String palavra) {

        palavra = palavra.toLowerCase();
        String vogais = "aeiou";
        int contvogais = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char vogal = vogais.charAt(i);
            int posicao = palavra.indexOf(vogal);

            // Se a vogais não for encontrada, o método retorna -1.
            // se ele achar por exemplo o A ele retorna a posicao do A
            while (posicao != -1) {
                contvogais++;
                // posicao vai receber a mesma coisa de antes mais começando dela + 1
                posicao = palavra.indexOf(vogal, posicao + 1);
            }
        }
        return contvogais;
    }

}
