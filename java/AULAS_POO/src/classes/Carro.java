package classes;

public class Carro {
	public String cor;
	public String modelo;
	public double velocidadeAtual;
	public double velocidadeMaxima;
	
	public void liga() {
		System.out.println("O carro est� ligado...");
	}
	
	public void acelerar(double quantidade) {
		double velocidadeNova = this.velocidadeAtual+quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	
	public int pegaMarcha() {
		if(this.velocidadeAtual<0) {
			return -1;
		}
		if(this.velocidadeAtual>=0 && this.velocidadeAtual<40) {
			return 1;
		}
		return 3;
	}
}
