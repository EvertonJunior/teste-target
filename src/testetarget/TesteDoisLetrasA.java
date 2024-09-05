package testetarget;

public class TesteDoisLetrasA {
	public static void main(String[] args) {
		String texto = "Checked Exceptions sao exceções verificadas pelo compilador, "
				+ "significa que é obrigatório elas serem tratadas com throws ou usando try-catch";

		if (texto.toLowerCase().contains("a")) {
			int quantidade = 0;
			for (int i = 0; i < texto.length(); i++) {
				if (texto.toLowerCase().charAt(i) == 'a') {
					quantidade += 1;
				}
			}
			System.out.printf("A letra 'a' contem no texto e ela aparece %d vezes\n", quantidade);

		}

		else {
			System.out.println("A letra 'a' nao aparece no texto");
		}
	}
}
