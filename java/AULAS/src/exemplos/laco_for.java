package exemplos;

public class laco_for {

	public static void main(String[] args) {
		
		//variaveis
		int numero, somaImpar = 0;
		//totalizadora
		somaImpar = 0;
		
		//processamento
		for(int x=1; x<=500; x++) {
			if((x%2) != 0 && (x%3) == 0) {
				somaImpar = somaImpar + x;
			}
		}
		
		System.out.printf("O resultado é %d", somaImpar);

	}

}
