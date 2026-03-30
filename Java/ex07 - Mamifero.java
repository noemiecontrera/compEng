public class Mamifero extends Animal {
	private String corPelo;
	
	public String getPelo() {
		return this.corPelo;
	}
	public void setPelo(String cp) {
		this.corPelo = cp;
	}
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}
	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}
	@Override
	public void emitirSom() {
		System.out.println("Som mamífero");
		
	}
}