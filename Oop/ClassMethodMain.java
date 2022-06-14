package org.java.Oop;

public class ClassMethodMain extends Object {

	public int n1;
	public int n2;
	public static int n3;

	public void s1() {
		n1 = 10;
		n2 = 20;
		n3 = 100;
	}

	public static void main(String[] args) {

		ClassMethod c1 = new ClassMethod();

		c1.method1(); // call
		c1.method2(100, 200);

		int sum = c1.method3();
		System.out.println(c1.method3());
		System.out.println(sum);

		int sum2 = c1.method4(200, 3000);
		System.out.println(c1.method4(300, 500));
		System.out.println(sum2);

		// 클래스 메서드 호출
		ClassMethod.staticMethod();
		ClassMethod.staticeMethod2(100, 200);

	}
}
