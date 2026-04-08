public class Reptil extends Animal {
	private String corEscama;
	
	public String getEscama() {
		return this.corEscama;
	}
	public void setEscama(String cp) {
		this.corEscama = cp;
	}
	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}
	@Override
	public void alimentar() {
		System.out.println("Comida de réptil");
	}
	@Override
	public void emitirSom() {
		System.out.println("Som de réptil");
		
	}
}