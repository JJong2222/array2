package org.java.Oop;

public class ClassBasicMain {
	public static void main(String[] args) {
		// Ŭ���� ���, ��ü�� ���� ���� �ʾƵ� ���,����
		ClassBasic.projectYear = 2022;
		ClassBasic.classMethod();

		// new --> ��ü ����������
		// �ν��Ͻ�(��üȭ)
		ClassBasic class1 = new ClassBasic();
		// �ν��Ͻ� ��� --> ��ü�� ������ �� ���� ����
		class1.userId = "m111";
		class1.userPw = "111";
		class1.userAge = 10;

		System.out.println(class1.userId);
		System.out.println(class1.userPw);
		System.out.println(class1.userAge);

		// private ��� �ʱ�ȭ setters
		class1.setProjectName("JAVAPROJECT2022");
		// pirvate ��� getter
		String projectName = class1.getProjectName();// �޼��带 ȣ�� �ϸ�
		System.out.println(projectName);

		class1.instanceMethod();
		System.out.println("=====================");

		// �ν��Ͻ�(��üȭ)
		ClassBasic class2 = new ClassBasic();
		class2.userId = "a111";
		class2.userPw = "222";
		class2.userAge = 20;
		System.out.println(class2.userId);
		System.out.println(class2.userPw);
		System.out.println(class2.userAge);

		class2.instanceMethod();
	}
}
