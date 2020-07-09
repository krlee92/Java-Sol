package com.lee.jun15oop.animal;

// public�� �Ἥ �ܺο��� ���� ��������� �ǵ�� �س�����
// �߸��� ������ ���� �� �־ ����

// ĸ��ȭ(encapsulation)
//		1.�ܺο��� ��������� ���� ���ǵ��
//		2.�ܺο��� ���� �� �ִ� ��� Ȯ��(�ҽ�->getter, setter/ ctrl shift s)
//		3.�� ��ο� ������ġ

// JavaBean : �ڹٱ⺻����
public class Bug {
	private String name; //1.
	private int size;
	
	public Bug() {
	}

	public Bug(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	
	// 2.
	public String getName() { //�ֿܼ��� �Է��Ҷ� b.getName(k.next())
		return name;
	}

	public void setName(String name) { //���ο��� �Է��Ҷ� b.setName("����")
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if(size < 0) {
			size *= -1;
		} // 3.
		this.size = size;
	}

	
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(size);
	}

}
