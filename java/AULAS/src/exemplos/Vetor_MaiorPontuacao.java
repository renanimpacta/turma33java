package exemplos;

import java.util.Scanner;

public class Vetor_MaiorPontuacao {

	public static void main(String[] args) {
		
		//variáveis
		Scanner leia = new Scanner(System.in);
		
		
		int valores[] = new int[5];
		int x, maiorNumero = 0;
		
		//entrada e processamento
		for(x=0; x<=4; x++) {
			System.out.print("Digite um valor: ");
			valores[x] = leia.nextInt();
			
		}
		System.out.println(" ");
		
		for(x=0; x<=4; x++) {
			System.out.print("["+valores[x]+"]");
			
			if(valores[x] > maiorNumero) { //inversão
				maiorNumero = valores[x];
			}
		}
		
		System.out.println(" ");
		System.out.println("O maior valor desse vetor é: "+maiorNumero);
	}

}


