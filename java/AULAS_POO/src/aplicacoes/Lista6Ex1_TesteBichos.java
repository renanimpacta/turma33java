package aplicacoes;

	import classes.Lista6Ex1_Cachorro;
	import classes.Lista6Ex1_Cavalo;
	import classes.Lista6Ex1_Preguica;

	public class Lista6Ex1_TesteBichos {

		public static void main(String[] args) {
				
			Lista6Ex1_Cachorro dog1 = new Lista6Ex1_Cachorro("CARAMELO",5);
			Lista6Ex1_Cavalo panga1 = new Lista6Ex1_Cavalo("PÉ-DE-PANO",8);
			Lista6Ex1_Preguica bicho1 = new Lista6Ex1_Preguica ("THE FLASH",6);
		
			panga1.emitirSom();
			
			dog1.emitirSom();
			
			bicho1.emitirSom();
			bicho1.subirArvore();
			
			/*
			System.out.println(panga1.toString());
			panga1.emitirSom();
			*/
		}
	}