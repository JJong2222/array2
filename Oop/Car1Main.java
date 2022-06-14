package org.java.Oop;

public class Car1Main {
	public static void main(String[] args) {
		 
		Car1 aCar = new Car1(); // aCar--> 객체참조변수(생성된 객체의 주소값)
		aCar.instansMethod1(); // 객체의 기본값은 null

		aCar.carName = "Acar";
		aCar.carCoin = 10000;
		aCar.carYear = 2020;
		aCar.carwidth = 150;

		Car1.CITY = "서울";
		System.out.println(aCar.CITY);

		aCar.instansMethod1();
		aCar.instansMethod2();
		aCar.instansMethod3();
		aCar.instansMethod4();

		// bCar

		Car1.CITY = "부산";
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

		bCar.setoption1("자동"); //private 멤버 setter
		bCar.setoption2("옵션2");
		
		System.out.println(bCar.getoption1());
		//메서드의 return값은 호출(call)한 곳에 return된다.
		String option1=bCar.getoption1();
		System.out.println(bCar.getoption1());
		bCar.getoption2();
		
	}
}
