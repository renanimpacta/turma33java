package lista2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lista2Tarefa2 {
	public static void main(String[] args) {
		
		//variáveis
		Scanner leia = new Scanner(System.in);
		int a,b,c;
		
		try {
		//entradas
		System.out.print("Digite o valor de a: ");
		a = leia.nextInt();
		System.out.print("Digite o valor de b: ");
		b = leia.nextInt();
		System.out.print("Digite o valor de c: ");
		c = leia.nextInt();
		}
		catch (InputMismatchException erro) {
			System.out.println("Digite um número inteiro");
			a=0;
			b=0;
			c=0;
		}
		
		//processamento / saida
		if(a==b && b==c) {
			System.out.printf("%d, %d, %d",a,b,c); // todos os números iguais
		}
		else if (a<=b && b<=c) {
			System.out.printf("%d, %d, %d",a,b,c); // diferentes na ordem 
		}
		else if (a<=c && c<=a) {
			System.out.printf("%d, %d, %d",a,c,b); // diferentes na ordem a,c,b
		}
		else if (b<=a && b<=c && a<=c) {
			System.out.printf("%d, %d, %d",b,a,c); // diferentes na ordem a,c,b
		}
		else if (c<=a && c<=b && b<=a) {
			System.out.printf("%d, %d, %d",c,b,a); // diferentes na ordem a,c,b
		}
		else {
			System.out.printf("%d, %d, %d",c,a,b);
		}
	}
}
