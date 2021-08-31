package lista1;

import java.util.Scanner;

public class Lista1Tarefa6 {
	public static void main(String[] args) {
		//variaveis
		double x1, x2, y1, y2, d;
		Scanner leia = new Scanner(System.in);
		
		//entradas
		System.out.print("Determine x1: ");
		x1 = leia.nextDouble();
		
		System.out.print("Determine x2: ");
		x2 = leia.nextDouble();
		
		System.out.print("Determina y1: ");
		y1 = leia.nextDouble();
		
		System.out.print("Determine y2: ");
		y2 = leia.nextDouble();
		
		//processamento
		d = Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
		
		//saida
		System.out.println("Resultado: "+d);
		
		
	}
}
