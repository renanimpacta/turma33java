package exemplos;

import java.util.Scanner;

public class par_impar {
	public static void main(String[] args) {
		
		//vari�veis
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		//entrada
		System.out.print("Digite um n�mero inteiro positivo: ");
		numero = leia.nextInt();
		
		//operador ten�rio - (condi��o) ? VERDADEIRO : FALSO
		System.out.println(((numero%2) == 0)?"N�mero par":"Numero �mpar");
		
		//processamento
		/*
		if(numero < 0) {
			System.out.println("N�mero negativo");
		}
		else if(numero == 0){
			System.out.println("0 � neutro");
		}
		else if((numero%2) == 0) {
			System.out.printf("%d � par", numero);
		}
		else {
			System.out.printf("%d � �mpar", numero);
		}
		*/
	}
}
