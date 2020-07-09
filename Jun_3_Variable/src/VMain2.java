
public class VMain2 {

	public static void main(String[] args) {
		// 핸드폰 모델명 저장
		//어디서 샀는지 저장
		//얼마주고 샀는지 저장
		//화면 몇인치
		//할부 남았나
		
		String model = "Galaxy S7edge";
		String where = "기억상실";
		int howMuch = 60;
		double inch = 6.1;
		boolean loanExgistance = false; //할부
		
		System.out.println("모델명 	:" + model);
		System.out.printf("모델명  :%s\n", model);
		
		System.out.println("어디서 	:" + where);
		System.out.printf("%s에서 샀음\n", where);
		
		System.out.printf("가격	:%d만원\n", howMuch);
		System.out.printf("%d원 주고 샀음\n", howMuch);
		
		System.out.printf("인치	:%.2f인찌\n", inch);
		
		System.out.println("할부남았나 	:" + loanExgistance);
		
		
		

	}

}
