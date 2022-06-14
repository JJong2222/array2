package org.java.Oop;

import java.util.Scanner;

public class Calculator1Main1 {

	public static void main(String[] args) {
		// 두숫자의 연산자(+-*/)입력받아서 각각의 메서드를 실행
		// 연산자입력시 잘못입력 -"연산자 입력 오류"
		// while문을 이용해서 무한 반복 --> z를 입력하면 while문을 종료 "종료 합니다."
		// 두숫자 입력 setter
		// + sum(), -sub(), *multi(), /div() 호출 되도록
		Scanner scn = new Scanner(System.in);
		Calculator1 cal = new Calculator1();

		while (true) {

			System.out.println("첫번째 숫자 입력: ");
			int num1 = scn.nextInt();

			System.out.println("두번째 숫자 입력: ");
			int num2 = scn.nextInt();

			System.out.println("연산자를 입력: ");
			String op = scn.next();

			cal.setNum1(num1);
			cal.setNum2(num2);

			if (op.equals("+")) {
				cal.sum();
			} else if (op.equals("-")) {
				System.out.println(cal.getNum1() + "-" + cal.getNum2() + "=" + cal.sub());
			} else if (op.equals("/")) {
				System.out.println(cal.getNum1() + "/" + cal.getNum2() + "=" + cal.div());
			} else if (op.equals("*")) {
				System.out.println(cal.getNum1() + "*" + cal.getNum2() + "=" + cal.multi());
			} else if (op.equals("z")) {
				System.out.println("종료 합니다.");
				break;
			} else {
				System.out.println("연산자 입력 오류");

			}
		}
		scn.close();
	}
}
