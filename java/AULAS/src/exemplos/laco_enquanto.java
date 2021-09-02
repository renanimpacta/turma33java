package exemplos;

import java.util.Scanner;

public class laco_enquanto {

	public static void main(String[] args) {
		
		//variaveis
		Scanner leia = new Scanner(System.in);
		int contadora=0;
		double numero=0.0, somaTodos=0.0, mediaTodos=0.0;
		
		//entrada / processamento
		while(numero >= 0) {
			System.out.print("Digite um número: ");
			numero = leia.nextDouble();
			
			if(numero >= 0) {
				somaTodos = somaTodos + numero;
				contadora++;
			}
		}
		
		mediaTodos = (somaTodos / contadora);
		
		//saida
		System.out.printf("\nA soma de todos os valores digitados é %.2f ", somaTodos);
		System.out.printf("\nForam lidos %d número no total", contadora);
		System.out.printf("\nA media de todos os valores digitados é %.2f", mediaTodos);
		
		
	}

}
