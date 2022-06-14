package org.java.Oop;

public class ClassBasicMain {
	public static void main(String[] args) {
		// 클래스 멤버, 객체를 생성 하지 않아도 사용,공용
		ClassBasic.projectYear = 2022;
		ClassBasic.classMethod();

		// new --> 객체 생성연산자
		// 인스턴스(객체화)
		ClassBasic class1 = new ClassBasic();
		// 인스턴스 멤버 --> 객체를 생성한 후 접근 가능
		class1.userId = "m111";
		class1.userPw = "111";
		class1.userAge = 10;

		System.out.println(class1.userId);
		System.out.println(class1.userPw);
		System.out.println(class1.userAge);

		// private 멤버 초기화 setters
		class1.setProjectName("JAVAPROJECT2022");
		// pirvate 멤버 getter
		String projectName = class1.getProjectName();// 메서드를 호출 하면
		System.out.println(projectName);

		class1.instanceMethod();
		System.out.println("=====================");

		// 인스턴스(객체화)
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
