package org.java.Oop;

public class classMain {
	public static void main(String[] args) {
		
		// �ν��Ͻ�ȭ(��üȭ)
		// new ��ü���� ������
		// �ν��Ͻ� ���� c1 ��ü�� �ּ�
		// ��ü. --> ��ü ���� ������
		Class1 c1=new Class1();
		// num1,num2,key�� �ʱ�ȭ ��� �ֿܼ� ���
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
		// Ŭ���� ��� --> �ν��Ͻ� ���� ���� ���,
//		System.out.println(Class1.PROJECTNAME);
//		Class1.classMethod();
//		
//		c1.setKey("JAVAPROJECT2022");
//		String key = c1.getKey();
//		System.out.println(key);
		
	}
}
