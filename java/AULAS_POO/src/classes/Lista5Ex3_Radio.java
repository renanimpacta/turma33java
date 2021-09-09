package classes;

public class Lista5Ex3_Radio {
	
	public int potenciaMax;
	public String cor;
	public int volume;
	public boolean ligado;
	
	public Lista5Ex3_Radio(int potenciaMax, String cor, int volume, boolean ligado) {
		this.potenciaMax = potenciaMax;
		this.cor = cor;
		this.volume = volume;
		this.ligado = ligado;
		
	}
	
	public void ligar() {
		this.ligado = true;
		System.out.println("Rádio ligado");
	}
	
	public void desligar() {
		this.ligado = false;
		System.out.println("Rádio desligado");
	}
	
	public void aumentarVolume() {
		if(this.ligado == true && this.volume<this.potenciaMax) { // Só aumenta o volume se o rádio estiver ligado
			this.volume++;
			System.out.println(volume);
		
			if(this.volume >= this.potenciaMax) {
				System.out.println("O volume está no máximo");
			}
		}
		else if(this.ligado == false){
			System.out.println("Rádio está desligado, impossível aumentar volume");
		}
	}
	
	public void diminuirVolume() {
		if(this.volume >0) { //só diminui o volume se for maior que 0
			this.volume--;
			System.out.println(volume);
			
			if(this.volume == 0) {
				System.out.println("O volume está no mínimo");
			}
		}
	}
	
	
}
