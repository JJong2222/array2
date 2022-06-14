package org.java.Oop;

public class classMain {
	public static void main(String[] args) {
		
		// 인스턴스화(객체화)
		// new 객체생성 연산자
		// 인스턴스 변수 c1 객체의 주소
		// 객체. --> 객체 접근 연산자
		Class1 c1=new Class1();
		// num1,num2,key를 초기화 기록 콘솔에 출력
		c1.num1=100;
		c1.num2=200;
		c1.setKey("key2");// private setters

		System.out.println(c1.num1);
		System.out.println(c1.num2);
		System.out.println(c1.getKey());// private getters
		
		Class1 c2 = new Class1();
		c2.num1 =200;
		c2.num2 = 1000;
		c2.setKey("key3");
		
		System.out.println(c2.num1);
		System.out.println(c2.num2);
		System.out.println(c2.getKey());// private getters
		
		System.out.println(c1.equals(c2));
		// 클래스 멤버 --> 인스턴스 생성 없이 사용,
//		System.out.println(Class1.PROJECTNAME);
//		Class1.classMethod();
//		
//		c1.setKey("JAVAPROJECT2022");
//		String key = c1.getKey();
//		System.out.println(key);
		
	}
}
