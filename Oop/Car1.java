package org.java.Oop;

public class Car1 {
	public String carName;
	public int carCoin;
	public int carYear;
	public int carwidth;

	// final����� ������ ���ÿ� �ʱ�ȭ �ؾߵȴ�. ����Ұ�
	// public static final String CITY="����";
	public static String CITY;

	// private setter,getter �޼��� ����
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

	// �ν��Ͻ� ���(�޼���)
	public void instansMethod1() {
		System.out.println("�ڵ����̸�: " + this.carName);
	}

	// �ν��Ͻ� ���(�޼���)
	public void instansMethod2() {
		System.out.println("�ڵ�������: " + this.carCoin);
	}

	// �ν��Ͻ� ���(�޼���)
	public void instansMethod3() {
		System.out.println("�ڵ������: " + this.carYear);
	}

	// �ν��Ͻ� ���(�޼���)
	public void instansMethod4() {
		System.out.println("�ڵ����ʺ�: " + this.carwidth);
	}

}
