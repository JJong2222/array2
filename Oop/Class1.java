package org.java.Oop;

public class Class1 {
	public int num1;
	public int num2;
	private String key;
	public static final String PROJECTNAME = "JAVAPROJECT2022";

	public void instansMethod() {
		System.out.println("return이 없는 인스턴스 메서드");
	}

	public int instansMethod2() {
		System.out.println("return값이 int 인스턴스 메서드");
		return this.num1 + this.num2;
	}

	public static void classMethod() {
		System.out.println("클래스 메서드");
	}

	// setters --> private 멤버 초기화
	public void setKey(String key) {
		this.key = key;
		//return;
	}
	// getters --> private 멤버 get
	public String getKey() {
		return this.key;
	}
}
