public class Caneta {
	public String modelo;
	private double ponta;
	
	public Caneta(String modelo, double ponta) {
		this.modelo = modelo;
		this.ponta = ponta;
	} 
	
	
	public String getModelo() {
		return this.modelo; 
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	public double getPonta(){
		return this.ponta;
	}
	public void setPonta(double p) {
		this.ponta = p;	
		}
	
	//public void status() {
		//System.out.println("Modelo: " + this.modelo);
		//System.out.println("Ponta: " + this.ponta);
		
	
}