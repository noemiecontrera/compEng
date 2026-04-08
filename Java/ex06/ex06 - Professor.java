public class Professor extends Pessoa {
	private String especial;
	private float salario;
	
	public String getEspec() {
		return this.especial;
	}
	public void setEspec(String esp) {
		this.especial = esp;
	}
	public float getSalario() {
		return this.salario;
	}
	public void setSalario (float s) {
		this.salario = s;
	}
	public void receberAum(float valor) {
		this.setSalario(this.getSalario() + valor); 
		System.out.println("Novo sálario: "+ this.getSalario());
		
	}



}