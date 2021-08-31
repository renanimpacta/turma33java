package lista1;
import java.util.Scanner;

public class Lista1Tarefa7 {
	public static void main(String[] args) {
		//variaveis
		int a,b,c;
		int d,e,f;
		int x,y;
		
		Scanner leia = new Scanner(System.in);
		
		//entrada
		System.out.print("a: ");
		a = leia.nextInt();
		System.out.print("b: ");
		b = leia.nextInt();
		System.out.print("c: ");
		c = leia.nextInt();
		System.out.print("d: ");
		d = leia.nextInt();
		System.out.print("e: ");
		e = leia.nextInt();
		System.out.print("f: ");
		f = leia.nextInt();
		
		//processamento
		x = ((c*e) - (b*f)) / ((a*e)-(b*d));
		y = ((a*f)-(c*d)) / ((a*e)-(b*d));
		
		c = ((a*x)+(b*y));
		f = ((d*x)+(e*y));
		
		//saida
		System.out.println("O valor de x: "+x);
		System.out.println("O valor de y: "+y);
		
	}
}
