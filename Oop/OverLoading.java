package org.java.Oop;

public class OverLoading {

	public void method() { // 선언부
		System.out.println("메서드"); // 구현부
	}

	// 반환 타입과 상이해도 오버로딩 성립하지 않는다
	/*
	 * public int method() { return 0; }
	 */
	public void method(int num1, String name) {
		System.out.println(name + num1);
	}

	// 매개 변수의 이름이 달라도 타입이 같으면 같은 메서드 취급
	/*
	 * public void method(int num2, String name) { system.out.println(name+num1); }
	 */
	public void method(String name, int num1) {
		System.out.println(name + num1);
	}
}
