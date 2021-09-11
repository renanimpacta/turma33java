package aplicacoes;

import classes.Lista6Ex2_Cachorro;
import classes.Lista6Ex2_Cavalo;
import classes.Lista6Ex2_Preguica;

public class Lista6Ex2_TesteBichos {
	public static void main(String[] args) {
		
		Lista6Ex2_Cachorro boris = new Lista6Ex2_Cachorro("Boris", 5);
		Lista6Ex2_Cavalo brabo = new Lista6Ex2_Cavalo("Brabo", 7);
		Lista6Ex2_Preguica berenice = new Lista6Ex2_Preguica("Berenice", 9);
		
		brabo.emiteSom();
		brabo.correr();
		
		boris.emiteSom();
		boris.correr();
		
		berenice.subirArvore();
		berenice.emiteSom();
		
	}
}
