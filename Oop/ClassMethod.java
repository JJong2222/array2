package org.java.Oop;

public class ClassMethod {
	public void method1() {
		// 메서드 호출(call)시 실행되는 코드 블럭
		System.out.println("변환값이 없고 입력값이 없다");
		return; // 변환 값이 없다(생략가능)
	}

	public void method2(int num1, int num2) {
		int sum = num1 + num2; // 지역변수(메서드 안에 선언 변수)
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		// return
	}

	// 반환타입 --> 반드시 return값이 있어야함. 입력값이 없다.
	public int method3() {
		int sum = 10 + 200;
		return sum; // 반환타입과 타입이 일치
	}

	// 반환타입 --> 반드시 return값이 있어야함. 입력값이 없다.
	public int method4(int num1, int num2) {
		int sum = num1 + num2; // 구현부
		return sum;
	}

	// 클래스 메서드
	public static void staticMethod() {
		System.out.println("클래스 메서드");
	}

	public static void staticeMethod2(int num1, int num2) {
		System.out.println(num1 + num2);
	}
}
