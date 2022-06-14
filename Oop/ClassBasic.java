package org.java.Oop;

// 사용자 정의 타입
public class ClassBasic {
	// 필드(속성)
	public String userId; // 인스턴스멤버
	public String userPw;// 인스턴스멤버
	public int userAge; // 인스턴스멤버
	private String projectName;// 인스턴스멤버,캡슐화

	public static int projectYear; // 클래스멤버(static)

	// 객체 생성시 필요한 특수한 메서드
	public ClassBasic() {
		System.out.println("생성자");
	}

	// 메서드
	// 인스턴스메서드
	public void instanceMethod() {
		System.out.println("인스턴스메서드");
	}

	public static void classMethod() {
		System.out.println("클래스 메서드");
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectName() {
		return this.projectName;// 호출함 그 곳에 반환한다.
	}


	

}
