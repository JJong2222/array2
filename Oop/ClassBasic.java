package org.java.Oop;

// ����� ���� Ÿ��
public class ClassBasic {
	// �ʵ�(�Ӽ�)
	public String userId; // �ν��Ͻ����
	public String userPw;// �ν��Ͻ����
	public int userAge; // �ν��Ͻ����
	private String projectName;// �ν��Ͻ����,ĸ��ȭ

	public static int projectYear; // Ŭ�������(static)

	// ��ü ������ �ʿ��� Ư���� �޼���
	public ClassBasic() {
		System.out.println("������");
	}

	// �޼���
	// �ν��Ͻ��޼���
	public void instanceMethod() {
		System.out.println("�ν��Ͻ��޼���");
	}

	public static void classMethod() {
		System.out.println("Ŭ���� �޼���");
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectName() {
		return this.projectName;// ȣ���� �� ���� ��ȯ�Ѵ�.
	}


	

}
