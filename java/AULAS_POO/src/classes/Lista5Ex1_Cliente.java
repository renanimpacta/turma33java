package classes;

public class Lista5Ex1_Cliente {
	
	//atributos
	private String cpf;
	private String nome;
	private int anoNascimento;
	private boolean ativo;
	private char pronome;
	
	//construtor
	public Lista5Ex1_Cliente(String cpf) {
		this.cpf = cpf;
	}


	//encapsulamento
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public char getPronome() {
		return pronome;
	}
	public void setPronome(char pronome) {
		this.pronome = pronome;
	}
	
	
	//metodos
	
	public int calculeIdade() {
		
		return (2021-this.anoNascimento);
	}
	
	
	public int calculeIdade(int anoAtual) {
		
		return (anoAtual-this.anoNascimento);
	}
	
	
	public void ativarCliente() {
		ativo = true;
	}
	
	
	public void desativarCliente() {
		ativo = false;
	}
	
	
	public String tratamento(char codigo) {
		String resposta ="";
		if(codigo == '1') {
			resposta = "Senhor";
		}
		else if (codigo == '2') {
			resposta = "Senhora";
		}
		else if (codigo == '3') {
			resposta = "Sehore";
		}
		else {
			resposta = "Senhorx";
		}
		return resposta;
	}
	
	
	public String tratamento() {
		String resposta ="";
		if(this.pronome == '1') {
			resposta = "Senhor";
		}
		else if (this.pronome == '2') {
			resposta = "Senhora";
		}
		else if (this.pronome == '3') {
			resposta = "Sehore";
		}
		else {
			resposta = "Senhorx";
		}
		return resposta;
	}
}
