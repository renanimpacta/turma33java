package app;

import java.util.Scanner;

import entities.Conta;

public class ProgramaTeste {

	public static void main(String[] args) {
		
		int numeroConta;
		String cpfConta;
		
		Scanner leia = new Scanner(System.in);
		
		// instanciar - usar - criar objeto
		
		//CLIENTE 1
		System.out.print("Digite o número da conta: ");
		numeroConta = leia.nextInt();
		System.out.print("Digite o CPF da conta: ");
		cpfConta = leia.next();
		
		/*Conta cli1 = new Conta(numeroConta, cpfConta);
		
		
		cli1.credito(100.25);
		cli1.credito(10);
		
		System.out.println(cli1.toString());
		System.out.println("PAGANDO BOLETOS");
		cli1.debito(50);
		System.out.println(cli1.toString());
		cli1.debito(100);
		*/

	}

}
