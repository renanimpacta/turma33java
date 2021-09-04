package exemplos;

public class laco_faca_enquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variáveis
		int numero = 233;

		// processamento
		do {
			System.out.println(numero);
			if (numero > 299 && numero <= 400) {
				numero = numero + 3;
			} else {
				numero = numero + 5;
			}
		} while (numero <= 456);
		System.out.println(numero);
	}
}
