package ch6;

public class CallStackTest {

	public static void main (String[] args) {
		firstMethod(); // static메서드는 객체 생성없이 호출가능하다.
	}
	
	static void firstMethod () {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}
