package org.java.Oop;

public class Class1 {
	public int num1;
	public int num2;
	private String key;
	public static final String PROJECTNAME = "JAVAPROJECT2022";

	public void instansMethod() {
		System.out.println("return�� ���� �ν��Ͻ� �޼���");
	}

	public int instansMethod2() {
		System.out.println("return���� int �ν��Ͻ� �޼���");
		return this.num1 + this.num2;
	}

	public static void classMethod() {
		System.out.println("Ŭ���� �޼���");
	}

	// setters --> private ��� �ʱ�ȭ
	public void setKey(String key) {
		this.key = key;
		//return;
	}
	// getters --> private ��� get
	public String getKey() {
		return this.key;
	}
}
