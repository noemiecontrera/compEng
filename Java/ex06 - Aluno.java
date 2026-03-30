public class Aluno extends Pessoa {
	private int matricula;
	private String  curso;
	
	public int getMatr() {
		return this.matricula;
	}
	public void setMatr(int m) {
		this.matricula = m;
	}
	public String getCurso() {
		return this.curso;
	}
	public void setCurso(String c) {
		this.curso = c;
	}
	
	public void cancelarMatr() {
		System.out.println("Matrícula cancelada");
	}
}