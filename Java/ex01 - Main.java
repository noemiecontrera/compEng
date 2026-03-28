public class Main{
	public static void main(String[] args) {
		Employee employee1 = new Employee("Noemi", 19, 2500, "Brazil");
		Employee employee2 = new Employee("Nicole", 15, 1200, "New Zeland");
		
		employee2.raiseSallary();
		
		System.out.println(employee1.getSallary());
		System.out.println(employee2.getSallary());				
	}
}