
// 생성자의 역할은 멤버변수(필드, Property)의 초기화
// 파라미터가 없는 생성자를 기본 생성자라고 한다.
// 파라미터가 없는 기본 생성자는 어떻게 멤버변수를 초기화 할 것인가
public class ConstructiorDemo2 {
	public static void main(String[] args) {
//		Tiger tiger = new Tiger();
//		System.out.println(tiger.age);

		MyCalendar my = new MyCalendar();
		System.out.println(my.year);
	}

}

class Tiger {
	String name;
	int age;
	boolean flag;
	double weight;
	char grade;
}

class MyCalendar {
	int year, month, day;

	public MyCalendar() {};
	public MyCalendar(int year, int month, int day) { // Default Constructor override
		this.year = 2002;
		this.month = 8;
		this.day = 4;
	}
}