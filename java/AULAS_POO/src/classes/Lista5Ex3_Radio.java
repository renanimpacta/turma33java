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
		System.out.println("R�dio ligado");
	}
	
	public void desligar() {
		this.ligado = false;
		System.out.println("R�dio desligado");
	}
	
	public void aumentarVolume() {
		if(this.ligado == true && this.volume<this.potenciaMax) { // S� aumenta o volume se o r�dio estiver ligado
			this.volume++;
			System.out.println(volume);
		
			if(this.volume >= this.potenciaMax) {
				System.out.println("O volume est� no m�ximo");
			}
		}
		else if(this.ligado == false){
			System.out.println("R�dio est� desligado, imposs�vel aumentar volume");
		}
	}
	
	public void diminuirVolume() {
		if(this.volume >0) { //s� diminui o volume se for maior que 0
			this.volume--;
			System.out.println(volume);
			
			if(this.volume == 0) {
				System.out.println("O volume est� no m�nimo");
			}
		}
	}
	
	
}
