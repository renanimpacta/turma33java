package classes;

	public class Lista6Ex1_Cachorro extends Lista6Ex1_Animal {

		public Lista6Ex1_Cachorro(String nome, int idade) {
			super(nome, idade);
			
		}

		public void correr() {
			System.out.println("Cachorro correndo....");
		}
		
		@Override
		public void emitirSom() {
			System.out.println("au au au au....");
		}

	}
