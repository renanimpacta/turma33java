import java.util.Scanner;

public class CelciusFaren {
	
	public static void main(String[] args) {
		 
		//Variaveis
		Scanner leia = new Scanner(System.in);
		String nome;
		double fahrenheit;		
		
		//Entrada
		System.out.print("Digite o nome: ");
		nome = leia.next().toUpperCase();
		
		System.out.print("Coloque a temperatura em Fahrenheit: ");
		fahrenheit = leia.nextDouble();
		
		//Saida
		System.out.print("Oi "+nome+", a temperatura em graus celsius é "+((fahrenheit - 32)/1.8));
		
	}

}
