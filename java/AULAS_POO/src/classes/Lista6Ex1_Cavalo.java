package classes;

	public class Lista6Ex1_Cavalo extends Lista6Ex1_Animal {

		public Lista6Ex1_Cavalo(String nome, int idade) {
			super(nome, idade);
			// TODO Auto-generated constructor stub
		}
		
		public void correr() {
			System.out.println("Cavalo correndo....");
		}
		@Override 
		public void emitirSom() {
			System.out.println("Irccccc irccccc.");
		}

	}	

