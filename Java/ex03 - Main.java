public class Main{
	public static void main(String [] args) { 
		Caneta caneta1 = new Caneta("BIC", 0.5);
		//caneta1.setModelo("");
		//caneta1.setPonta();
		System.out.println("Modelo: " + caneta1.getModelo());
		System.out.println("Ponta: " + caneta1.getPonta()); 
		
	}
}