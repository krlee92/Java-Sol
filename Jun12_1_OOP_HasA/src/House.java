// House Has A Bug
public class House {
	
	String name; // 속성 : 이 집을 소개할 때 할만한 거
	int floor;
	Bug bug; //변수만 있는거지 실제 벌레는 아직 없음
	
	public House() {
		// TODO Auto-generated constructor stub
	}

	public House(String name, int floor) {
		super();
		this.name = name;
		this.floor = floor;
	}
	
	public void print() {
		System.out.println(name);
		System.out.printf("%d층\n",floor);
		if(bug != null) { // 벌레값이 null이 아닐때에만, bug.print();출력
			bug.print();
		}
	}

}
