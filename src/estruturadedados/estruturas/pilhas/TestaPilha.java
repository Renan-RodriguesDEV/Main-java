package estruturadedados.estruturas.pilhas;

public class TestaPilha {
	public static void main(String[] args) {
		Pilha pilha = new Pilha(3);
		pilha.push("Asdrubal");
		pilha.push("Plinofélfio");
		pilha.push("Kriptovênio");
		pilha.exibir();
		if (pilha.push("Agamenon")) {
			System.out.println("Tá na pilha!");
		} else {
			System.out.println("Pilha tá cheia!");
		}
		System.out.println(pilha.pop());
		pilha.push("João");
		System.out.println(pilha.pop());
		pilha.push("Maria");
		System.out.println(pilha.pop());
		pilha.push("José");
		pilha.exibir();
		System.out.println(pilha.pop());
		pilha.exibir();
	}
}
