package lista3;

import java.util.Scanner;

public class Lista3Tarefa6 {
	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
			final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
			0(zero).(DO...WHILE)
		 */
		
		//vari�vel
				Scanner leia = new Scanner(System.in);
				double numero, total=0, media=0, contadora=0;
				
				do {
					System.out.print("Digite um n�mero: ");
					numero = leia.nextDouble();
					
					if(numero%3 == 0 && numero > 0) {
						total = total + numero;
						contadora++;
						System.out.println("Esse � multiplo de 3\n");
					}
					
				}
				while(numero != 0);
				media = total/(contadora-1);
				System.out.printf("Media dos inteiros positivos multiplos de 3: %.2f",media);
		
	}
}
