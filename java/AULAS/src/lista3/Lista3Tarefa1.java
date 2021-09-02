package lista3;

public class Lista3Tarefa1 {

	public static void main(String[] args) {
		/*
		 * Informar todos os números de 1000 a 1999 que quando divididos por 11
			obtemos resto = 5. (FOR)
		 */
		
		//Variáveis
		int x=0;
		
		//processamento
		for(x=1000; x<=1999; x++) {
			if((x%11) == 5) {
				System.out.printf("%d \n",x);
			}
		}

	}

}
