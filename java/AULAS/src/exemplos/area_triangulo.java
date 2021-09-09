package exemplos;

import java.util.Scanner;

public class area_triangulo {
	public static void main(String[] args) {
		/*
		 * Receber valores de base e altura de um 
		 * tri�ngulo e verificar se s�o valores v�lidos (positivos maiores que zero). 
		 * Em caso afirmativo, calcular a �rea do tri�ngulo.
	
		 */
		
		
		//variaveis
		Scanner leia = new Scanner(System.in);
		
		double base1=0, altura1=0, base2=0, altura2=0;
		double area1=0, area2=0;
		
		//entrada
		System.out.print("Digite a base do tri�ngulo 1: ");
		base1 = leia.nextDouble();
		System.out.print("Digite a altura do tri�ngulo 1: ");
		altura1 = leia.nextDouble();
		System.out.print("Digite a base do tri�ngulo 2: ");
		base2 = leia.nextDouble();
		System.out.print("Digite a altura do tri�ngulo 2: ");
		altura2 = leia.nextDouble();
		
		//processamento
		if(base1 > 0 && altura1 > 0 && base2 > 0 && altura2 > 0) {
			area1 = (base1*altura1)/2;
			area2 = (base2*altura2)/2;
		}
		else {
			System.out.println("Valor inv�lido!");
		}
		
		//saida
		if(area1 > area2) {
			System.out.printf("area tri�ngulo 1: %.2f | area tri�ngulo 2: %.2f - TRIANGULO 1 MAIOR", area1, area2);
		}
		else if(area2 > area1) {
			System.out.printf("Area tri�ngulo 1: %.2f | Area tri�ngulo 2: %.2f - TRIANGULO 2 MAIOR", area1, area2);
		}
		else {
			System.out.println("Triagulo 1 e Tri�ngulo 2 s�o iguais");
		}
	}
}
