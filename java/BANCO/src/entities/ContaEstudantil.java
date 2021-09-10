package entities;

public class ContaEstudantil extends Conta {
	
	//atributos
	private double limiteEstudantil;
	
	//costrutor
	public ContaEstudantil(int numero, String cpf, double limiteEstudantil) {
		super(numero, cpf);
		this.limiteEstudantil = limiteEstudantil;
	}
	
	//encapsulamento
	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	//metodos
	public void usarEstudantil(double limiteSolicitado) {
		if(limiteSolicitado <= 0) {
			System.out.println("Entrada inválido");
		}
		else if(limiteSolicitado > this.limiteEstudantil) {
			System.out.println("Limite indisponível");
		}
		else {
			this.limiteEstudantil = this.limiteEstudantil - limiteSolicitado;
			super.credito(getSaldo() + limiteSolicitado);
		}
	}
	
	//seja o que Deus quiser...
}
