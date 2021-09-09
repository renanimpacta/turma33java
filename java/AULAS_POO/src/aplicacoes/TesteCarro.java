package aplicacoes;

import classes.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro meuCarro = new Carro();
		
		meuCarro.cor = "Vermelho";
		meuCarro.modelo = "Passat";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		meuCarro.liga();
		
		meuCarro.acelerar(20);
		System.out.println(meuCarro.velocidadeAtual);
		System.out.println(meuCarro.pegaMarcha());
		
		
		

	}

}
