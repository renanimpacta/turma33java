package classes;

public class Lista6Ex2_Cachorro extends Lista6Ex2_Animal{
	
	//construtor
	public Lista6Ex2_Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	//metodo
	public void correr() {
		System.out.println("O cachorro está correndo");
	}
	
	@Override //polimorfismo
	public void emiteSom() {
		// TODO Auto-generated method stub
		System.out.println("Au, au ....");
	}
	
}
