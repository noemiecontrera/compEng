public final class Main {
	public static void main(String [] args) {
		Mamifero animal1 = new Mamifero();
		Reptil animal2 = new Reptil();
		Peixe animal3 = new Peixe();
		Ave animal4 = new Ave();
		
		animal1.setPeso(30.5f);
		animal1.setIdade(5);
		animal1.setMembros(4);
		animal1.locomover();
		animal1.emitirSom();
		System.out.println("----------------------------");
		
		animal2.setPeso(0.35f);
		animal2.setIdade(2);
		animal2.setMembros(0);
		
		animal3.setPeso(0.35f);
		animal3.setIdade(2);
		animal3.setMembros(0);
		animal3.locomover();
		animal3.emitirSom();
		animal3.soltarBolha();
		
		animal4.setPeso(0.35f);
		animal4.setIdade(2);
		animal4.setMembros(0);
		 
	}
}