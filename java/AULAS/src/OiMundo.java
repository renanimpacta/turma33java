import java.util.Scanner;

public class OiMundo {
	
	public static void main(String[] args) {
		
		//Variaveis
		Scanner leia = new Scanner(System.in); // instanciamento
		String nome;
		int anoNascimento=1974;
		int anoAtual=2021;
		
		//Entradas
		System.out.print("Digite o nome: ");
		nome = leia.next().toUpperCase();
		System.out.print("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		//saida
		System.out.println(nome+" sua idade é "+(anoAtual-anoNascimento)+" anos");
		System.out.println("O nome da pessoa digitada tem o total de letras: "+nome.length());
		
		
	}

}
