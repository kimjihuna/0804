
public class ConstructorDemo3 {
	public static void main(String[] args) {
		Sawon jimin = new Sawon(100000);
	}
}

class Sawon {
	private String name;
	private int salary;

	public Sawon(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public Sawon(String name) {this.name = name;}
	public Sawon(int salary) {this.salary = salary;}
}