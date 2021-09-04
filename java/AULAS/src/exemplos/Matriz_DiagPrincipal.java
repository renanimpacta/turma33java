package exemplos;
import java.util.Random;


public class Matriz_DiagPrincipal {

	public static void main(String[] args) {
		
		 //variaveis
		 Random gerador = new Random();
		
		 int valores[][] = new int[3][3], linha=0, coluna=0;
		 int somaDiag=0, x=0, total=0;

		 //entrada e processamento
		 for(linha=0; linha<3; linha++){
		 	for(coluna=0; coluna<3; coluna++){	
		 		valores[linha][coluna] = gerador.nextInt(50);
		 		System.out.print("["+valores[linha][coluna]+"]");
		 		total = total + valores[linha][coluna];
		 	}
		 	System.out.print("\n");
		 }

		 for(x=0; x<3; x++){
		 	somaDiag = somaDiag + valores[x][x]; //identifica a diago quando LINHA e COLUNA tem o mesmo número
		 }
		 
		 //saida
		 System.out.print("\n");
		 System.out.print("A soma da diagonal prncipal é: "+somaDiag);
		 System.out.print("\n");
		 System.out.print("A soma total é: "+total);

	}

}
