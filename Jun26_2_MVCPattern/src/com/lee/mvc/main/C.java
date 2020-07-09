package com.lee.mvc.main;

// 파일 하나는 한 사람이 끝내는게 작업하기 편함

// 개발자, 디자이너, 고객, PM, ....

// MVC패턴
//		어떤 파일이 하나 있으면 M/V/C중에 하나의 역할만

// Model : 비즈니스 로직(실제 계산) - 개발자 + 고객
// View : 보여지는 파일(입력, 출력) - 디자이너 
// Controller : 높은 개발자
//		상환판단해서 M이 필요하면 M 소환, V가 필요하면 V소환


public class C {

	public static void main(String[] args) {
		Result r = V.getInput();
		M.calculate(r);
		V.printResult(r);
		

	}

}
