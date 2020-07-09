// 컴퓨터, 나 : 플레이어
// 심판 : 가위바위보 말하고 판정.
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
