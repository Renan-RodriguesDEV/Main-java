package aulasmarcao.src.estruturadedados.arrays;

public class SemRepeticoes {
  public static void main(String[] args) {
    int[] dados = { 1, 1, 1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 9, 9, 9, 9 };
    semRepeticoes(dados);
  }

  static void semRepeticoes(int[] dados) {
    int pos = 0;

    do {
      int numero = dados[pos];
      System.out.println(numero);
      pos++;
      while (pos < dados.length && dados[pos] == numero) {
        pos++;
      }
    } while (pos < dados.length);
  }
}
