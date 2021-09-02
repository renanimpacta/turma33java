package lista3;

public class Lista3Tarefa2 {
	public static void main(String[] args) {
		/*
		 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		 */
		
		//variáveis
		int y, totalPar=0, totalImpar=0;
		
		//processamento
		for(y=1; y<=10; y++) {
			if((y%2) == 0) {
				totalPar = totalPar + 1;
			}
			else {
				totalImpar = totalImpar + 1;
			}
		}
		
		System.out.printf("%d número são pares\n",totalPar);

		System.out.printf("%d número são ímpares\n",totalImpar);
	}
}
