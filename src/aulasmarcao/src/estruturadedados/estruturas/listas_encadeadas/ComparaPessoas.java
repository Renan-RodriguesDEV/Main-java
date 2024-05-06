package estruturas.listas_encadeadas;

public class ComparaPessoas {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Asdrubal", 60.5);
		Pessoa p2 = new Pessoa("Asdrubal", 60);
		if (p1.equals(p2)) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
	}
}
