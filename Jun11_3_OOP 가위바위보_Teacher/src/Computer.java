import java.util.Random;

public class Computer {
	
Random brain; // 한명이 바보라고 나머지 유저 다 바보인건 아니므로 static 안씀
	
	public Computer() { // 객체가 만들어질때 뇌도 자동생성.
		brain = new Random();
	}
	public int fire() {
		return brain.nextInt(3) + 1;
		
	}

}
