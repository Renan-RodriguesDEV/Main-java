package orientacao_obj.poo_ii.javaswing;


public class Calculos {
	public static boolean isPar(int n) {
		if (n % 2 == 0)
			return true;
		return false;
	}

	public static long fatorial(int n) {
		long fat = 1;
		for (int cont = 1; cont <= n; cont++) {
			fat *= cont;
		}
		return fat;
	}

	public static boolean isPrimo(int n) {
		if (n == 1)
			return false;
		for (int cont = 2; cont <= Math.sqrt(n); cont++) {
			if (n % cont == 0) {
				return false;
			}
		}
		return true;
	}

	public static int log2(int n) {
		int qtdDiv = 0;
		while (n >= 2) {
			n /= 2;
			qtdDiv++;
		}
		return qtdDiv;
	}
}
