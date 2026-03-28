public class Main{
	public static void main(String[] args) {
		ContaBanco conta1 = new ContaBanco(01,"Noemi Contrera");
		
		conta1.abrirConta("CP");
		conta1.depositar(50);
		conta1.sacar(20);
		conta1.estadoAtual();
		
		ContaBanco conta2 = new ContaBanco(02, "Nicole Contrera");
		conta2.abrirConta("CP");
		conta2.depositar(50);
		conta2.sacar(35);
		conta2.sacar(165);
		conta2.fecharConta();
		conta2.estadoAtual();
		}
}