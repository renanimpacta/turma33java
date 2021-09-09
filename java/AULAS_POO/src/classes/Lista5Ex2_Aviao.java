package classes;

public class Lista5Ex2_Aviao {
/*
 * Crie uma classe avião e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto avião, defina as instancias deste
	objeto e apresente as informações deste objeto no console.
 */
	
	public String companhia;
	public boolean decolando;
	public boolean tremDePouso;
	public int velocidade;
	
	public void abaixarTremDePouso() {
		System.out.printf("O avião da %s está abaixando o trem de pouso..\n",this.companhia);
		this.tremDePouso = true;
	}
	
	public void levantarTremDePouso() {
		System.out.printf("O avião da %s está levantando o trem de pouso..\n",this.companhia);
		this.tremDePouso = false;
	}
	
	public void decolar() {
		System.out.printf("O avião da %s está decolando..\n",this.companhia);
		this.decolando = true;
		levantarTremDePouso();
	}
	
	public void pousar() {
		System.out.printf("O avião da %s está pousando..\n",this.companhia);
		this.decolando = false;
		abaixarTremDePouso();
	}
	
	public void aumentarVelocidade() {
		System.out.printf("O avião da %s está aumentando a velocidade..\n",this.companhia);
		this.velocidade ++;
		
		if(this.velocidade == 6) {
			decolar();
		}
	}
	
	public void diminuirVelocidade() {
		System.out.printf("O avião da %s está diminuindo a velocidade..\n",this.companhia);
		this.velocidade --;
		
		if(this.velocidade == 5) {
			pousar();
		}
	}
	
}
