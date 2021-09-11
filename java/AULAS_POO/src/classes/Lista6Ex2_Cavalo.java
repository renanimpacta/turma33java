package classes;

public class Lista6Ex2_Cavalo extends Lista6Ex2_Animal {

	public Lista6Ex2_Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	//metodos
	public void correr() {
		
		System.out.println("Correndo");
	}
	
	@Override // polimorfismo
	public void emiteSom() {
		// TODO Auto-generated method stub
		System.out.println("Rirc rirc.........");
	}

}
