package classes;

public class Lista5Ex2_Aviao {
/*
 * Crie uma classe avi�o e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto avi�o, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console.
 */
	
	public String companhia;
	public boolean decolando;
	public boolean tremDePouso;
	public int velocidade;
	
	public void abaixarTremDePouso() {
		System.out.printf("O avi�o da %s est� abaixando o trem de pouso..\n",this.companhia);
		this.tremDePouso = true;
	}
	
	public void levantarTremDePouso() {
		System.out.printf("O avi�o da %s est� levantando o trem de pouso..\n",this.companhia);
		this.tremDePouso = false;
	}
	
	public void decolar() {
		System.out.printf("O avi�o da %s est� decolando..\n",this.companhia);
		this.decolando = true;
		levantarTremDePouso();
	}
	
	public void pousar() {
		System.out.printf("O avi�o da %s est� pousando..\n",this.companhia);
		this.decolando = false;
		abaixarTremDePouso();
	}
	
	public void aumentarVelocidade() {
		System.out.printf("O avi�o da %s est� aumentando a velocidade..\n",this.companhia);
		this.velocidade ++;
		
		if(this.velocidade == 6) {
			decolar();
		}
	}
	
	public void diminuirVelocidade() {
		System.out.printf("O avi�o da %s est� diminuindo a velocidade..\n",this.companhia);
		this.velocidade --;
		
		if(this.velocidade == 5) {
			pousar();
		}
	}
	
}
