public class Peixe extends Animal {
	private String corEscama;
	
	public String getEscama() {
		return this.corEscama;
	}
	public void setEscama(String cp) {
		this.corEscama = cp;
	}
	public void soltarBolha() {
		System.out.println("Soltando bolha");
	}
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}
	@Override
	public void alimentar() {
		System.out.println("Algas");
	}
	@Override
	public void emitirSom() {
		System.out.println("Peixe não emite som");
		
	}
}