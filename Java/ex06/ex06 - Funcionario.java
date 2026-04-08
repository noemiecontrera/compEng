public class Funcionario extends Pessoa {
	private String setor;
	private boolean trabalhando;
	
	public String getSetor() {
		return this.setor;
	}
	public void setSetor(String s) {
		this.setor = s;
	}
	
	public boolean getTrab() {
		return this.trabalhando;
	}
	public void setTrab(boolean t) {
		this.trabalhando = t;
	}
	public void mudarTrab() {
		if (this.getTrab()) {
			this.setTrab(false);
		} else {
			this.setTrab(true);
		}
	}
	
}
