// overloading
// ������ �۾��� �������س�����
//		�������Ҷ� �ڹٰ� �˾Ƽ� �������
public class Dog {
	String name;
	int age;
	
	

	public void print() {
		System.out.println(name);
		System.out.println(age);
	}
	
// ������ overloading
// ��Ŭ�� - source - generate constructor using field
public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



//	 method overloading
//	public void test() {
//
//	}
//
//	public void test(int a) {
//
//	}

	// ������ overloading
	

	public Dog() { // �⺻ ������(default constructor)
		System.out.println("�� ź��");
	}

}
