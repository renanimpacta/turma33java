package exemplos;

import java.util.Scanner;

public class par_impar {
	public static void main(String[] args) {
		
		//variáveis
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		//entrada
		System.out.print("Digite um número inteiro positivo: ");
		numero = leia.nextInt();
		
		//operador tenário - (condição) ? VERDADEIRO : FALSO
		System.out.println(((numero%2) == 0)?"Número par":"Numero ímpar");
		
		//processamento
		/*
		if(numero < 0) {
			System.out.println("Número negativo");
		}
		else if(numero == 0){
			System.out.println("0 é neutro");
		}
		else if((numero%2) == 0) {
			System.out.printf("%d é par", numero);
		}
		else {
			System.out.printf("%d é ímpar", numero);
		}
		*/
	}
}
