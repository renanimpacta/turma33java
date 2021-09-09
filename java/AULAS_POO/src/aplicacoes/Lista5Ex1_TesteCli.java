package aplicacoes;

import classes.Lista5Ex1_Cliente;

public class Lista5Ex1_TesteCli {

	public static void main(String[] args) {
		
		Lista5Ex1_Cliente cli1 = new Lista5Ex1_Cliente("111.125.654-77");
		
		cli1.setAnoNascimento(2000);
		
		System.out.println(cli1.getCpf());
		
		/*
		 * cli1.anoNascimento = 2000;
		cli1.nome = "MARCOS";
		cli1.pronome = '1';
		cli1.cpf = "111.111.111-11";
		
		cli1.ativarCliente();
		System.out.println("Idade do cliente é "+cli1.calculeIdade(2021));
		System.out.printf("Bom dia %s %s",cli1.tratamento(),cli1.nome);
		*/

	}

}
