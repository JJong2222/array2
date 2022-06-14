package org.java.Oop;

public class Car1 {
	public String carName;
	public int carCoin;
	public int carYear;
	public int carwidth;

	// final상수는 생성과 동시에 초기화 해야된다. 변경불가
	// public static final String CITY="서울";
	public static String CITY;

	// private setter,getter 메서드 생성
	private String option1;
	private String option2;

	public void setoption1(String option1) {
		this.option1 = option1;
	}

	public String getoption1() {
		return this.option1;
	}
	public void setoption2(String option1) {
		this.option2 = option2;
	}

	public String getoption2() {
		return this.option2;
	}

	// 인스턴스 멤버(메서드)
	public void instansMethod1() {
		System.out.println("자동차이름: " + this.carName);
	}

	// 인스턴스 멤버(메서드)
	public void instansMethod2() {
		System.out.println("자동차가격: " + this.carCoin);
	}

	// 인스턴스 멤버(메서드)
	public void instansMethod3() {
		System.out.println("자동차년식: " + this.carYear);
	}

	// 인스턴스 멤버(메서드)
	public void instansMethod4() {
		System.out.println("자동차너비: " + this.carwidth);
	}

}
