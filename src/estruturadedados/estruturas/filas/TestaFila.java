package estruturadedados.estruturas.filas;

public class TestaFila {
	public static void main(String[] args) {
		Fila fila = new Fila(3);
		fila.adicionar("Asdrubal");
		fila.adicionar("Plinofélfio");
		fila.adicionar("Kriptovênio");
		fila.exibir();
		if (fila.adicionar("Agamenon")) {
			System.out.println("Tá na fila!");
		} else {
			System.out.println("Fila tá cheia!");
		}
		System.out.println(fila.retirar());
		fila.adicionar("João");
		System.out.println(fila.retirar());
		fila.adicionar("Maria");
		System.out.println(fila.retirar());
		fila.adicionar("José");
		fila.exibir();
	}
}
