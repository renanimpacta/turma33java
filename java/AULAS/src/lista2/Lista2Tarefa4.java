package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Lista2Tarefa4 {
	public static void main(String[] args) {
		/*
		 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		�mpar exiba o n�mero elevado ao quadrado.
		 */
		
		Locale.setDefault(Locale.US); //Define o padr�o n�merico Double com "." ex "3.0"
		
		//vari�veis
		Scanner leia = new Scanner(System.in);
		double numero, raiz;
		
		//entrada
		System.out.println("Digite um n�mero: ");
		numero = leia.nextDouble();
		
		//Processamento
		if((numero%2)==0) {
			raiz = Math.sqrt(numero);
			System.out.printf("%.2f � par e sua ra�z quadrada � aproximadamente %.2f",numero,raiz);
		}
		else if(numero == 0) {
			System.out.println("0 � neuto");
		}
		else if(numero < 0) {
			System.out.println("N�o pode negativo");
		}
		else {
			System.out.printf("%.2f � �mpar",numero);
		}
	}
}
