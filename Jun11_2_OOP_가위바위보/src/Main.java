// ��ǻ��, �� : �÷��̾�
// ���� : ���������� ���ϰ� ����.
public class Main {

	public static void main(String[] args) {
		Me me = new Me();
		Computer com = new Computer();
		Judge j = new Judge();
		j.start();
		int myAns = me.show();
		int comAns = com.show1();
		j.judge(myAns, comAns);
		
		j.finalJudge(myAns, comAns);
		

	}

}
