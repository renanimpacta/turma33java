package lista1;

import java.util.Locale;
import java.util.Scanner;

public class Lista1Tarefa7 {
	public static void main(String[] args) {
		//variaveis
		Locale.setDefault(Locale.US); //Localização //PERFUMARIA
		
		double a,b,c;
		double d,e,f;
		double x,y;
		
		Scanner leia = new Scanner(System.in); //instancia
		
		//PRINTF:
			//-- CLASSE String
			//cadeia = String %s
			//-- TIPO
			//inteiro = int %d
			//real = double %f = %2.f
			//caracter = char %c
			//logico = boolean %b
		
		//entrada
		System.out.print("a: ");
		a = leia.nextDouble();
		System.out.print("b: ");
		b = leia.nextDouble();
		System.out.print("c: ");
		c = leia.nextDouble();
		System.out.print("d: ");
		d = leia.nextDouble();
		System.out.print("e: ");
		e = leia.nextDouble();
		System.out.print("f: ");
		f = leia.nextDouble();
		
		//processamento
		x = ((c*e) - (b*f)) / ((a*e)-(b*d));
		y = ((a*f)-(c*d)) / ((a*e)-(b*d));
		
		c = ((a*x)+(b*y));
		f = ((d*x)+(e*y));
		
		//saida
		System.out.printf("O valor de x: %.2f"+x);
		System.out.printf("O valor de y: %.2f",y); //FAMOSO PRINT F
		
		// %s - String - texto
		// %d - int - numero inteiro
		// %f [%.2f] - double - numero real
		
	}
}
