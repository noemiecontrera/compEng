public class Employee {
	private String name;
	private int age;
	private	double sallary;
	private String location;
	
	public Employee (String name, int age, double sallary, String location) {
		this.name = name;
		this.age= age;
		this.sallary = sallary;
		this.location= location;
	}
	public void raiseSallary() {
		this.sallary = this.sallary * 1.2;
		
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSallary() {
		return sallary;
	}
	public String getLocation() {
		return location;
	}
	
}