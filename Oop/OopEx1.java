package org.java.Oop;

public class OopEx1 {
	public static void main(String[] args) {
		System.out.println("프로젝트명 :" + OopEx2.PROJECTNAME);

		// 일반 변수-->
		// 객체 타입 변수-->
		OopEx2 c1 = new OopEx2();
		System.out.println(c1);

		OopEx2 c2 = new OopEx2();
		System.out.println(c2);
	}
}
