package com.lee.jun15oop.animal;

// public을 써서 외부에서 직접 멤버변수를 건들게 해놓으면
// 잘못된 정보가 들어올 수 있어서 위험

// 캡슐화(encapsulation)
//		1.외부에서 멤버변수를 직접 못건들게
//		2.외부에서 들어올 수 있는 통로 확보(소스->getter, setter/ ctrl shift s)
//		3.그 통로에 안전장치

// JavaBean : 자바기본단위
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
	public String getName() { //콘솔에서 입력할때 b.getName(k.next())
		return name;
	}

	public void setName(String name) { //메인에서 입력할때 b.setName("ㅇㅇ")
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
