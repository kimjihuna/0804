
public class Employee {
	private String empno;
	private String name;
	private int salaray;
	private String hiredate;
	
	Employee(String empno, String name){  //Constructor  생성자
		System.out.println("방금 객체가 생성되었습니다");
		this.empno = empno;
		this.name = name;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalaray(int salaray) {
		this.salaray = salaray;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public void myPrint() {
		System.out.printf("%s %s %d %s\n", this.empno, this.name, this.salaray, this.hiredate);
	}
}
