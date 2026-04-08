public class Ave extends Animal {
	private String corPena;
	
	public String getPena() {
		return this.corPena;
	}
	public void setPena(String cp) {
		this.corPena = cp;
	}
	public void fazerNinho() {
		System.out.println("Construiu um ninho");
	}
	@Override
	public void locomover() {
		System.out.println("Voando");
	}
	@Override
	public void alimentar() {
		System.out.println("Comida de ave");
	}
	@Override
	public void emitirSom() {
		System.out.println("Som de ave");
		
	}
}