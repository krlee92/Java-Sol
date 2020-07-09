package com.lee.uc.student;

public class Student {
	
	private String name;
	private int age;
	private int kor;
	private int eng;
	private int mat;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public void print() {
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
	}
	
	
	

}
