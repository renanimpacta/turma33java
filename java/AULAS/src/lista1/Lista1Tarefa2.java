package lista1;

import java.util.Scanner;

public class Lista1Tarefa2 {
	public static void main(String[] args) {
		
		//variaveis
		int idade, mes, dia, diaNasc;
		Scanner leia = new Scanner(System.in);
		
		//entrada
		System.out.print("Qual sua idade em dia?: ");
		diaNasc = leia.nextInt();
		
		//processamento
		idade = diaNasc/365;
		mes = (diaNasc%365)/30;
		dia = (diaNasc%365)%30;
		
		//saida
		System.out.println("Sua idade é aproximadamente "+idade+" anos, "+mes+" mes(es) e"+dia+" dia(s)");
		
	}
}
