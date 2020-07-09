//	��������
//		�޼ҵ�(�Լ����ƴѵ�..�Լ�) �ӿ��� ���� ����
//		�ʱ�ȭ�� �ϰ� ���(�⺻�� ����)
//		�� �޼ҵ� �����߿� �ӽõ� �ʿ��Ѱ�
//		�� �ൿ�� �ϴ� �߿丸 ���°�

//	�Ķ����
//		�� �޼ҵ� �����ϴµ� �ʿ��� ���
		
//	�������
//		�� ��ü(Ŭ����)�� �Ӽ� : �ڱ�Ұ��ҋ� ����Ҹ��Ѱ�
//		�⺻�� ����(�ڵ� �ʱ�ȭ)

public class Doctor {
	// ������� : �ʿ���µ�?
//	Guest g1; // �ǻ� �Ӽ��� �մ� ������ ���� �̻���..
	
	public void start() {
		Guest g = callGuest();
//		Guest g;
//		g = callGuest();  // �������µ��ȿ��� �մ��� Ȱ��
		ask(g);
		calculate(g);
		tellResult(g);
		
	}
	
	
	public Guest callGuest() {
		return new Guest();
		
		
	}
	
	public void ask(Guest g) { //�մ��� �̽�� ���������
		g.name = g.tellName();
		g.height = g.tellHeight();
		g.weight = g.tellWeight();
	}
	
	public void calculate(Guest g) {
		double hm = g.height / 100;
		g.bmi = g.weight / (hm * hm);
		
		if (g.bmi >= 40) {
			g.status = ("���� �Դϴ�");
		} else if (g.bmi > 35) {
			g.status = ("�ߵ �� �Դϴ�");
		} else if (g.bmi > 30) {
			g.status = ("�浵 �� �Դϴ�");
		} else if (g.bmi > 25) {
			g.status = ("��ü�� �Դϴ�");
		} else if (g.bmi > 18.5) {
			g.status = ("����ü�� �Դϴ�");
		} else {
			g.status = ("��ü�� �Դϴ�");
		} 
		
		
	}
	
	public void tellResult(Guest g) {
		System.out.printf("BMI : %.1f\n", g.bmi);
		System.out.printf("%s���� %s\n", g.name, g.status);
	}
	
	

}
