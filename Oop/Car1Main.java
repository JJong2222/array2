package org.java.Oop;

public class Car1Main {
	public static void main(String[] args) {
		 
		Car1 aCar = new Car1(); // aCar--> ��ü��������(������ ��ü�� �ּҰ�)
		aCar.instansMethod1(); // ��ü�� �⺻���� null

		aCar.carName = "Acar";
		aCar.carCoin = 10000;
		aCar.carYear = 2020;
		aCar.carwidth = 150;

		Car1.CITY = "����";
		System.out.println(aCar.CITY);

		aCar.instansMethod1();
		aCar.instansMethod2();
		aCar.instansMethod3();
		aCar.instansMethod4();

		// bCar

		Car1.CITY = "�λ�";
		System.out.println(aCar.CITY);

		Car1 bCar = new Car1();
		bCar.carName = "Bcar";
		bCar.carCoin = 50000;
		bCar.carYear = 2022;
		bCar.carwidth = 200;


		bCar.instansMethod1();
		bCar.instansMethod2();
		bCar.instansMethod3();
		bCar.instansMethod4();

		bCar.setoption1("�ڵ�"); //private ��� setter
		bCar.setoption2("�ɼ�2");
		
		System.out.println(bCar.getoption1());
		//�޼����� return���� ȣ��(call)�� ���� return�ȴ�.
		String option1=bCar.getoption1();
		System.out.println(bCar.getoption1());
		bCar.getoption2();
		
	}
}
