package org.java.Oop;

public class ClassMethod {
	public void method1() {
		// �޼��� ȣ��(call)�� ����Ǵ� �ڵ� ��
		System.out.println("��ȯ���� ���� �Է°��� ����");
		return; // ��ȯ ���� ����(��������)
	}

	public void method2(int num1, int num2) {
		int sum = num1 + num2; // ��������(�޼��� �ȿ� ���� ����)
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		// return
	}

	// ��ȯŸ�� --> �ݵ�� return���� �־����. �Է°��� ����.
	public int method3() {
		int sum = 10 + 200;
		return sum; // ��ȯŸ�԰� Ÿ���� ��ġ
	}

	// ��ȯŸ�� --> �ݵ�� return���� �־����. �Է°��� ����.
	public int method4(int num1, int num2) {
		int sum = num1 + num2; // ������
		return sum;
	}

	// Ŭ���� �޼���
	public static void staticMethod() {
		System.out.println("Ŭ���� �޼���");
	}

	public static void staticeMethod2(int num1, int num2) {
		System.out.println(num1 + num2);
	}
}
