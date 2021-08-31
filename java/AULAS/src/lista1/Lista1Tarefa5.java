package lista1;

import java.util.Scanner;

public class Lista1Tarefa5 {
	public static void main(String[] args) {
		//variável
		double nota1, nota2, nota3, media, mediaPonderada;
		Scanner leia = new Scanner(System.in);
		
		//entrada
		System.out.print("Coloque a nota 1: ");
		nota1 = leia.nextDouble();
		
		System.out.print("Coloque a nota 2: ");
		nota2 = leia.nextDouble();
		
		System.out.print("Coloque a nota 3: ");
		nota3 = leia.nextDouble();
		
		//processamento
		media = ((nota1 * 2)+(nota2 * 3)+(nota3 * 5))/10;
		
		//saida
		System.out.print("A media ponderada final é: "+media);
		
	}
}
