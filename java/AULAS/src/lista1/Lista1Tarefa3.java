package lista1;

import java.util.Scanner;

public class Lista1Tarefa3 {
	public static void main(String[] args) {
		//variaveis
		int totalSegundos, tempoHoras, tempoMinutos, tempoSegundos;
		Scanner leia = new Scanner(System.in);
		
		//entrada
		System.out.print("Coloque o tempo do evento em segundos: ");
		totalSegundos = leia.nextInt();
		
		//processamento
		tempoHoras = totalSegundos/3600;
		tempoMinutos = (totalSegundos%3600)/60;
		tempoSegundos = (totalSegundos%3600)%60;
		
		//saida
		System.out.println("O evento teve "+tempoHoras+" horas, "+tempoMinutos+" minutos e "+tempoSegundos+" segundos");
		
	}
}
