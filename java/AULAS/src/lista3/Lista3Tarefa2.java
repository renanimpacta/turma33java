package lista3;

public class Lista3Tarefa2 {
	public static void main(String[] args) {
		/*
		 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 */
		
		//vari�veis
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
		
		System.out.printf("%d n�mero s�o pares\n",totalPar);

		System.out.printf("%d n�mero s�o �mpares\n",totalImpar);
	}
}
