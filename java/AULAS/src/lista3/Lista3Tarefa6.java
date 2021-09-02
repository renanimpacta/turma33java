package lista3;

import java.util.Scanner;

public class Lista3Tarefa6 {
	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba vários números inteiros no teclado. E no
			final imprimir a média dos números múltiplos de 3. Para sair digitar
			0(zero).(DO...WHILE)
		 */
		
		//variável
				Scanner leia = new Scanner(System.in);
				double numero, total=0, media=0, contadora=0;
				
				do {
					System.out.print("Digite um número: ");
					numero = leia.nextDouble();
					
					if(numero%3 == 0 && numero > 0) {
						total = total + numero;
						contadora++;
						System.out.println("Esse é multiplo de 3\n");
					}
					
				}
				while(numero != 0);
				media = total/(contadora-1);
				System.out.printf("Media dos inteiros positivos multiplos de 3: %.2f",media);
		
	}
}
