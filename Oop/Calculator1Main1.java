package org.java.Oop;

import java.util.Scanner;

public class Calculator1Main1 {

	public static void main(String[] args) {
		// �μ����� ������(+-*/)�Է¹޾Ƽ� ������ �޼��带 ����
		// �������Է½� �߸��Է� -"������ �Է� ����"
		// while���� �̿��ؼ� ���� �ݺ� --> z�� �Է��ϸ� while���� ���� "���� �մϴ�."
		// �μ��� �Է� setter
		// + sum(), -sub(), *multi(), /div() ȣ�� �ǵ���
		Scanner scn = new Scanner(System.in);
		Calculator1 cal = new Calculator1();

		while (true) {

			System.out.println("ù��° ���� �Է�: ");
			int num1 = scn.nextInt();

			System.out.println("�ι�° ���� �Է�: ");
			int num2 = scn.nextInt();

			System.out.println("�����ڸ� �Է�: ");
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
				System.out.println("���� �մϴ�.");
				break;
			} else {
				System.out.println("������ �Է� ����");

			}
		}
		scn.close();
	}
}
