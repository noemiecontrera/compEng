public class ContaBanco{
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public ContaBanco (int numConta, String dono) {
		this.numConta = numConta;
		//this.tipo = tipo;
		this.dono = dono;
		this.saldo = 0;
		this.status = false;
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	public void setNumConta(int num) {
		this.numConta = num;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String t) {
		this.tipo = t;
	}
	public String getDono() {
		return this.dono;
	}
	public void setDono(String d) {
		this.dono = d;
	}
	public float getSaldo() {
		return this.saldo;
	}
	public void setSaldo(float valor) {
		this.saldo = valor;
	}
	public boolean getStatus() {
		return this.status;
		
	}
	public void setStatus(boolean s) {
		this.status = s;
	}
	
	public void estadoAtual() {
		System.out.println("--------------------------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	 
	public void abrirConta(String Conta) {
		setTipo(Conta);
		setStatus(true);
		if (Conta == "CC") {
			this.setSaldo(50);
		} else {
			this.setSaldo(150);
		}
	}
	
	public void fecharConta() {
		if (this.getSaldo()> 0) {
			System.out.println("Conta com saldo");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta em débito");
		} else {
			this.setStatus(false);
		}
	}
	
	public void depositar(float valor) {
		if (this.getStatus()) {
		this.setSaldo(this.getSaldo() + valor);
		} else {
			System.out.println("Não é possível realizar o depósito");
		}
	}
	
	public void sacar(float valor) {
		if (this.getStatus()) {
			if (valor > this.getSaldo()) {
				System.out.println("Não é possível sacar");
			} else {
				this.setSaldo(this.getSaldo() - valor);
			}
		} else {
			System.out.println("Não é possível sacar");
		}
	}
		
}