package classes;

public class Lista6Ex2_Animal {
	//atributos
	private String nome;
	private int idade;
	private boolean emiteSom = false;
	private boolean correr = false;
	
	//construtor
	public Lista6Ex2_Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	//encpsulamento
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isEmiteSom() {
		return emiteSom;
	}
	public void setEmiteSom(boolean emiteSom) {
		this.emiteSom = emiteSom;
	}
	public boolean isCorrer() {
		return correr;
	}
	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	//metodos
	public void emiteSom() {
		System.out.println("Emitindo som...");
	}
}
